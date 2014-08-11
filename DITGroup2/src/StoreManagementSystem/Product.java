package StoreManagementSystem;
/**
 * Product class
 * @author Conor Clarke
 */
import java.util.ArrayList;

public class Product {
	@SuppressWarnings("javadoc")
	
	private int productID, supplierID;
	private String productName, description, category;
	private double retailPrice, supplierPrice, profitMargin;

	/**
	 * Product constructor
	 */
	public Product() {

	}
	
	/**
	 * Set the product ID
	 * 
	 * @param productID ~
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * Set the supplier ID
	 * 
	 * @param supplierID ~
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	/**
	 * Set the name of the item
	 * 
	 * @param name ~
	 */
	public void setproductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Set the description for the item
	 * 
	 * @param description ~
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the category for the item
	 * 
	 * @param category ~
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Set the retail price
	 * 
	 * @param retailPrice ~
	 */
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	/**
	 * Set the supplier price
	 * 
	 * @param supplierPrice ~
	 */
	public void setsupplierPrice(double supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	/**
	 * Set the profit margin for the shop
	 * 
	 * @param profitMargin ~
	 */
	public void setProfitMargin(double profitMargin) {
		this.profitMargin = profitMargin;
	}

	/**
	 * Return the product ID
	 * 
	 * @return productID ~
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * Return the supplier ID
	 * 
	 * @return supplierID ~
	 */
	public int getSupplierID() {
		return supplierID;
	}

	/**
	 * Return the product name
	 * 
	 * @return name ~
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Return the product description
	 * 
	 * @return description ~
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Return the product category
	 * 
	 * @return category ~
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Return the retail price
	 * 
	 * @return retailPrice ~
	 */
	public double getRetailPrice() {
		return retailPrice;
	}

	/**
	 * Return the supplier price
	 * 
	 * @return supplierPrice ~
	 */
	public double getsupplierPrice() {
		return supplierPrice;
	}

	/**
	 * Return the profit margin
	 * 
	 * @return profitMargin ~
	 */
	public double getProfitMargin() {
		return profitMargin;
	}
}
