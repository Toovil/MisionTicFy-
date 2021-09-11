/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JVDA_
 */
public class Conector {
    private static Connection conn;
    
    public static void conectar(){
        String dbURL = "jdbc:mysql://localhost:3306/productos";
        String username = "root";
        String password = "j7t9v8lJ@";
        try{
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn != null){
                System.out.println("CONECTADO");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } 
    }
     
     public static Connection getConn() {
        return conn;
    }
    
}
