package Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * @author vinicius
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost:1527/projeto","root", "root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

