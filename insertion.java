package insertion;
import java.sql.*;
import java.util.*;

public class insertion {
	
	 public static void main(String a[])
	 {
	 //Creating the connection
	 String url = "com.mysql.jdbc.Driver";
	 String urll="jdbc:mysql://localhost:3306/CUSTOMER";
	 String user = "root";
	 String pass = "root";
	 //Entering the data
	 Scanner k = new Scanner(System.in);
	System.out.println("enter CustomerID");
	 int CustomerID = k.nextInt();
	System.out.println("enter LastName");
	 String LastName = k.next();
	System.out.println("enter FirstName");
	 String FirstName = k.next();
	System.out.println("enter Address");
	 String Address = k.next();
	 System.out.println("enter City");
	 String City = k.next();
	 Connection con=null;
	 try
	 {
	Class.forName("com.mysql.jdbc.Driver");
	 
	con = DriverManager.getConnection(urll,user,pass);
	 Statement st = con.createStatement();

	 String sql = "insert into details values('"+CustomerID+"','"+LastName+"','"+FirstName+"','"+Address+"','"+City+"')";
	 int m = st.executeUpdate(sql);
	 if (m == 1)
	System.out.println("inserted successfully : "+sql);
	 else
	System.out.println("insertion failed");
	con.close();
	 }
	catch(Exception ex)
	 {
	System.err.println(ex);
	 }
	 }
	} 