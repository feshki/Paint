import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class MyRdbListener implements ActionListener {

	private MyCanvas myCanvas;
	private JRadioButton rdb;

	public MyRdbListener(MyCanvas myCanvas, JRadioButton rdb) {
		this.myCanvas = myCanvas;
		this.rdb = rdb;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (this.rdb.isSelected()) {
			switch (rdb.getName()) {
			case "rdBlack":
				this.myCanvas.setColor("black");
				break;
			case "rdBlue":
				this.myCanvas.setColor("blue");
				break;
			case "rdGreen":
				this.myCanvas.setColor("green");
				break;
			case "rdRed":
				this.myCanvas.setColor("red");
				break;
			default:
				this.myCanvas.setColor("black");
				break;
			}
			for(Shape sh : this.myCanvas.getList())
			{
				if(sh.isSelected() && sh.isSave())
				{
					sh.setColor(this.myCanvas.getColor());
					sh.setSelected(false);
					sh.setModified(true);
				}
				else if(sh.isSelected() && !sh.isSave())
				{
					sh.setColor(this.myCanvas.getColor());
					sh.setSelected(false);
				}
			}
			this.myCanvas.repaint();
		}
	}

}
