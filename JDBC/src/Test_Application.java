import java.sql.*;
import java.util.*;

public class Test_Application {

	public static void main(String args[]){
		
		Connection con = null;
		PreparedStatement ps=null;
		
		
			// step 1 :- load driver
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				
			    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","100699");
				
			    System.out.println("Connection Done ! ");
			    System.out.println("Enter your choice 1.) Insert\n 2.) Delete \n 3.) Update");
				ps=con.prepareStatement("Insert into emp_1 values(?,?,?)");
          		ps.setInt(1,101);
          		ps.setString(2,"Ram");
          		ps.setInt(3,30000);
          		int i=ps.executeUpdate();
          		if(i>0)
          		{
          			System.out.println("Record Saved !");
          		}
          		
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			// step 2 :- connection to DB
			
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			
					
			
			
	}	
}











//first take a project then right click go to properties 
// go to libraries then add the jar file you pasted 

//step 1 :- to load the the driver  
// then type class.forName error is generate then click on error 
// click on surround by try catch 

// step 2 :- connect to database
// again type line con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","100699");
// the error is generated 
// then again click on error and surround by try catch 

// to check the port number
//C:\oraclexe\app\oracle\product\10.2.0\server\NETWORK\ADMIN
//open in notepad

/*XE =
(DESCRIPTION =
(ADDRESS = (PROTOCOL = TCP)(HOST = LAPTOP-JPQTDVPJ)(PORT = 1521))
(CONNECT_DATA =
  (SERVER = DEDICATED)
  (SERVICE_NAME = XE)
)
)

EXTPROC_CONNECTION_DATA =
(DESCRIPTION =
(ADDRESS_LIST =
  (ADDRESS = (PROTOCOL = IPC)(KEY = EXTPROC_FOR_XE))
)
(CONNECT_DATA =
  (SID = PLSExtProc)
  (PRESENTATION = RO)
)
)

ORACLR_CONNECTION_DATA = 
(DESCRIPTION = 
(ADDRESS_LIST = 
  (ADDRESS = (PROTOCOL = IPC)(KEY = EXTPROC_FOR_XE)) 
) 
(CONNECT_DATA = 
  (SID = CLRExtProc) 
  (PRESENTATION = RO) 
) 
) 
*/

// create a table in Oracle command prompt
// each question mark in line ps=con.preparedStatement("Insert into emp_1 values(?,?,?)");
// represents one column in the database
