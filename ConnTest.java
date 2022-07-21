//ConnTest.java
import java.sql.*;

public class  ConnTest
{
	public static void main(String[] args) throws Exception
	{
				Class.forName("oracle.jdbc.driver.OracleDriver");

        //step2:   Estalish  the connection with oracle Db s/w
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system" ,"tiger");
		// check the DB Connectivity
		  if(con==null)
			   System.out.println("Connection is not established");
		  else
			   System.out.println("Connection is  established");
	}//main
}//class
