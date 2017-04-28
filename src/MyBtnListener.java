import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyBtnListener implements ActionListener {

	private MyCanvas myCanvas;
	private JButton button;

	public MyBtnListener(MyCanvas myCanvas, JButton button) {
		// TODO Auto-generated constructor stub
		this.myCanvas = myCanvas;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		switch (this.button.getName()) {
		case "btnRectangle":
			this.myCanvas.setShapeType("rectangle");
			break;
		case "btnCircle":
			this.myCanvas.setShapeType("circle");
			break;
		case "btnLine":
			this.myCanvas.setShapeType("line");
			break;
		case "btnSelect":
			this.myCanvas.setShapeType("select");
			break;
		default:
			this.myCanvas.setShapeType("line");
			break;
		}
	}

}
