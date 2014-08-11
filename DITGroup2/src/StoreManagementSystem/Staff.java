package StoreManagementSystem;
/**
 * Contains details about staff. Each member of staff has a level of access
 * granted to them, which determines the features they can use in the driver class.
 * This is set in the constructor, along with their name and ID. There is no public 
 * method to return the password. Instead, there is a boolean method to validate 
 * the password.
 * 
 * @author Conor Clarke
 */
public class Staff extends Person{
	@SuppressWarnings("javadoc")
	
	private int accessLevel;
	private String role, password = "ah142";
	private boolean login;
	/**
	 * Staff constructor
	 * @param id ~
	 * @param name ~
	 * @param accessLevel ~
	 */
	public Staff(int id, String name, int accessLevel) {
		super();
		this.setId(id);
		this.setName(name);
		this.accessLevel = accessLevel;
		this.login = false;
	}
	
	/**
	 * Sets the access level for the staff member
	 * @param accessLevel Determines authorization level
	 */
	public void setAccessLevel(int accessLevel){
		this.accessLevel = accessLevel;
	}
	
	/**
	 * Sets the password for the staff member
	 * @param password Password for staff member to log in
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
	/**
	 * Sets the staff member's role
	 * @param role Determines staff role
	 */
	public void setRole(String role){
		this.role = role;
	}
	
	/**
	 * Returns the access level of the staff member
	 * @return accessLevel
	 */
	public int getAccessLevel(){
		return accessLevel;
	}
	
	/**
	 * Returns the role of the staff member
	 * @return role
	 */
	public String getRole(){
		return role;
	}
	
	/**
	 * Validates a char array to check if it matches the password. 
	 * If it does, it returns the boolean 'login' as true. 
	 * 'login' is initially set to false in the constructor.
	 * @return login 
	 * @param charArr The password required for the staff 
	 * member to log in 
	 */
	public boolean passwordValidation(char [] charArr){
		String testStr = String.valueOf(charArr);
		if(this.password.equals(testStr))
			login = true;
		return login;
	}
}
