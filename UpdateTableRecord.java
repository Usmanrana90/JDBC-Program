

package jdemo;
import java.sql.*;
import java.util.Scanner;

public class UpdateTableRecord
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
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the rollno");
       int r=sc.nextInt();
       
      System.out.println("Enter the mobile");
       Long m=sc.nextLong();
       int i=s.executeUpdate("update mca set mobile="+m+"where rollno="+r);
       if(i>0)
       {
        System.out.println("Update Successfully");
       }
       else
        {
         System.out.println("Not Update");
        }
       
       
       
       
}
     catch(Exception e)
    {
     System.out.println("Not Inserted......");
    
    }
    
}
}

