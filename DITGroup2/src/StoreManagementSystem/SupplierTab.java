package StoreManagementSystem;

import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Choice;
import java.awt.List;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class SupplierTab extends JPanel {
	protected ArrayList<Supplier>suppliers = new ArrayList<Supplier>();
	protected ArrayList<String>listItems;
	private Supplier p = new Supplier();
	private Supplier newSupplier;
	private int selectedIndex = 0;
	
	private JButton btnNewSupplier = new JButton("New Supplier");
	private JButton btnEditSupplier = new JButton("Edit supplier");
	private JButton btnDeleteSupplier = new JButton("Remove supplier");
	private JButton btnDoneEditing = new JButton("Done editing");
	
	private JLabel lblBusinessName = new JLabel("Business Name");
	private JLabel lblSupplierId = new JLabel("Supplier ID");
	private JLabel lblContact = new JLabel("Contact");
	private JLabel lblEmail = new JLabel("Email");
	private JLabel lblAddress = new JLabel("Address");
	private JLabel lblVatNumber = new JLabel("Vat Number");
	
	private JComboBox comboBox;
	private JTextArea textArea = new JTextArea();
	
	private final JTextField vatNumField = new JTextField();
	private final JTextField contactField = new JTextField();
	private final JTextField emailField = new JTextField();
	private final JTextField addressField = new JTextField();
	private final JTextField businessNameField = new JTextField();
	private final JTextField supplierIdField = new JTextField();
	private final JButton btnCreateSupplier = new JButton("Create new");
	
	/**
	 * Create the panel.
	 */
	public SupplierTab(ArrayList<Supplier> supplierList) {
		initialize(supplierList);
		
		//Change the text in the text box
		comboBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0) {
				Supplier pers = new Supplier();
				selectedIndex = comboBox.getSelectedIndex();
				pers = suppliers.get(selectedIndex);
				p = pers;
				textArea.setText("Business name: \t" 	+pers.getName()
						 +"\nSupplier ID: \t\t"			+pers.getId()
						 +"\nVat number: \t\t" 			+pers.getVatNumber()
						 +"\nContact name: \t\t" 		+pers.getContactName()
						 +"\nEmail: \t\t" 				+pers.getEmail()
						 +"\nAddress: \t\t" 			+pers.getAddress());
			}
		});
		
		//Add a supplier (brings up text fields)
		btnNewSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startCreationMode();
			}
		});
		
		//Create a new supplier
		btnCreateSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newSupplier = new Supplier();
				newSupplier.setName(businessNameField.getText());
				newSupplier.setVatNumber(vatNumField.getText());
				newSupplier.setAddress(addressField.getText());
				newSupplier.setContactName(contactField.getText());
				newSupplier.setEmail(emailField.getText());
				suppliers.add(newSupplier);
				updateComboBox();
			}
		});
		
		//Edit a supplier
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startEditMode();
			}
		});
		
		//Turn off edit mode
		btnDoneEditing.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				endEditMode();
			}
		});
		
		//Remove a supplier (BLANK)
		btnDeleteSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Add everything to the panel
		addAllElements();
	}
	public void startCreationMode(){
		businessNameField.setVisible(true);
		vatNumField.setVisible(true);
		addressField.setVisible(true);
		contactField.setVisible(true);
		emailField.setVisible(true);
		
		lblBusinessName.setVisible(true);
		lblVatNumber.setVisible(true);
		lblContact.setVisible(true);
		lblAddress.setVisible(true);
		lblEmail.setVisible(true);
	}
	
	public void startEditMode(){
		btnDoneEditing.setVisible(true);
		
		businessNameField.setVisible(true);
		vatNumField.setVisible(true);
		addressField.setVisible(true);
		contactField.setVisible(true);
		emailField.setVisible(true);
		
		lblBusinessName.setVisible(true);
		lblVatNumber.setVisible(true);
		lblContact.setVisible(true);
		lblAddress.setVisible(true);
		lblEmail.setVisible(true);
	}
	
	public void endEditMode(){
		btnDoneEditing.setVisible(false);
		
		businessNameField.setVisible(false);
		vatNumField.setVisible(false);
		addressField.setVisible(false);
		contactField.setVisible(false);
		emailField.setVisible(false);
		
		lblBusinessName.setVisible(false);
		lblVatNumber.setVisible(false);
		lblContact.setVisible(false);
		lblAddress.setVisible(false);
		lblEmail.setVisible(false);
		
		if(!businessNameField.getText().equals(""))
			p.setName(businessNameField.getText());
		else
			p.setName(suppliers.get(selectedIndex).getName());
		
		if(!vatNumField.getText().equals(""))
			p.setVatNumber(vatNumField.getText());
		else
			p.setVatNumber(suppliers.get(selectedIndex).getVatNumber());
		
		if(!addressField.getText().equals(""))
			p.setAddress(addressField.getText());
		else
			p.setAddress(suppliers.get(selectedIndex).getAddress());
		
		if(!contactField.getText().equals(""))
			p.setContactName(contactField.getText());
		else
			p.setContactName(suppliers.get(selectedIndex).getContactName());
		
		if(!emailField.getText().equals(""))
			p.setEmail(emailField.getText());
		else
			p.setEmail(suppliers.get(selectedIndex).getEmail());
		
		suppliers.set(selectedIndex, p);
	}
	
	public void initialize(ArrayList<Supplier> supplierList){
		//Set the boundaries for each element
		addressField.setBounds(509, 140, 192, 62);
		addressField.setColumns(10);
		emailField.setBounds(509, 115, 192, 20);
		emailField.setColumns(10);
		contactField.setBounds(509, 90, 192, 20);
		contactField.setColumns(10);
		vatNumField.setBounds(509, 65, 192, 20);
		vatNumField.setColumns(10);
		businessNameField.setBounds(509, 40, 192, 20);
		businessNameField.setColumns(10);
		
		textArea.setBounds(60, 43, 298, 175);
		
		btnEditSupplier.setBounds(201, 260, 131, 23);
		btnDeleteSupplier.setBounds(342, 260, 131, 23);
		btnDoneEditing.setBounds(565, 219, 136, 23);
		btnDoneEditing.setBounds(565, 219, 136, 23);
		btnNewSupplier.setBounds(60, 260, 131, 23);
		btnCreateSupplier.setBounds(565, 219, 136, 23);
		
		lblBusinessName.setBounds(409, 43, 93, 14);
		lblVatNumber.setBounds(409, 68, 94, 14);
		lblContact.setBounds(409, 93, 93, 14);
		lblAddress.setBounds(409, 140, 93, 14);
		lblEmail.setBounds(409, 118, 46, 14);
		
		//Set up the text in the combo box
		this.suppliers = supplierList;
		updateComboBox();
		comboBox.setBounds(60, 229, 264, 20);
		
		//Set the inital choice for the combo box
		p = suppliers.get(comboBox.getSelectedIndex());
		setLayout(null);
		
		//Initialize the text in the text box
		textArea.setText("Business name: \t" 	+p.getName()
				 +"\nSupplier ID: \t\t"			+p.getId()
				 +"\nVat number: \t\t" 			+p.getVatNumber()
				 +"\nContact name: \t\t" 		+p.getContactName()
				 +"\nEmail: \t\t" 				+p.getEmail()
				 +"\nAddress: \t\t" 			+p.getAddress());
		textArea.setEditable(false);
		
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		
		//Set the initial visiblity of elements
		lblBusinessName.setVisible(false);
		lblSupplierId.setVisible(false);
		lblContact.setVisible(false);
		lblAddress.setVisible(false);
		lblEmail.setVisible(false);
		lblVatNumber.setVisible(false);
		
		businessNameField.setVisible(false);
		supplierIdField.setVisible(false);
		vatNumField.setVisible(false);
		addressField.setVisible(false);
		contactField.setVisible(false);
		emailField.setVisible(false);
		
		btnDoneEditing.setVisible(false);
	}
	public void updateComboBox(){
		listItems = new ArrayList<String>();
		for(Person i:suppliers)
			listItems.add(i.getName());
		
		String [] items = new String[listItems.size()];
		int index = 0;
		for(String i: listItems)
			items[index++] = i;
		
		comboBox = new JComboBox(items);
	}
	public void addAllElements(){
		add(btnNewSupplier);
		add(btnDeleteSupplier);
		add(btnDoneEditing);
		add(btnEditSupplier);
		
		add(comboBox);
		add(textArea);
		
		add(businessNameField);
		add(contactField);
		add(emailField);
		add(addressField);
		add(vatNumField);
		
		add(lblContact);
		add(lblEmail);
		add(lblAddress);
		add(lblBusinessName);
		add(lblVatNumber);
		add(btnCreateSupplier);
	}
}
