package project3startup;

public class HayloCustomer {

    private String firstName;
    private String lastName;
    private String phone;
    private int nbrVehicles;
    private int nbrTanks;

    public HayloCustomer(String aFirstName, String aLastName,
            String aPhone, int aNbrVehicles, int aNbrTanks) {
        firstName = aFirstName;
        lastName = aLastName;
        phone = aPhone;
        nbrVehicles = aNbrVehicles;
        nbrTanks = aNbrTanks;
    }
    //Get first name

    public String getFirstName() {
        return firstName;
    }
    //Get last name

    public String getLastName() {
        return lastName;
    }
    //Get phone number

    public String getPhone() {
        return phone;
    }
    //Get number of vehicles

    public int getNbrVehicles() {
        return nbrVehicles;
    }
    //Get number of tanks

    public int getNbrTanks() {
        return nbrTanks;
    }
    //Result of input return from customer

    public String toString() {
        String result = "-----------------\n";
        result += "Customer First Name: " + firstName + "\n";
        result += "Customer Last Name: " + lastName + "\n";
        result += "Customer Phone: " + phone + "\n";
        result += "Number of Vehicles:" + nbrVehicles + "\n";
        result += "Number of Tanks: " + nbrTanks + "\n";
        return result;
    }
}
