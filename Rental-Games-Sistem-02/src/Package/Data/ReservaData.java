/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Data;

import Package.Model.Reserva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Milton Matias
 */
public class ReservaData {
    public boolean inserirRegistroReserva(Reserva reserva) throws Exception{
        Conexao con = new Conexao();
        String sql = "insert into reserva(idReservas,dataReserva,dataPrevista,"+
                     "valorReserva,idItemReserva,idCliente) values(?,?,?,?,?,?)";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setInt(1, reserva.getIdReserva());
        PS.setString(2, reserva.getDataReserva());
        PS.setString(3, reserva.getDataPrevista());
        PS.setDouble(4, reserva.getValorReserva());
        PS.setInt(5, reserva.getIdItemReserva());
        PS.setInt(6, reserva.getIdCliente());
        
        int registro = PS.executeUpdate();
        
        if(registro > 0){
         return true;   
        }else{
            return false;
        }
        
    }
    
    public boolean AtualizarRegistroReserva(Reserva reserva) throws Exception{
        Conexao con = new Conexao();
        String sql = "update reserva set dataReserva=?,dataPrevista=?,"+
                     "valorReserva=?,idItemReserva=?,idCliente=? where idReservas = ? ";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        
        PS.setString(1, reserva.getDataReserva());
        PS.setString(2, reserva.getDataPrevista());
        PS.setDouble(3, reserva.getValorReserva());
        PS.setInt(4, reserva.getIdItemReserva());
        PS.setInt(5, reserva.getIdCliente());
        PS.setInt(6, reserva.getIdReserva());
        int registro = PS.executeUpdate();
        
        if(registro > 0){
         return true;   
        }else{
            return false;
        }
        
    }
    public Vector pesquisar(String objetoPesquisa) throws Exception{
        Conexao con = new Conexao();
        Vector dadosCliente = new Vector();
        String sql = "select * from reserva where dataReserva like '"+objetoPesquisa+"%'";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        ResultSet RS = PS.executeQuery();
        
        while(RS.next()){
            Vector novaLinha = new Vector();//cria um vetor com 4 linhas
            novaLinha.add(RS.getInt("ID"));
            novaLinha.add(RS.getString("Data da Reserva"));
            novaLinha.add(RS.getString("Data Prevista"));
            novaLinha.add(RS.getString("Valor da Reserva"));
            novaLinha.add(RS.getString("Código do Item"));
            novaLinha.add(RS.getString("Cliente"));
            dadosCliente.add(novaLinha);
        }
        return dadosCliente;
    }
    
    public boolean excluirRegistroReserva(Reserva reserva) throws Exception{
        Conexao con = new Conexao();
        String sql = "delete from reserva where idReservas = ? ";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setString(1, reserva.getDataReserva());
        int registro = PS.executeUpdate();
        
        if(registro > 0){
         return true;   
        }else{
            return false;
        }
    }
    
}
