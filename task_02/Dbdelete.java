import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbdelete {
	private String data;
	private String Dbname;
	public Dbdelete(String data, String Dbname) {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("connecting succeed");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("DROP SCHEMA IF EXISTS"+Dbname+";");
			System.out.println("Drop DB");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
