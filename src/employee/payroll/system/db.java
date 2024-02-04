/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

/**
 *
 * @author Hyrex
 */

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class db {
    
    
    

    public static Connection java_db(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root", "Libianca@33");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}