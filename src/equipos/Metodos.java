package equipos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Metodos {
    
    public String bd = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://localhost"+ bd;
    public String user = "epastoriza";
    public String pass = "epastoriza";
    
    Connection con =null;
    
    public Connection Conectar(){
        
        try{
          Class.forName(bd);
          con= DriverManager.getConnection(url, user, pass);
          JOptionPane.showMessageDialog(null, "Conectado con la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido establecer una conexion con la base de datos"+e.getMessage());
        }  
        return con;
      
    }
}
        
        



