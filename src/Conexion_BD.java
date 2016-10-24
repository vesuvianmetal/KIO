
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Penudo McFly
 */
public class Conexion_BD {
   Connection conn = null;
   public static Connection conector(){
       
       try {
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Samuel\\Documents\\NetBeansProjects\\Elecciones\\Elecciones.sqlite");
      JOptionPane.showMessageDialog(null, "Conexion Establecida");
           return conn;
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
    
   
}

