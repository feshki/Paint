import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class MyCanvas extends Canvas {
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> list;
	private Shape shape;
	private String color;
	private String shapeType;

	public MyCanvas(ArrayList<Shape> list) {

		this.setList(list);
		MyMouseListener myMouseListener = new MyMouseListener(this);
		this.addMouseListener(myMouseListener);
		this.addMouseMotionListener(myMouseListener);
		this.setSize(500, 500);
		this.setBackground(Color.white);
	}

	public void paint(Graphics g) {
		// super.paint(g);

		for (Shape shape : this.list) {
			shape.draw(g);
		}
		if (this.shape != null) {
			this.shape.draw(g);
		}

	}

	public ArrayList<Shape> getList() {
		return list;
	}

	public void setList(ArrayList<Shape> list) {
		this.list = list;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
