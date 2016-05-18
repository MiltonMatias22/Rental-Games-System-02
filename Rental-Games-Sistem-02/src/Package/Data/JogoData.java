/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Data;

import java.sql.PreparedStatement;
import Package.Model.Jogo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

//import Package.Model.Jogo;

/**
 *
 * @author Milton Matias
 */
public class JogoData {
    
    public boolean inserirRegistro(Jogo jogo)throws SQLException{//para tratar o sql
    Conexao con = new Conexao();
    String sql = "insert into jogos (idJogo,nomeJogo,anoLancamentoJogo,valorAluguelJogo,"+
                 "StatusJogo,exemplaresJogo,idCategoria,idFabricante) "+
                 "value(?,?,?,?,?,?,?,?)";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        
        PS.setInt(1,jogo.getIdJogo());
        PS.setString(2,jogo.getNomeJogo());
        PS.setString(3,jogo.getAnoLancamentoJogo());
        PS.setDouble(4,jogo.getValorAluguelJogo());
        PS.setInt(5,jogo.getStatusJogo());       
        PS.setString(6,jogo.getExemplaresJogo());
        PS.setString(7,jogo.getCategoriaJogo());        
        PS.setString(8,jogo.getFabricanteJogo());
        
        
        int registros = PS.executeUpdate();
        if(registros > 0){
          JOptionPane.showMessageDialog(null,"Registro inserido com suceesso!");
        return true;
        }else{
        JOptionPane.showMessageDialog(null,"Registro não foi inserido!");
        return false;
        }
        
    }//ffim método inserir
    
    public Vector pesquisar(String objetoPesquisa) throws Exception{
        Conexao con = new Conexao();
        Vector dadosCliente = new Vector();
        String sql = "select * from clientes where nomeJogo like '"+objetoPesquisa+"%'";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        ResultSet RS = PS.executeQuery();
        while(RS.next()){
            Vector novaLinha = new Vector();//cria um vetor com 4 linhas
            novaLinha.add(RS.getInt("idJogo"));
            novaLinha.add(RS.getString("nomeJogo"));
            novaLinha.add(RS.getString("anoLancamentoJogo"));
            novaLinha.add(RS.getDouble("valoAluguelJogo"));
            novaLinha.add(RS.getInt("StatusJogo"));
            novaLinha.add(RS.getString("exemplaresJogo"));
            novaLinha.add(RS.getString("idCategoria"));
            novaLinha.add(RS.getString("idFabricante"));
            dadosCliente.add(novaLinha);
        }
        return dadosCliente;
    }
    
    public boolean  atualizar(Jogo jogo)throws Exception{
        Conexao con = new Conexao();
        String sql = "update jogos set nomeJogo=? anoLancamentoJogo=? valouAluguelJogo=? "+
                      "statusJogo=? exemplaresJogo=? idCategoria=? idFabricante=? "+
                      "where idJogo=?";
        PreparedStatement PS = con.getConexao().prepareStatement(sql);
        
        PS.setString(1,jogo.getNomeJogo());
        PS.setString(2,jogo.getAnoLancamentoJogo());
        PS.setDouble(3,jogo.getValorAluguelJogo());
        PS.setInt(4,jogo.getStatusJogo());       
        PS.setString(5,jogo.getExemplaresJogo());        
        PS.setString(6,jogo.getFabricanteJogo());
        PS.setString(7,jogo.getCategoriaJogo());
        PS.setInt(8,jogo.getIdJogo());
                
        int registros = PS.executeUpdate();
        if(registros > 0){
          JOptionPane.showMessageDialog(null,"Registro Atualizado com suceesso!");
        return true;
        }else{
        JOptionPane.showMessageDialog(null,"Registro não foi inserido!");
        return false;
        }
    }//fim método atalizar
}//Fim clas jogoData
