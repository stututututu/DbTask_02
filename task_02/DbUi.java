import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DbUi {
private String data;


		public DbUi()  {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(300, 500);

		JPanel jpMain = new JPanel(new GridLayout(7, 1, 10, 10));
		jpMain.setBorder(new EmptyBorder(10, 10, 10, 10));

		JTextField jtAdd = new JTextField();
		JButton jbDbcreat = new JButton("데이터베이스 생성");
		JButton jbDbdelete = new JButton("데이터베이스 삭제");
		JButton jbTbcreat = new JButton("테이블 생성");
		JButton jbTbdelete = new JButton("테이블 삭제");
		JButton jbDmanager = new JButton("데이터 관리");
		JButton jbClose = new JButton("종료");

		jpMain.add(jtAdd);
		jpMain.add(jbDbcreat);
		jpMain.add(jbDbdelete);
		jpMain.add(jbTbcreat);
		jpMain.add(jbTbdelete);
		jpMain.add(jbDmanager);
		jpMain.add(jbClose);

		jf.add(jpMain);

		jbDbcreat.addActionListener(e -> {
			data = jtAdd.getText();
			String Dbname = data;
			new Dbcreat(data, Dbname);

		});
		jbDbdelete.addActionListener(e -> {
			data = jtAdd.getText();
			String Dbname = data;
			new Dbdelete(data, Dbname);
			
		});
		jbTbcreat.addActionListener(e -> {
			data = jtAdd.getText();
			String Dbname = data;			
			new Tbcreat(data, Dbname);
			
		});
		jbTbdelete.addActionListener(e -> {
			data = jtAdd.getText();
			String Dbname = data;	
			new Tbdelete(data, Dbname);
			
		});
		jbDmanager.addActionListener(e -> {
			data = jtAdd.getText();
			String Dbname = data;
			new Dmanager(data, Dbname);
		});
		jbClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		jf.setVisible(true);
	}

}
