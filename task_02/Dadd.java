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

public class Dadd {

	public Dadd(String data, String Dbname) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setLayout(new GridLayout(2,1));
		jf.setSize(300, 280);

		JPanel jpCenter = new JPanel(new GridLayout(3, 2, 10, 10));
		jpCenter.setBorder(new EmptyBorder(10,10,10,10));

		
		JPanel jpbottm = new JPanel();


		JLabel jlName = new JLabel("이름");
		JTextField jtName = new JTextField();
		JLabel jlAdress = new JLabel("주소");
		JTextField jtAdress = new JTextField();
		JLabel jlPhonenum = new JLabel("전화번호");
		JTextField jtPhonenum = new JTextField();

		JButton jbAdd = new JButton("추가");
		jbAdd.setPreferredSize(new Dimension(280,50));

		jpCenter.add(jlName);
		jpCenter.add(jtName);
		jpCenter.add(jlAdress);
		jpCenter.add(jtAdress);
		jpCenter.add(jlPhonenum);
		jpCenter.add(jtPhonenum);

		jpbottm.add(jbAdd);

		jf.add(jpCenter);
		jf.add(jpbottm, BorderLayout.SOUTH);
		
		jbAdd.addActionListener(e -> {
			String DName = jtName.getText();
			String DAdress = jtAdress.getText();
			String DPhonenum = jtPhonenum.getText();
			int num = 0;
			num =+ 1;
			
			String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
					+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

			String id = "root";
			String pw = "1234";
			
			try {
				Connection con = DriverManager.getConnection(url, id, pw);
				System.out.println("connecting succeed");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("\"INSERT INTO `"+Dbname+"`.`"+data+"` (`num`, `name`, `adress`, `phonenum`) VALUES (`"+num+"`, `"+DName+"`, `"+DAdress+"`, `"+DPhonenum+"`);");
				System.out.println("Drop table");
				
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
				System.out.println("error");  
				}
		});

		jf.setVisible(true);

	}
}
