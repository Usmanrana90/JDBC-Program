
package jdemo;
import java.util.Scanner;
import java.sql.*;

public class JDemo 
{
private static final String url="jdbc:mysql://localhost:3306/college";
private static final String user="root";
private static final String pwd="root";

 public static void main(String[] args)  
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
       Connection con= DriverManager.getConnection(url,user,pwd);
        Statement s= con.createStatement();
      
      
        int rollno;
        String name;
        long mob;
      
      Scanner sc=new Scanner(System.in);
       rollno=sc.nextInt();
       name=sc.next();
       mob=sc.nextLong();
       
          s.executeUpdate("insert into student values('"+rollno+"','"+name+"','"+mob+"')");
        
        System.out.println("insert data into Table successfully......");
        
        }  
        catch(Exception e)
        {
            System.out.println("not inserted......");        
         }
                
                
    }
}
