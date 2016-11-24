
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
          Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.1.96:3306/kiosko","admin", "admin");
    JOptionPane.showMessageDialog(null, "Conexion Establecida");
          return conn;
      } catch (ClassNotFoundException | SQLException | HeadlessException e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
}