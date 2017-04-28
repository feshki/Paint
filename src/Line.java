import java.awt.Graphics;

public class Line extends Shape {

	public Line(int id,int sX, int sY, int eX, int eY, String color, String shapeType) {
		super(id,sX, sY, eX, eY, color, shapeType);
		// TODO Auto-generated constructor stub
	}

	public Line(int id,int sX, int sY, int eX, int eY, String color, String shapeType,
			boolean save) {
		super(id,sX, sY, eX, eY, color, shapeType, save);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(this.myColor(this.getColor()));
		g.drawLine(this.getsX(), this.getsY(), this.geteX(), this.geteY());
	}

}
