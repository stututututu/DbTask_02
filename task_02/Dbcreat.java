import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Dbcreat {

	
	public Dbcreat(String Dbname) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("connecting succeed");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE SCHEMA IF NOT EXISTS `"+Dbname+"` DEFAULT CHARACTER SET utf8 ;\r\n"
					+ "USE `"+Dbname+"` ;");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error");
		}

	}
}
