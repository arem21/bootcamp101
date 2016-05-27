package project3startup;

public class HayloCustomer {
	private String firstName;
	private String lastName;
	private String phone;
	private int nbrVehicles;
	private int nbrTanks;
	
	public HayloCustomer(String aFirstName,	String aLastName, 
                String aPhone,int aNbrVehicles,	int aNbrTanks){

	}

	/*Uncomment these methods and create the code for them
	public String getFirstName(){
		
	}
	
	public String getLastName(){
		
	}
	
	public String getPhone(){
		
	}
	
	public int getNbrVehicles(){
		
	}
	
	public int getNbrTanks(){
		

	}
	*/
	

	
	public String toString(){
		String result = "-----------------\n";
		result += "Customer First Name: " + firstName + "\n";
		result += "Customer Last Name: " + lastName + "\n";
		result += "Customer Phone: " + phone;
		
		return result;
	}
}
