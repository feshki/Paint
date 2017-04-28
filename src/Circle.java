import java.awt.Graphics;

public class Circle extends Shape {

	public Circle(int id,int sX, int sY, int eX, int eY, String color, String shapeType) {
		super(id,sX, sY, eX, eY, color, shapeType);
		// TODO Auto-generated constructor stub
	}

	public Circle(int id,int sX, int sY, int eX, int eY, String color,
			String shapeType, boolean save) {
		super(id,sX, sY, eX, eY, color, shapeType, save);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.myColor(this.getColor()));
		g.drawOval(Math.min(this.getsX(), this.geteX()),
				Math.min(this.getsY(), this.geteY()),
				Math.abs(this.getsX() - this.geteX()),
				Math.abs(this.getsY() - this.geteY()));
	}

}
