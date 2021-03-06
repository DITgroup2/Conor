package StoreManagementSystem;
 
public class Person {
	
	private String name;
	private String email;
	private String address;
	private int id;
	private static int uniqueId = 1;
	private String contactNumber;
	
	public static void main(String [] args){
	
	}
	
	public Person(){
		name = "";
		email = "";
		address = "";
		contactNumber = "0";
		//id = uniqueId++;
	}
	public Person(String name, String email, String contactNumber, String address) {
		
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		id = uniqueId++;						
	}
	
	public void displayDetails(){		
		System.out.println("\nID : "+this.getId());
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Phone : "+contactNumber);
		System.out.println("Address : "+address);		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
