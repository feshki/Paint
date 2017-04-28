import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;


public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> list;
	public ArrayList<Shape> getList() {
		return list;
	}
	public void setList(ArrayList<Shape> list) {
		this.list = list;
	}
	private int userId;
	public MyFrame(ArrayList<Shape> list,int userId) {
		this.setUserId(userId);
		this.list = list;
		this.setSize(710,560);
		this.setLocation(100,100);
		this.setLayout(null);
		this.setBackground(Color.lightGray);
		MyCanvas myCanvas = new MyCanvas(this.list);
		myCanvas.setLocation(10, 10);
		MyPanel myPanel = new MyPanel(myCanvas,this);
		myPanel.setLocation(510,10);
		this.add(myCanvas);
		this.add(myPanel);
		this.getContentPane().setBackground(Color.lightGray);
		this.setVisible(true);
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
