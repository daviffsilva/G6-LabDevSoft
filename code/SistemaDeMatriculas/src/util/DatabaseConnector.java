package util;

import javax.xml.transform.Result;
import java.sql.*;

public class DatabaseConnector {

    private static DatabaseConnector instance = null;
    private Connection connection;
    private static final String SCHEMA = "sistema_matricula";
    private static final String HOST = "localhost";
    private static final Integer PORT = 3306;

    public static DatabaseConnector getInstance() {
        if(instance == null){
            try {
                instance = new DatabaseConnector();
            }catch(SQLException ex){
                ex.printStackTrace();
                instance = null;
            }
        }
        return instance;
    }

    private DatabaseConnector() throws SQLException {
        String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + SCHEMA;
        this.connection = DriverManager.getConnection(url, "root", "12345678");
    }

    private Connection getConnection(){
        return this.connection;
    }

    public Statement getStatement(){
        try {
            return this.getConnection().createStatement();
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public PreparedStatement prepareStatement(String sql){
        try {
            return this.getConnection().prepareStatement(sql);
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public ResultSet executeQuery(String sql){
        try {
            return this.getStatement().executeQuery(sql);
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
