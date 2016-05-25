/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Data;

import Package.Model.Locacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Milton Matias
 */
public class LocacaoData {
    public boolean inserirRegistroLocacao(Locacao locacao)throws Exception{
        Conexao con = new Conexao();
        String sql = "insert into locacao (idLocacao,valorLocacao,"+
                     "dataDevolucao,idItensLocacao,idCliente) values(?,?,?,?,?)";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setInt(1, locacao.getIdLocacao());
        PS.setDouble(2, locacao.getValorTotalLocacao());
        PS.setString(3, locacao.getDataDevolucao());
        PS.setInt(4, locacao.getIdItensLocacao());
        PS.setInt(5, locacao.getIdCliente());
        
        int registro = PS.executeUpdate();
        if(registro > 0){
            return true;   
        }else{
            return false;
        }
        
    }//fim método inserirRegistroLocacao()
    
    public boolean atualizarRegistroLocacao(Locacao locacao) throws Exception{
        Conexao con = new Conexao();
        String sql = "update locacao set valorLocacao=?, dataLocacao=?, "+
                     "dataDevolucao=?, idItensLocacao=?, idCliente=? where idLocacao=?";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
                
        PS.setDouble(1, locacao.getValorTotalLocacao());
        PS.setString(2, locacao.getDataLocacao());
        PS.setString(3, locacao.getDataDevolucao());
        PS.setInt(4, locacao.getIdItensLocacao());
        PS.setInt(5, locacao.getIdCliente());
        PS.setInt(6, locacao.getIdLocacao());
        
        int registro = PS.executeUpdate();
        if(registro > 0){
            return true;   
        }else{
            return false;
        }
    }//fim método atualizarRegistroLocacao()
    
    public boolean excluirRegistroLocacao(int idLocacao)throws Exception{
        Conexao con = new Conexao();
        String sql = "delete from locacao where idLocacao=?";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setInt(1, idLocacao);
        int registro = PS.executeUpdate();
        if(registro > 0){
            return true;   
        }else{
            return false;
        }
    }//fim método excluirRegistroLocacao()
    
    public Vector pesquisarRegistroLocacao(int id_Cliente)throws Exception{
        Conexao con = new Conexao();
        Vector dadosLocacao = new Vector();
        String sql = "select * from locacao where idCliente like '"+id_Cliente+"%'";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        ResultSet RS = PS.executeQuery();
        
        while(RS.next()){
           Vector novaLinha = new Vector();
           novaLinha.add(RS.getInt("idLocacao"));
           novaLinha.add(RS.getDouble("valorLocacao"));
           novaLinha.add(RS.getString("dataLocacao"));
           novaLinha.add(RS.getString("dataDevolucao"));
           novaLinha.add(RS.getInt("idItensLocacao"));
           novaLinha.add(RS.getInt("idCliente"));
           dadosLocacao.add(novaLinha);
        }
        return dadosLocacao;
    }
}
