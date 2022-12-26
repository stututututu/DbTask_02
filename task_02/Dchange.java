import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class Dchange {
	public Dchange(String data, String Dbname) {
		// TODO Auto-generated constructor stub
		JFrame jf = new JFrame();
		jf.setSize(300,300);
		
		JPanel jpCenter= new JPanel(new GridLayout(4,1,10,10));
		jpCenter.setBorder(new EmptyBorder(20, 10, 20, 10));
		
		JPanel jpBottom = new JPanel();
		
		JLabel jlCnum = new JLabel("수정할번호");
		JLabel jlName = new JLabel("이름");
		JLabel jlAdress = new JLabel("주소");
		JLabel jlPhonenum = new JLabel("전화번호");
		
		JTextField jtCnum = new JTextField();
		JTextField jtName = new JTextField();
		JTextField jtAdress = new JTextField();
		JTextField jtPhonenum = new JTextField();
		
		JButton jbAdd = new JButton("수정");
		jbAdd.setPreferredSize(new Dimension(280,60));
		
		jpCenter.add(jlCnum);
		jpCenter.add(jtCnum);
		jpCenter.add(jlName);
		jpCenter.add(jtName);
		jpCenter.add(jlAdress);
		jpCenter.add(jtAdress);
		jpCenter.add(jlPhonenum);
		jpCenter.add(jtPhonenum);
		
		
		
		jpBottom.add(jbAdd);
		
	
		jf.add(jpCenter,BorderLayout.CENTER);
		jf.add(jpBottom,BorderLayout.SOUTH);
		
		jbAdd.addActionListener(e -> {
			
			String Cnum = jtCnum.getText();			
			String Cname = jtName.getText();			
			String Cadress = jtAdress.getText();			
			String Cphonenum = jtPhonenum.getText();	
			
			String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
					+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

			String id = "root";
			String pw = "1234";
			
			try {
				Connection con = DriverManager.getConnection(url, id, pw);
				System.out.println("connecting succeed");
				Statement stmt = con.createStatement();
				stmt.executeLargeUpdate("UPDATE `"+Dbname+"`.`"+data+"` SET `name` = '" + Cname + "', `address` = '" + Cadress
						+ "', `phonenum` = '" + Cphonenum + "' WHERE (`num` = '" + Cnum + "');");
				System.out.println("update succeed");
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				System.out.println("error");
			}
		});
		
		jf.setVisible(true);
	}
}
  