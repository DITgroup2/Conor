package StoreManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import java.awt.Color;
/**
 * The main application that is loaded after a valid login.
 */
public class MainDisplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			MainDisplay frame = new MainDisplay();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public MainDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.window);
		tabbedPane.setBounds(10, 11, 596, 381);
		contentPane.add(tabbedPane);
		
		JLabel lblThisIsPane = new JLabel("This is pane 1");
		tabbedPane.addTab("Tab 1", null, lblThisIsPane, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		JLabel lblThisIsPane_1 = new JLabel("This is pane 2");
		tabbedPane.addTab("Tab 2", null, lblThisIsPane_1, null);
	}
}
