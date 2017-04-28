import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private MyCanvas myCanvas;
	private MyFrame myFrame;
	

	public MyPanel(MyCanvas myCanvas , MyFrame myFrame) {

		this.myCanvas = myCanvas;
		this.myFrame = myFrame;
		this.setSize(180,500);
		this.setLayout(null);
		
		JButton btnRectangle = new JButton("\u0645\u0633\u062A\u0637\u06CC\u0644");
		JButton btnLine = new JButton("\u062E\u0637");
		JButton btnCircle = new JButton("\u062F\u0627\u06CC\u0631\u0647");
		JButton btnExit = new JButton("\u062E\u0631\u0648\u062C");
		JButton btnSelect = new JButton("انتخاب");
		
		btnRectangle.setName("btnRectangle");
		btnCircle.setName("btnCircle");
		btnLine.setName("btnLine");
		btnSelect.setName("btnSelect");
		
		
		btnRectangle.addActionListener(new MyBtnListener(this.myCanvas, btnRectangle));
		btnLine.addActionListener(new MyBtnListener(this.myCanvas, btnLine));
		btnCircle.addActionListener(new MyBtnListener(this.myCanvas, btnCircle));
		btnExit.addActionListener(new MySaveListener(this.myFrame));
		btnSelect.addActionListener(new MyBtnListener(this.myCanvas,btnSelect));
		
		btnRectangle.setBounds(40,20,120,40);
		btnCircle.setBounds(40,70,120,40);
		btnLine.setBounds(40,120,120,40);
		btnSelect.setBounds(40,170,120,40);
		btnExit.setBounds(40,420,120,40);
		
		JLabel lblColor = new JLabel("\u0631\u0646\u06AF");
		JRadioButton rdBlack = new JRadioButton("\u0645\u0634\u06A9\u06CC");
		rdBlack.setSelected(true);
		JRadioButton rdBlue = new JRadioButton("\u0622\u0628\u06CC");
		JRadioButton rdGreen = new JRadioButton("\u0633\u0628\u0632");
		JRadioButton rdRed = new JRadioButton("\u0642\u0631\u0645\u0632");
		
		rdBlack.setBackground(Color.lightGray);
		rdBlue.setBackground(Color.lightGray);
		rdGreen.setBackground(Color.lightGray);
		rdRed.setBackground(Color.lightGray);
		
		rdBlack.setName("rdBlack");
		rdBlue.setName("rdBlue");
		rdGreen.setName("rdGreen");
		rdRed.setName("rdRed");
		
		lblColor.setBounds(80,220,120,30);
		rdBlack.setBounds(40,260,120,30);
		rdBlue.setBounds(40,300,120,30);
		rdGreen.setBounds(40,340,120,30);
		rdRed.setBounds(40,380,120,30);
		
		rdBlack.addActionListener(new MyRdbListener(this.myCanvas, rdBlack));
		rdGreen.addActionListener(new MyRdbListener(this.myCanvas, rdGreen));
		rdBlue.addActionListener(new MyRdbListener(this.myCanvas, rdBlue));
		rdRed.addActionListener(new MyRdbListener(this.myCanvas, rdRed));
		
		ButtonGroup bt = new ButtonGroup();
		bt.add(rdRed);
		bt.add(rdGreen);
		bt.add(rdBlue);
		bt.add(rdBlack);
		
		this.add(btnLine);
		this.add(btnCircle);
		this.add(btnRectangle);
		this.add(btnSelect);
		this.add(btnExit);
		
		this.add(lblColor);
		this.add(rdRed);
		this.add(rdBlack);
		this.add(rdGreen);
		this.add(rdBlue);

		this.setBackground(Color.lightGray);
	}
}
