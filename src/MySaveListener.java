import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySaveListener implements ActionListener {
	private MyFrame myFrame;

	public MySaveListener(MyFrame myFrame) {
		this.myFrame = myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stubA
		// ArrayList<Shape> list = new ArrayList<Shape>();
		// list.add(new Rectangle(10,10,200,200,"blue","rectangle"));
		ShapeEntityManager.saveShapes(this.myFrame.getList(),
				this.myFrame.getUserId());
		this.myFrame.dispose();
	}

}
