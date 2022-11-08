
package jdemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertmultiplerecord 
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
         while(true)
         {
        System.out.println("Enter The roll no");
        int r=sc.nextInt();
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter The mobile");
        long mob =sc.nextLong();
       s.executeUpdate("insert into student values('"+r+"','"+name+"','"+mob+"')");
        System.out.println("ARE YOU WANT TO INSERT MORE RECORD[YES/NO]");
        String resp=sc.next();
        if(resp.equalsIgnoreCase("no"))
        {
            break;
        }
         }
        }
      
        catch(Exception e)
        {
            System.out.println("not inserted......");        
         }
                
                
    }
}
