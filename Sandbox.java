import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Sandbox {
	/*
	 * Graphing Calculator
	 * Morad Abdelrasheed Mokhtar
	 * 31/12/2020
	 */

	private JFrame frame;
	private static JInternalFrame f = new JInternalFrame("Viewer");
	private JTextField cx;
	private JTextField yi;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sandbox window = new Sandbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sandbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 463);
		frame.setResizable(false);
		frame.setTitle("Sandbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		init();
		
		JLabel lblNewLabel = new JLabel("Y = ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		cx = new JTextField();
		cx.setText("Coefficient of X");
		cx.setBounds(35, 8, 86, 20);
		frame.getContentPane().add(cx);
		cx.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setBounds(124, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setBounds(141, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		yi = new JTextField();
		yi.setText("Y-Intercept");
		yi.setBounds(163, 8, 86, 20);
		frame.getContentPane().add(yi);
		yi.setColumns(10);
		
		JButton view = new JButton("View");
		view.setAction(action);
		view.setBounds(366, 7, 89, 23);
		frame.getContentPane().add(view);
		
		JButton clear = new JButton("Clear");
		clear.setAction(action_1);
		clear.setBounds(497, 7, 89, 23);
		frame.getContentPane().add(clear);
		
	}
	private static void setPoint(int x, int y, Color c) { // Set a point on the graph
		JLabel l = new JLabel(".");
		l.setBounds((f.getWidth()/2)+x,(f.getHeight()/2)+y,10,10);
		l.setSize(20, 20);
		l.setForeground(c);
		l.setBackground(c);
		f.getContentPane().add(l);
	}
	private void init() { // Initalize Internal Frame
		f.setBounds(0, 36, 608, 388);
		frame.getContentPane().add(f);
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		Color RED = new Color(255,0,0);
		for(int i = -1000;i<1000;i++) {
			setPoint(i,0,RED);
			setPoint(0,i,RED);
		}
	}
	
	// Button Actions
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "View");
		}
		public void actionPerformed(ActionEvent e) {
			int CX = Integer.parseInt(cx.getText());
			int Y = Integer.parseInt(yi.getText());
			for(int i = -1000;i<1000;i++) {
				setPoint(i,-(CX*i)+Y,new Color(0,0,0));
				f.repaint();
			}
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Clear");
		}
		public void actionPerformed(ActionEvent e) {
			f.getContentPane().removeAll();
			init();
			f.validate();
		}
	}
}
