
package jdbcdemo;


import java.sql.*;

public class jdbc
{
private static final String url="jdbc:mysql://localhost:3306/college";
private static final String user="root";
private static final String pwd="root";
public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
      Class.forName("com.mysql.jdbc.Driver");
                
               Connection con= DriverManager.getConnection(url,user,pwd);
               PreparedStatement ps= con.PrepareStatement("insert into mca values(?,?,?)");
               ps.setInt(1, 110);
               ps.setString(2, "aslam");
               ps.setLong(3, 767656566);
               ps.executeUpdate();
               System.out.println("Data Inserted Successfully......");
    }}
    


