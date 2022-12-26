import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Tbcreat {

		public Tbcreat(String data, String Dbname) {
			// TODO Auto-generated constructor stub
			String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
					+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

			String id = "root";
			String pw = "1234";
			
			try {
				Connection con = DriverManager.getConnection(url, id, pw);
				System.out.println("connecting succeed");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("CREATE TABLE IF NOT EXISTS"+Dbname+"."+data+"("
						+ "num INT NOT NULL,\r\n"
						+ "name VARCHAR(45) NULL,\r\n"
						+ "adress VARCHAR(45) NULL,\r\n"
						+ "phonenum VARCHAR(45) NULL,\r\n"
						+ "PRIMARY KEY (num))");
				System.out.println("creat table");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("error");
			}
		}
}
