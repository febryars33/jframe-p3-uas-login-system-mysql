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
    
    private static java.sql.Connection DatabaseConnection;
    
    public static java.sql.Connection getConnection() {
        
        if(DatabaseConnection == null) {
            try {
                
                String url = "jdbc:mysql://localhost:3306/jframe_uas";
                
                String username = "root";
                
                String password = "eadgbedadgbe123";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                DatabaseConnection = DriverManager.getConnection(url, username, password);
                
                System.out.println("Database Connected !");
                
            } catch (SQLException e) {
                
//                Errors obj = new Errors();
//                obj.errorMessage(e.getMessage());
//                obj.setVisible(true);
                  showMessageDialog(null, e.getMessage());
            }
        }
        return DatabaseConnection;
    }
    
    public static void main(String args[]) {
        getConnection();
    }
}
