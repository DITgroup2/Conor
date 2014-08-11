package StoreManagementSystem;
import java.util.ArrayList;
/**
 * Generic order class
 * @author Conor Clarke
 *
 */
public class Order {
	@SuppressWarnings("javadoc")
	
	private static ArrayList<int []> products = new ArrayList<int []>();
	private boolean processed;
	
	/**
	 * Order constructor
	 */
	public Order() {
		
	}
	
	/**
	 * Create an entry for a product in the array list, with a product
	 * ID and associated quantity
	 * @param id ~
	 * @param quantity ~
	 */
	public static void setProduct(int id, int quantity){
		int [] product = new int[2];
		product[0] = id;
		product[1] = quantity;
		products.add(product);
	}
}
