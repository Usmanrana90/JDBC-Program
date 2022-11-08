
package jdemo;
import java.util.Scanner;
import java.sql.*;


public class DynamicQury 
{
private static final String url="jdbc:mysql://localhost:3306/college";
private static final String user="root";
private static final String pwd="root";

 public static void main(String[]args) throws ClassNotFoundException, SQLException
{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, pwd);
    
            Scanner sc=new Scanner(System.in);
            
            String q=sc.nextLine();
            Statement s=con.createStatement();
            boolean b=s.execute(q);
            if(b==true)
            {
               ResultSet rs=s.getResultSet();
               while(rs.next())
               {
                   System.out.println(rs.getInt(1)+"..."+rs.getString(2)+"...."+rs.getLong(3));
               }
            }
                else
            {
                int i=s.getUpdateCount();
                System.out.println(i+"Record Done");
            }

}
 
}