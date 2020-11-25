
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;

public class PlotGraph extends JPanel{	private double zoom = 1d;
	private static final long serialVersionUID = 1L;

	static JFrame f = new JFrame();
	 public void paintComponent(Graphics g) {
		 Graphics2D gg = (Graphics2D) g;
		 gg.scale(0.5,0.5);
		 //gg.rotate(Math.toRadians(180));
		 super.paintComponent(g);
		 
	 }
	public static void main(String[] args) {
		PlotGraph o = new PlotGraph();
		o.init();
	    for(double i = 1000;i>-1000;i-=1) {
			o.setPoint(0,i, Color.BLUE,"."); // y-axis
			o.setPoint(i,0, Color.red,"."); // x-axis
			o.setPoint(i,2*i // f(x)=2x
					*-1,Color.BLACK, ".");
			f.repaint();
	    }
	}
	void init() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		f.setSize(screenSize.getSize());
		f.setResizable(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setTitle("Graph");
		f.setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		f.add(this);
    }
	void setPoint(double x, double y, Color c, String co) {
		JLabel l = new JLabel(co);
		l.setForeground(c);
		l.setSize(10,10);
		Point p = new Point();
		p.setLocation(700+x,300+y);
		l.setLocation(p);
		add(l);
	}
}
