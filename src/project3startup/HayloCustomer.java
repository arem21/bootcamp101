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

	public String toString(){
		String result = "-----------------\n";
		result += "Customer First Name: " + getFirstName() + "\n";
		result += "Customer Last Name: " + getLastName() + "\n";
		result += "Customer Phone: " + getPhone();
		
		return result;
	}

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the nbrVehicles
     */
    public int getNbrVehicles() {
        return nbrVehicles;
    }

    /**
     * @param nbrVehicles the nbrVehicles to set
     */
    public void setNbrVehicles(int nbrVehicles) {
        this.nbrVehicles = nbrVehicles;
    }

    /**
     * @return the nbrTanks
     */
    public int getNbrTanks() {
        return nbrTanks;
    }

    /**
     * @param nbrTanks the nbrTanks to set
     */
    public void setNbrTanks(int nbrTanks) {
        this.nbrTanks = nbrTanks;
    }
}
