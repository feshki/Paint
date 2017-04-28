import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	private static final long serialVersionUID = 1L;
	private int userId;
	JTextField txtUserName;

	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public JTextField getTxtPassWord() {
		return txtPassWord;
	}

	JTextField txtPassWord;

	public LogIn() {
		this.setSize(320, 230);
		getContentPane().setLayout(null);
		this.setBackground(Color.lightGray);
		this.setLocation(200, 200);
		JButton btnEnter = new JButton("\u0648\u0631\u0648\u062F");
		JButton btnClose = new JButton("\u062E\u0631\u0648\u062C");
		txtUserName = new JTextField();
		txtPassWord = new JTextField();
		JLabel lblUserName = new JLabel(
				"\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		JLabel lblPassWord = new JLabel("\u067E\u0633\u0648\u0631\u062F");
		txtUserName.setBounds(40, 20, 180, 40);
		txtPassWord.setBounds(40, 80, 180, 40);
		lblUserName.setBounds(235, 20, 50, 40);
		lblPassWord.setBounds(235, 80, 50, 40);
		btnClose.setBounds(40, 130, 110, 40);
		btnEnter.setBounds(170, 130, 110, 40);

		btnEnter.addActionListener(new MyLogInBtnListener(this));
		btnClose.addActionListener(new MyLogInBtnListener(this));
		btnEnter.setName("btnEnter");
		btnClose.setName("btnExit");
		getContentPane().add(txtUserName);
		getContentPane().add(txtPassWord);
		getContentPane().add(btnClose);
		getContentPane().add(btnEnter);
		getContentPane().add(lblPassWord);
		getContentPane().add(lblUserName);
		this.setVisible(true);

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
