import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ddelete {


	public Ddelete(String data, String Dbname) {
		// TODO Auto-generated constructor stub
		JFrame jf = new JFrame();
		jf.setLayout(new GridLayout(2,1));
		jf.setSize(300,200);
		
		JPanel jpTop = new JPanel(new GridLayout(1,2,10,10));
		jpTop.setBorder(new EmptyBorder(20, 10, 20, 10));
		
		JPanel jpBottom = new JPanel(new GridLayout(1,1));
		jpBottom.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel jlDelnum = new JLabel("삭제할 번호:");
		JTextField jtNum = new JTextField();
		
		JButton jbDel = new JButton("삭제");
		
		jpTop.add(jlDelnum);
		jpTop.add(jtNum);
		
		jpBottom.add(jbDel);
		
		jf.add(jpTop);
		jf.add(jpBottom);
		
		jbDel.addActionListener(e ->{
			
		String Tnum = jtNum.getText();
		
		
		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";
		
		
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("connecting succeed");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM `"+Dbname+"`.`"+data+"` WHERE (`num` = '" + Tnum + "');");
			
		} catch (Exception e2) {
				// TODO: handle exception
			e2.printStackTrace();	
			System.out.println("error");
		}
			
			
		});
		
		
		jf.setVisible(true);
	}
}
