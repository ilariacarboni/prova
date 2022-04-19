/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author milar
 */
public class dbConnection {
    
    public static Connection enstablishConnection() {
        
        String url = "jdbc:postgresql://localhost:5432/Test";
        Properties props = new Properties();
        props.setProperty ("user", "postgres");
        props.setProperty ("passWord","amelia");
        
        try {
            return DriverManager.getConnection(url, props);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
