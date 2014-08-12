package StoreManagementSystem;
import java.util.ArrayList;
/**
 * The StockControl class is currently used as the driver class
 * @author Conor Clarke
 *
 */
public class StockControl {
	private int index;
	private ArrayList<Product> inventory = new ArrayList<Product>();
	
	public StockControl() {
		//Probably shouldn't have this in the constructor but I'll
		//leave it for now
		Login l = new Login();
		l.run();
	}
	public void addProduct(String name, double retailPrice) {
		Product p = new Product();
		p.setProductID(++index);
		p.setProductName(name);
		p.setRetailPrice(retailPrice);
		inventory.add(p);
	}
	public void removeProduct(int id){
		Product p = inventory.get(id);
		inventory.remove(p);
	}
	
	public static void main(String [] args){
		new StockControl();
	}
}
