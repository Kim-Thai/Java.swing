package qltv.view;




import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connect_sql {
    Connection connection;
    public  Connection getConnectionTo(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connect_sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=LibrariApp","sa","12");
        } catch (SQLException ex) {
            Logger.getLogger(connect_sql.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return connection;
 
    }
    public void closeconnect(){
        if(connection!=null)
            try {
                connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(connect_sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        connection=null;
    }
}

