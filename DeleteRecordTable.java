
package jdemo;
import java.sql.*;
import java.util.Scanner;
public class DeleteRecordTable
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
      
       int i=s.executeUpdate("delete from student where rollno="+r);
       if(i>0)
       {
        System.out.println(i+"Enteries Deleted");
       }
       else
        {
         System.out.println("Not Deleted");
        }     
    }
       catch(Exception e)
    {
     System.out.println("Not Inserted......");
    }
}
}

