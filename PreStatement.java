
package jdemo;

import java.sql.*;
import java.util.Scanner;
public class PreStatement
{
private static final String url="jdbc:mysql://localhost:3306/college";
private static final String user="root";
private static final String pwd="root";

public static void main(String[]args) throws ClassNotFoundException, SQLException
{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection(url, user, pwd);
           
      
            PreparedStatement ps=con.prepareStatement("Insert into mca values(?,?,?)");
            ps.setInt(1, 206);
            ps.setString(2, "ranaraj");
            ps.setLong(3, 7647736632);             
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully......");
}

}
