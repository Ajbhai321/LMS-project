



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;
import java.sql.DriverManager;




/**
 *
 * @author Arjun singh
 */
public class ConnectionProvider {
    public static Connection getConnection() 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
            
            return con;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return null;
        }
    }

    /**
     *
     * @return
     */
    
    static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static com.mysql.jdbc.Connection ConnecrDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    


