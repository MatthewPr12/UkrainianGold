package ua.ucu.edu.singleton;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {
    private static Connection connection;
    private final java.sql.Connection jdbcConnection;
    @SneakyThrows
    private Connection(){
        jdbcConnection = DriverManager.getConnection("jdbc:sqlite:database.sqlite3");
    }

    @SneakyThrows
    public void executeQuery(String query){
        Statement stmt = jdbcConnection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }
    @SneakyThrows
    public static Connection getInstance() {
        if(connection==null){
            connection = new Connection();
        }
        return connection;
    }
}
