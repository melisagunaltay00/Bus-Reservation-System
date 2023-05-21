import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3307/bus";
    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        Resultset resultset;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connected");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            connection.close();
        }
        HomePage hp = new HomePage();
    }
}
