//ConnTest.java
import java.sql.*;

public class  ConnTest
{
	public static void main(String[] args) throws Exception
	{
		//step1:: Activate oracle thin jdbc driver s/w by registering jdbc driver
		 // class object with DriverMAnager serivce
		          //a)  create jdbc driver class obj
				  oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
				  //b)  register with DriverManager service
				   DriverManager.registerDriver(driver);

        //step2:   Estalish  the connection with oracle Db s/w
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system" ,"tiger");
		// check the DB Connectivity
		  if(con==null)
			   System.out.println("Connection is not established");
		  else
			   System.out.println("Connection is  established");
	}//main
}//class
