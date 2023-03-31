/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kitsu;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author devil
 */
public class Connection {
    public static void main(String[] args) {
        try{
            java.sql.Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//Nom	hr@//localhost:1521/xe
            Statement stmt = mycon.createStatement();
            ResultSet result = stmt.executeQuery("Select * from themees");
            while(result.next()){
                System.out.println(result.getString(1));
            }
            
        }   
            
        catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}
