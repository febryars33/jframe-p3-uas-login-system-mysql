/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspemograman3;

import java.sql.DriverManager;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Febriansyah
 */
public class SqlConnection {
    
    private static String url = "jdbc:mysql://localhost:3306/";
    
    private static String db_name = "";
    
    private static String username = "";
    
    private static String password = "";
    
    private static String host = url+db_name;
    
    private static java.sql.Connection DatabaseConnection;
    
    public static java.sql.Connection getConnection() {
        
        if(DatabaseConnection == null) {
            try {
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                DatabaseConnection = DriverManager.getConnection(host, username, password);
                
                System.out.println("Database Connected !");
                
            } catch (SQLException e) {
                
                showMessageDialog(null, e.getMessage());
            }
        }
        return DatabaseConnection;
    }
    
    public static void main(String args[]) {
        getConnection();
    }
}
