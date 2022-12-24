import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Dchange {
	public Dchange() {
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
		
		
		jf.setVisible(true);
	}
}
