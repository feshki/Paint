import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener implements MouseListener, MouseMotionListener {

	private MyCanvas myCanvas;
	private Shape shape;
	private Shape shape2;
	private int sX;
	private int sY;
	private int eX;
	private int eY;

	public MyMouseListener(MyCanvas myCanvas) {
		// TODO Auto-generated constructor stub
		this.myCanvas = myCanvas;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.eX = arg0.getX();
		this.eY = arg0.getY();
		if (this.myCanvas.getShapeType() != null) {
			switch (this.myCanvas.getShapeType()) {
			case "line":
				this.shape2 = new Line(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "line");
				break;
			case "rectangle":
				this.shape2 = new Rectangle(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "rectangle");
				break;
			case "circle":
				this.shape2 = new Circle(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "circle");
				break;
			case "select":
				this.shape2 = new Rectangle(0,this.sX, this.sY, this.eX, this.eY,
						"yellow", "rectangle");
				break;
			default:
				this.shape2 = new Line(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "line");
				break;

			}
			//this.shape2.setColor(this.myCanvas.getColor());
			this.myCanvas.setShape(this.shape2);
		}

		this.myCanvas.repaint();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.sX = arg0.getX();
		this.sY = arg0.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.eX = arg0.getX();
		this.eY = arg0.getY();
		if ((this.myCanvas.getShapeType() != null) && this.myCanvas.getShapeType() != "select") {
			switch (this.myCanvas.getShapeType()) {
			case "line":
				this.shape = new Line(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "line");
				break;
			case "rectangle":
				this.shape = new Rectangle(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "rectangle",false);
				break;
			case "circle":
				this.shape = new Circle(0,this.sX, this.sY, this.eX, this.eY,
						this.myCanvas.getColor(), "circle");
				break;
//			default:
//				this.shape = new Line(this.sX, this.sY, this.eX, this.eY,
//						this.myCanvas.getColor(), "line");
//				break;

			}
			//this.shape.setColor(this.myCanvas.getColor());
			this.myCanvas.getList().add(shape);
		}
		if((this.myCanvas.getShapeType() != null) &&this.myCanvas.getShapeType() == "select")
		{
		for(Shape shape:this.myCanvas.getList())
		{
			int minX = Math.min(shape.getsX(), shape.geteX());
			int maxX = Math.max(shape.getsX(), shape.geteX());
			int minY = Math.min(shape.getsY(), shape.geteY());
			int maxY = Math.max(shape.getsY(), shape.geteY());
			int xS = Math.min(this.eX, this.sX);
			int xE = Math.max(this.eX, this.sX);
			int yS = Math.min(this.eY, this.sY);
			int yE = Math.max(this.eY, this.sY);
			int xL = Math.max(minX, xS);
			int xR = Math.min(maxX, xE);
			int yT = Math.max(minY, yS);
			int yB = Math.min(maxY, yE);
			if(xR>xL && yB>yT)
			{
				shape.setSelected(true);
			}
			
			
		}
	}

		this.myCanvas.repaint();

	}

}
