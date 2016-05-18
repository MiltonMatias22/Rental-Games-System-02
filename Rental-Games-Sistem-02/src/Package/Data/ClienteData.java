/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Data;

import Package.Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton Matias
 */
public class ClienteData {
    
    public boolean inserirRegistro(Cliente cliente) throws SQLException{
        Conexao con = new Conexao();
        
        String sql = "insert into clientes(idCliente,nomeCliente,telefoneCliente,"+
                     "emailCliente) values (?,?,?,?)";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        
        PS.setInt(1, cliente.getIdCliente());
        PS.setString(2, cliente.getNomeCliente());
        PS.setString(3, cliente.getTelefone());
        PS.setString(4,cliente.getEmail());
        
        int registros = PS.executeUpdate();
        if(registros > 0){
            JOptionPane.showMessageDialog(null,"Class Data: Registro inserido com suceesso!");
        return true;
        }else{
        JOptionPane.showMessageDialog(null,"class Data: Registro não foi inserido!");
            return false;
        }       
    }//Fim método inserirRegistro()!
    public Vector pesquisar(String objetoPesquisa) throws Exception{
        Conexao con = new Conexao();
        Vector dadosCliente = new Vector();
        String sql = "select * from clientes where nomeCliente like '"+objetoPesquisa+"%'";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        ResultSet RS = PS.executeQuery();
        
        while(RS.next()){
            Vector novaLinha = new Vector();//cria um vetor com 4 linhas
            novaLinha.add(RS.getInt("idCliente"));
            novaLinha.add(RS.getString("nomeCliente"));
            novaLinha.add(RS.getString("telefoneCliente"));
            novaLinha.add(RS.getString("emailCliente"));
            dadosCliente.add(novaLinha);
        }
        return dadosCliente;
    }
    
    public boolean excluir(int id_Cliente) throws Exception{
        Conexao con = new Conexao();
        String sql = "delete from clientes where idCliente = ?";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setInt(1, id_Cliente);
        
        int registro = PS.executeUpdate();
        if(registro > 0){
         return true;   
        }else{
         return false;   
        }
        
    }
    
    public boolean atualizar(Cliente cliente) throws Exception{
        Conexao con = new Conexao();
        String sql = "update clientes set nomeCliente = ?, telefoneCliente = ?, emailCliente = ? where idCliente =?";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        PS.setString(1, cliente.getNomeCliente());
        PS.setString(2, cliente.getTelefone());
        PS.setString(3, cliente.getEmail());
        PS.setInt(4, cliente.getIdCliente());
        
        int registro = PS.executeUpdate();
        if(registro > 0){
         return true;   
        }else{
         return false;   
        }
    }
}
