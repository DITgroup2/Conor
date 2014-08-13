package StoreManagementSystem;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextPane;
import javax.swing.JList;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Choice;
import java.awt.List;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class SupplierTab extends JPanel {
	private ArrayList<Person>suppliers = new ArrayList<Person>();
	
	/**
	 * Create the panel.
	 */
	public SupplierTab(ArrayList<Person> supplierList) {
		this.suppliers = supplierList;
		
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		setLayout(null);
		
		JButton btnNewButton = new JButton("New Supplier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(30, 136, 123, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit supplier");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(30, 170, 123, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove supplier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(30, 204, 123, 23);
		add(btnNewButton_2);
		
		JButton btnViewSupplier = new JButton("View Supplier");
		btnViewSupplier.setBounds(30, 102, 123, 23);
		add(btnViewSupplier);

		String [] listItems = new String [suppliers.size()];
		int index = 0;
		for(Person i:suppliers)
			listItems[index++] = i.getName();
		
		JComboBox comboBox = new JComboBox(listItems);
		JTextArea textArea = new JTextArea();
		Person p = new Person();
		
		textArea.setBounds(416, 101, 359, 219);
		p = suppliers.get(comboBox.getSelectedIndex());
		textArea.setText("Name: "+p.getName()
				 +"\nSupplier ID: "+p.getId()
				 +"\nEmail: " +p.getEmail()
				 +"\nAddress: "+p.getAddress());
		add(textArea);
		
		comboBox.setBounds(201, 103, 181, 23);
		comboBox.setVisible(true);
		comboBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0) {
				Person pers = new Person();
				pers = suppliers.get(comboBox.getSelectedIndex());
				textArea.setText("Name: "+pers.getName()
						 +"\nSupplier ID: "+pers.getId()
						 +"\nEmail: " +pers.getEmail()
						 +"\nAddress: "+pers.getAddress());
			}
		});
		add(comboBox);
		
		
	}
}
