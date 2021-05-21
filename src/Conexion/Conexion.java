package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
    private Connection miConexion;
    private static final String url = "jdbc:sqlserver://192.168.2.103; databaseName=InventarioSusy"; //Acceso Remoto
//    private static final String url = "jdbc:sqlserver://localhost; databaseName=InventarioSusy"; //Acceso Local
    private static final String user = "sa";
    //private static final String pass = "SYSM@n@g3rSQL"; //Laptop Chance
    private static final String pass = "P@ss@dm1nSQL";

    public Connection getMiConexion() 
    {
        return miConexion;
    }

    
    public void conectar()
    {
        try 
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           miConexion = (Connection)
           DriverManager.getConnection(url, user, pass);
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e.getMessage()+"Error En Conexion");
        }
    }
    
    
    public void desconectar()
    {
        try 
        {
           if(miConexion != null)
           {
               if (miConexion.isClosed() == false) 
               {
                  miConexion.close();
               }
           } 
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Mensaje de Desconexion");
        }
    }
}    