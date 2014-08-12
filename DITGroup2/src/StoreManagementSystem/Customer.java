package StoreManagementSystem;
/**
 * Contains details about the customer. Only a name and ID is required on
 * creation. The public methods from the Person class are inherited by the
 * customer class
 * 
 * @author Conor Clarke
 */

public class Customer extends Person {
	@SuppressWarnings("javadoc")
	/**
	 * Customer constructor
	 * @param id ~
	 * @param name ~
	 */
	public Customer(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	public Customer(){
		
	}
}
