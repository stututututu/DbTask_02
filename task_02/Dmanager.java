import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Dmanager {
	public Dmanager() {
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
			new Dadd();
		});
		jbDdelete.addActionListener(e -> {
			new Ddelete();
		});
		jbDchange.addActionListener(e -> {
			new Dchange();
		});
		
		jf.setVisible(true);

	}
}
