import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyLogInBtnListener implements ActionListener {

	private LogIn logIn;

	public MyLogInBtnListener(LogIn logIn) {
		this.logIn = logIn;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch (((JButton) (arg0.getSource())).getName()) {
		case "btnEnter":
			this.logIn.setUserId(UserEntityManager.isUserExist(this.logIn
					.getTxtUserName().getText(), this.logIn.getTxtPassWord()
					.getText()));
			if (this.logIn.getUserId() > -1) {
				ArrayList<Shape> list = ShapeEntityManager.getShapes(this.logIn
						.getUserId());
				new MyFrame(list, this.logIn.getUserId());
			} else {
				JOptionPane
						.showMessageDialog(null,
								"نام کاربری یا کلمه عبور صحیح نمی باشد");
			}
			break;
		case "btnExit":
			System.exit(1);
		}
	}

}
