
package Programa;

import java.sql.Connection;
import java.sql.DriverManager;

@SuppressWarnings("empty-statement")
public class ConexionDB {
    Connection SQLConexion;
    
    public ConexionDB(){
        
        String host = "localhost";
        String puerto = "3306";
        String nameDB = "tito";
        
        String usuario = "root";
        String pass = "";
        
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL = false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.println("Base de datos conectada");
        }
        catch(Exception ex){
        
        }
    }
    public Connection getConectarDB(){
            return SQLConexion;
        }
    
}
