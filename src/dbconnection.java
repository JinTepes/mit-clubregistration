

import java.sql.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linons
 */
public class dbconnection {
    Connection conn = null;
    
    public static Connection ConnecrDb ()
    {
        
        
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn =DriverManager.getConnection("jdbc:sqlite:MIT Members.sqlite");
        JOptionPane.showMessageDialog(null, "Database Connection Established");
        return conn;
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
