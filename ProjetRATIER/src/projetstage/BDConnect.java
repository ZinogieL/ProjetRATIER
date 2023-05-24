/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetstage;

import java.sql.*;

/**
 *
 * @author t.sol
 */
public class BDConnect {
    
        
/*        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stage","root","");
            System.out.println("success");
        } catch (ClassNotFoundException ex){
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }*/

    
    public static Connection getConnection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stage","root","");
            System.out.println("success");
            return con;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        };
        return null;
    }
}
