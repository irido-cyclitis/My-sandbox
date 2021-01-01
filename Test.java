import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JTextPane;
import java.awt.Color;

public class Test {
  /*
  * Standard Deviation of a Simply Freq. Distribution "6 values"
  * Morad Abdelrasheed Mokhtar Ali Gill
  * Last-Modified Date : 1/1/2021
  */
	private JFrame frame;
	private JTextField x6;
	private JTextField x1;
	private JTextField k6;
	private JTextField k1;
	private JTextField x2;
	private JTextField k2;
	private JTextField x3;
	private JTextField k3;
	private JTextField x4;
	private JLabel mean = new JLabel("Not Calculated Yet");
	private JTextField k4;
	private JTextField x5;
	private JTextField k5;
	private final Action action = new SwingAction();
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel dev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 300);
		frame.setTitle("Sandbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		x6 = new JTextField();
		x6.setBounds(584, 11, 86, 20);
		frame.getContentPane().add(x6);
		x6.setColumns(10);
		
		x1 = new JTextField();
		x1.setColumns(10);
		x1.setBounds(109, 11, 86, 20);
		frame.getContentPane().add(x1);
		
		k6 = new JTextField();
		k6.setColumns(10);
		k6.setBounds(584, 42, 86, 20);
		frame.getContentPane().add(k6);
		
		k1 = new JTextField();
		k1.setColumns(10);
		k1.setBounds(109, 42, 86, 20);
		frame.getContentPane().add(k1);
		
		x2 = new JTextField();
		x2.setColumns(10);
		x2.setBounds(205, 11, 86, 20);
		frame.getContentPane().add(x2);
		
		k2 = new JTextField();
		k2.setColumns(10);
		k2.setBounds(205, 42, 86, 20);
		frame.getContentPane().add(k2);
		
		x3 = new JTextField();
		x3.setColumns(10);
		x3.setBounds(301, 11, 86, 20);
		frame.getContentPane().add(x3);
		
		k3 = new JTextField();
		k3.setColumns(10);
		k3.setBounds(301, 42, 86, 20);
		frame.getContentPane().add(k3);
		
		x4 = new JTextField();
		x4.setColumns(10);
		x4.setBounds(393, 11, 86, 20);
		frame.getContentPane().add(x4);
		
		k4 = new JTextField();
		k4.setColumns(10);
		k4.setBounds(397, 42, 86, 20);
		frame.getContentPane().add(k4);
		
		x5 = new JTextField();
		x5.setColumns(10);
		x5.setBounds(488, 11, 86, 20);
		frame.getContentPane().add(x5);
		
		k5 = new JTextField();
		k5.setColumns(10);
		k5.setBounds(488, 42, 86, 20);
		frame.getContentPane().add(k5);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(53, 14, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblK = new JLabel("K");
		lblK.setBounds(53, 45, 46, 14);
		frame.getContentPane().add(lblK);
		
		JButton calc = new JButton("Calculate");
		calc.setAction(action);
		calc.setBounds(680, 24, 89, 23);
		frame.getContentPane().add(calc);
		
		lblNewLabel_1 = new JLabel("Mean : ");
		lblNewLabel_1.setBounds(53, 132, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Standard Deviation : ");
		lblNewLabel_2.setBounds(53, 163, 142, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		mean.setForeground(Color.RED);
		mean.setBounds(109, 132, 390, 14);
		frame.getContentPane().add(mean);
		
		dev = new JLabel("Not Calculated Yet");
		dev.setForeground(Color.RED);
		dev.setBounds(181, 163, 390, 14);
		frame.getContentPane().add(dev);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Calculate");
		}
		public void actionPerformed(ActionEvent e) {
			ArrayList<Double> Xs = new ArrayList<Double>();
			ArrayList<Double> Ks = new ArrayList<Double>();
			Xs.add(Double.parseDouble(x1.getText()));
			Xs.add(Double.parseDouble(x2.getText()));
			Xs.add(Double.parseDouble(x3.getText()));
			Xs.add(Double.parseDouble(x4.getText()));
			Xs.add(Double.parseDouble(x5.getText()));
			Xs.add(Double.parseDouble(x6.getText()));
			Ks.add(Double.parseDouble(k1.getText()));
			Ks.add(Double.parseDouble(k2.getText()));
			Ks.add(Double.parseDouble(k3.getText()));
			Ks.add(Double.parseDouble(k4.getText()));
			Ks.add(Double.parseDouble(k5.getText()));
			Ks.add(Double.parseDouble(k6.getText()));
			ArrayList<Double> XKs = new ArrayList<Double>();
			for(int i = 0;i<Xs.size();i++) {
				XKs.add(Xs.get(i)*Ks.get(i));
			}
			double Ekx = 0;
			double Ek = 0;
			for(int i = 0;i<XKs.size();i++) {
					Ekx = Ekx + XKs.get(i);
					Ek = Ek + Ks.get(i);
			} 
			double Mean = Ekx / Ek;
			mean.setText(String.valueOf(Mean));
			ArrayList<Double> XDash = new ArrayList<Double>();
			for(int i = 0;i<Xs.size();i++) {
				XDash.add(Math.pow(Xs.get(i)-Mean, 2)*Ks.get(i));
			}
			double XDashs = 0;
			for(int i = 0;i<XDash.size();i++) {
				XDashs = XDashs + XDash.get(i);
			}
			double D = Math.sqrt(XDashs / Ek);
			dev.setText(String.valueOf(D) + " = " + "sqrt( "+XDashs+" / "+Ek+" )");
		}
	}
}
