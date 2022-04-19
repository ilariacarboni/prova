/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproduct;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;

import java.util.List ;
import java.util.ArrayList ;

/**
 *
 * @author milar
 */
public class Product {
    
    public Connection connection ;

    public Product () {
       try{
               connection = dbConnection.enstablishConnection();
       }
           catch (Exception e) {
                   e.printStackTrace();
                   }
                   if (connection == null) {
                   System.exit(1);
                   }
              }

    public void insert (int cBarre, String nome, int qta, int prezzo) throws SQLException {
        String sql = "INSERT INTO Product (codice_barre, nome, qta, prezzo) VALUES (?,?,?,?)";
       
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,cBarre);
        ps.setString (2,nome);
        ps.setInt(3,qta);
        ps.setInt(4,prezzo);
        
        int row =  ps.executeUpdate();
        System.out.print(row);
    }   
    
    
}