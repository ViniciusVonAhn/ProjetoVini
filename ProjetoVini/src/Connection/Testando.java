package Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/** *
 * @author vinicius
 */
public class Testando {
    public static void main(String[] args) throws SQLException{
        Connection co = new ConnectionFactory().getConnection();
        System.out.println("Conecção aberta");
        
       
    }
 
}
