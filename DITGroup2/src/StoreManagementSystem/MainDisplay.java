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
 * The main application.
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
		
		CustomerTab tabbedPane_1 = new CustomerTab();
		SupplierTab supplierPane = new SupplierTab();
		tabbedPane.addTab("Customer", null, tabbedPane_1, null);
		tabbedPane.addTab("Supplier", null, supplierPane, null);
	}
}
