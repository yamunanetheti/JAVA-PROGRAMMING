import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your DB name
        String user = "root"; // Replace with your DB username
        String password = "yourpassword"; // Replace with your DB password

        // JDBC Connection
        Connection connection = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connected successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
                System.out.println("🔌 Connection closed.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
