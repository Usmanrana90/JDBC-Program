package jdemo;
import java.sql.*;
public class FetchRecord
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
       ResultSet rs=s.executeQuery("select * from student");
       while(rs.next())
       {
           System.out.println(rs.getInt("rollno")+rs.getString("name")+rs.getLong("mobile"));
       }
       }
    catch(ClassNotFoundException | SQLException e)
    {
     System.out.println("Not Inserted...........");
    }
}
}