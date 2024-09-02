import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static DatabaseConnector instance = null;
    private Connection connection;
    private static final String SCHEMA = "sistema_matricula";
    private static final String HOST = "localhost";
    private static final Integer PORT = 3306;

    public static DatabaseConnector getInstance() throws SQLException {
        if(instance == null){
            instance = new DatabaseConnector();
        }
        return instance;
    }

    private DatabaseConnector() throws SQLException {
        String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + SCHEMA;
        this.connection = DriverManager.getConnection(url, "root", "12345678");
    }

    public Connection getConnection() {
        return connection;
    }
}
