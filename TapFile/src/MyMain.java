import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class MyMain {

	private JFrame frame;
	static private Integer n;
	static private JLabel countLabel;
	static private JButton tapBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Variable declarations
		countLabel = new JLabel();
		n = 0;
		tapBtn = new JButton();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMain window = new MyMain();
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
	public MyMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 153));
		frame.setForeground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		countLabel = new JLabel("0");
		countLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		countLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countLabel.setBounds(200, 90, 61, 36);
		frame.getContentPane().add(countLabel);
		
		tapBtn = new JButton("Tap Me");
		tapBtn.setForeground(new Color(0, 0, 0));
		tapBtn.setBackground(new Color(153, 204, 153));
		tapBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		tapBtn.setBounds(160, 183, 139, 36);
		frame.getContentPane().add(tapBtn);
		
		registerTapButtonEvent();
				
		
	}
	private void registerTapButtonEvent() {
		tapBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n++;
				countLabel.setText(n.toString());
			}
		});
	}
	
	
}
