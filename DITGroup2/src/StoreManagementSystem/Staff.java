package StoreManagementSystem;
 
public class Staff extends Person{
	
	private String password;
	private int accessLevel;
	private boolean login;
	private int uniqueId = 1;
	public Staff() {
		super();
		password = "";
		accessLevel=0;
	}
	public Staff(String name, String email, String contactNumber, String address, String password, int accesslevel) {
		super(name, email, contactNumber, address);
		this.password = password;
		this.accessLevel = accesslevel;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
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
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Staff Access Level : "+accessLevel);	
	}
	
}
