/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Model;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton Matias
 */
public class Conexao {
 
private final String driver = "com.mysql.jdbc.Driver";
private final String url = "jdbc:mysql://localhost/NomeBanco";
private final String user = "root";
private final String password = "";
private Conexao conexao;




}//fim calsse Conexao
