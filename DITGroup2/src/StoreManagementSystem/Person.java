package StoreManagementSystem;
/**
 * <pre>
 * Generic class for a person. Includes variables for:
 * - ID
 * - Name
 * - Address
 * - Email
 * - Phone number
 * </pre>
 * @author Conor Clarke
 */
public class Person {
	@SuppressWarnings("javadoc")
	
	private int id;
	private String name, contactNo, address, email;
	
	/**
	 * Person constructor
	 */
	public Person() {
		
	}
	
	/**
	 * Sets the ID of the person
	 * @param id #
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * Sets the name of the person
	 * @param name Name of the person
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Sets the contact number of the person
	 * @param contactNo Contact number of the person
	 */
	public void setContactNo(String contactNo){
		this.contactNo = contactNo;
	}
	
	/**
	 * Sets the address of the person
	 * @param address Address of the person
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * Sets the email address of the person
	 * @param email Email of the person
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 * Returns the ID of the preson
	 * @return id
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Returns the name of the person
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Returns the contact number for the person
	 * @return contactNo
	 */
	public String getContactNo(){
		return contactNo;
	}
	
	/**
	 * Returns the email for the person
	 * @return email
	 */
	public String getEmail(){
		return email;
	}
	public String getAddress(){
		return address;
	}
}
