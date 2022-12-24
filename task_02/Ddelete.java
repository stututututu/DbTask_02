import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ddelete {

	public Ddelete() {
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
		
		JButton jbDel = new JButton("추가");
		
		jpTop.add(jlDelnum);
		jpTop.add(jtNum);
		
		jpBottom.add(jbDel);
		
		jf.add(jpTop);
		jf.add(jpBottom);
		
		jf.setVisible(true);
	}
}
