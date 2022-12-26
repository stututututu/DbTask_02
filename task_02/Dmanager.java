import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.sql.ResultSetMetaData;

public class Dmanager {

	public Dmanager(String data, String Dbname) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(300,400);
		
		JPanel jpMain = new JPanel(new GridLayout(5,1,10,10));		
		jpMain.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JTextField jtAdd2 = new JTextField();
		JButton jbDadd = new JButton("데이터 추가");
		JButton jbDdelete = new JButton("데이터 삭제");
		JButton jbDchange = new JButton("데이터 수정");
		JButton jbDview = new JButton("데이터 보기");
		
		jpMain.add(jtAdd2);
		jpMain.add(jbDadd);
		jpMain.add(jbDdelete);
		jpMain.add(jbDchange);
		jpMain.add(jbDview);
		
		jf.add(jpMain);
		
		jbDadd.addActionListener(e -> {
			new Dadd(data, Dbname);
		});
		jbDdelete.addActionListener(e -> {
			new Ddelete(data, Dbname);
		});
		jbDchange.addActionListener(e -> {
			new Dchange(data, Dbname);
		});
		jbDview.addActionListener(e -> {
			String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
					+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

			String id = "root";
			String pw = "1234";
			
			try {			
				Connection con = DriverManager.getConnection(url, id, pw);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * from "+data+";");
				java.sql.ResultSetMetaData rsmd = rs.getMetaData();
				System.out.println("getData");
				
				while (rs.next()) {
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						System.out.print(rs.getObject(i) + " ");
					}
					System.out.println();
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("getData error");
				e1.printStackTrace();
			}

		});
		
		
		jf.setVisible(true);

	}
}
