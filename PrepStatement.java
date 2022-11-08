
package jdemo;
import java.util.Scanner;
import java.sql.*;

public class PrepStatement
{
private static final String url="jdbc:mysql://localhost:3306/college";
private static final String user="root";
private static final String pwd="root";

public static void main(String[]args) throws ClassNotFoundException, SQLException
{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, pwd);
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the Rollno");
            int r=sc.nextInt();
            
            System.out.println("Enter the Name");
            String n=sc.next();
            
            System.out.println("Enter the Mobile");
            Long l=sc.nextLong();
            PreparedStatement ps=con.prepareStatement("Insert into mca values(?,?,?)");
            ps.setInt(1, r);
            ps.setString(2, n);
            ps.setLong(3, l);
            
            
            
           
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully......");
}

}
