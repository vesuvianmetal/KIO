
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion_BD {
 Connection conn = null;
  public static Connection conectardb(){
      try {
          Class.forName("org.sqlite.JDBC");
          Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Penudo McFly\\Documents\\NetBeansProjects\\Kiosko_Propio\\src\\BD\\khe.sqlite");
    JOptionPane.showMessageDialog(null, "Conexion Establecida");
          return conn;
      } catch (ClassNotFoundException | SQLException | HeadlessException e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
}