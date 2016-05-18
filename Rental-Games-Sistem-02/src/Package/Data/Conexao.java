/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Data;


import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton Matias
 */
public class Conexao {
private static Connection conexao;// declarando variável estática do tipo Connection
private static final String driver = "com.mysql.jdbc.Driver";
private static final String url = "jdbc:mysql://127.0.0.1:3306/databaserentalgamessystem";
private static final String user = "root";
private static final String password = "";

public Conexao(){

    try {
        //Primeiramente a Class.forName(driver) deverar ser Circundado com o try catch
        //em sseguida add um catch para a conexao
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,user,password);
//        JOptionPane.showMessageDialog(null,"Conexão Realizada com Sucesso!");
    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null,"Falha no Driver, Class.forName!"+
ex.getMessage());
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Falha na conexão com o banco!"+
ex.getMessage());
    }
  
}//fim método Conexao

public Connection getConexao(){
return conexao;
}//fim método getConexao

//    public static void main(String[] args) {
//        Conexao con = new Conexao();
//        con.getConexao();
//    }
}//Fim classe Conexao
