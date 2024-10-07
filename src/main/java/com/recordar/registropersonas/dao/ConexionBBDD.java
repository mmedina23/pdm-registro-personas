
package com.recordar.registropersonas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mmedina
 */
public class ConexionBBDD {
    
    private static final String URL = "jdbc:h2:./test_db";
    private static final String USER = "guest";
    private static final String PASSWORD = "guest";
    
    public static final Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static final ResultSet executeQuery(Connection connection, String query) throws SQLException {
        Statement statement = connection.createStatement();
        
        return statement.executeQuery(query);
    }
    
     public static final void executeUpdate(Connection connection, String query) throws SQLException {
        Statement statement = connection.createStatement();
        
         statement.executeUpdate(query);
    }
    
    
}
