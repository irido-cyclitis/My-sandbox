import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class XYCalc {
	/*
	 * Morad Abdelrasheed Mokhtar
	 * AB XY Calculation
	 * Last-Modified Date : 3/1/2021
	 */

	private JFrame frmXyCalculation;
	private JTextField a;
	private JTextField b;
	private JLabel DT = new JLabel("");
	private JLabel Mid = new JLabel("");
	private JLabel S = new JLabel("");
	private JLabel T = new JLabel("");
	private JLabel E = new JLabel("");
	private JLabel YI = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XYCalc window = new XYCalc();
					window.frmXyCalculation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public XYCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmXyCalculation = new JFrame();
		frmXyCalculation.setTitle("XY Calculation");
		frmXyCalculation.setBounds(100, 100, 450, 345);
		frmXyCalculation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmXyCalculation.getContentPane().setLayout(null);
		
		a = new JTextField();
		a.setText("");
		a.setBounds(34, 11, 86, 20);
		frmXyCalculation.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setText("");
		b.setColumns(10);
		b.setBounds(159, 11, 86, 20);
		frmXyCalculation.getContentPane().add(b);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(10, 14, 46, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel);
		
		JLabel lblY = new JLabel("B");
		lblY.setBounds(137, 14, 46, 14);
		frmXyCalculation.getContentPane().add(lblY);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer Ax = Integer.parseInt(a.getText().split(" ")[0]);
				Integer Bx = Integer.parseInt(b.getText().split(" ")[0]);
				Integer Ay = Integer.parseInt(a.getText().split(" ")[1]);
				Integer By = Integer.parseInt(b.getText().split(" ")[1]);
				double Distance = Math.sqrt(Math.pow((Bx-Ax), 2)+Math.pow((By-Ay), 2));
				double MidPointX = (Ax+Bx)/2;
				double MidPointY = (By+Ay)/2;
				double Slope = (By-Ay)/(Bx-Ax);
				double Tang = Math.toDegrees(Math.atan(Slope));
				if(Tang < 0) {
					Tang = 180 + Tang;
				}
				double yIA = Ay - (Slope*Ax);
				double yIB = By - (Slope*Bx);
				DT.setText(String.valueOf(Distance));
				Mid.setText("("+String.valueOf(MidPointX)+","+String.valueOf(MidPointY)+")");
				S.setText(String.valueOf(Slope));
				T.setText(String.valueOf(Tang)+" deg");
				E.setText(
						"<html>1st Prediction: y="+Slope+"x+"+yIA
								+ "<br/>" + 
								"2nd Prediction: y="+Slope+"x+"+yIB
								+"</html>"
						);
				YI.setText(
						"<html>1st Prediction: "+yIA
						+ "<br/>" + 
						"2nd Prediction: "+yIB
						+"</html>"
				);
			}
		});
		btnNewButton.setBounds(303, 10, 89, 23);
		frmXyCalculation.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Coordinates must be in form of x[space]y");
		lblNewLabel_1.setBounds(100, 282, 275, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Distance : ");
		lblNewLabel_2.setBounds(10, 67, 67, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_2);
		
		DT.setForeground(Color.RED);
		DT.setBounds(130, 67, 262, 14);
		frmXyCalculation.getContentPane().add(DT);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mid-Point : ");
		lblNewLabel_2_1.setBounds(10, 92, 67, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_2_1);
		
		Mid.setForeground(Color.RED);
		Mid.setBounds(130, 92, 262, 14);
		frmXyCalculation.getContentPane().add(Mid);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Slope : ");
		lblNewLabel_2_1_1.setBounds(10, 117, 67, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_2_1_1);
		
		S.setForeground(Color.RED);
		S.setBounds(130, 117, 262, 14);
		frmXyCalculation.getContentPane().add(S);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Angle with X-Axis : ");
		lblNewLabel_2_1_1_1.setBounds(10, 142, 110, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_2_1_1_1);
		
		
		T.setForeground(Color.RED);
		T.setBounds(130, 142, 262, 14);
		frmXyCalculation.getContentPane().add(T);
		
		JLabel lblNewLabel_3 = new JLabel("Equation : ");
		lblNewLabel_3.setBounds(10, 167, 67, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_3);
		
		
		E.setForeground(Color.RED);
		E.setBounds(130, 167, 262, 35);
		frmXyCalculation.getContentPane().add(E);
		
		JLabel lblNewLabel_3_1 = new JLabel("Y-intercept : ");
		lblNewLabel_3_1.setBounds(10, 223, 89, 14);
		frmXyCalculation.getContentPane().add(lblNewLabel_3_1);
		
		
		YI.setForeground(Color.RED);
		YI.setBounds(130, 213, 262, 35);
		frmXyCalculation.getContentPane().add(YI);
	}

}
