package selection;
import java.sql.*;

public class display {

	
		public static void main(String a[]){
			try
			{
		       Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/","root","root");

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from details");
		while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
		con.close();
		}
			
			catch(Exception e)
		{
			System.out.print(e);
		}
		}
}
	



