package StoreManagementSystem;

import java.util.ArrayList;
/**
 * Generic Order class
 * @author Roland Katona
 */
public class Order {

	protected ArrayList<Object[]> purchaseList;  	//Includes quantity and product ID
	private int orderId = 1;						
	protected Person person;
	private boolean processed;
	
	/**
	 * Order constructor. The default order ID is incremented by one
	 * each time a new entry is entered
	 */
	public Order() {
		purchaseList = new ArrayList<Object[]>();
		orderId++;
		processed = false;
	}
	
	/**
	 * <pre>
	 * Prints the details of each orders in the list, including:
	 * - Quantity
	 * - Unit price
	 * - Product name
	 * </pre>
	 */
	public void displayOrderDetails(){
		System.out.println("\n*******"+this.getClass().getName()+" Details*******");
		System.out.println("Quantity       Unit Price      Product Name");
		for(Object[] purchaseAndQuantity : purchaseList){
			System.out.println((Integer)purchaseAndQuantity[1]+"          "
				+((Product)purchaseAndQuantity[0]).getRetailPrice()+"           "
				+((Product)purchaseAndQuantity[0]).getProductName());		
		}
	}
	
	/**
	 * Return the list of products in the order
	 */
	public ArrayList<Object[]> getProductList() {
		return purchaseList;
	}
	
	/**
	 * Add a new product to the inventory
	 */
	public void addProductToList(Object[] productAndQuantity) {
		purchaseList.add(productAndQuantity);
	}
	
	/**
	 * Find the ID of the order
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * Find the person associated with the order
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Set the person that requested the order
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Returns whether the order has been processed or not
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * Sets the order to processed (true) or active (false).
	 * The default value is false
	 */
	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
}

