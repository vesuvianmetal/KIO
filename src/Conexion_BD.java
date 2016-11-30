
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion_BD {
 Connection conn = null;
  public static Connection conectardb(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql:///kiosko","root", "123456");
    JOptionPane.showMessageDialog(null, "Conexion Establecida");
          return conn;
      } catch (ClassNotFoundException | SQLException | HeadlessException e){
          JOptionPane.showMessageDialog(null, "Error En La Conexion , Revisa la misma o los parametros de conexion");
          return null;
      }
  }
}