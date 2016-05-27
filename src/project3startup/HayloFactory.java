package project3startup;

import java.text.NumberFormat;
import java.util.StringTokenizer;

public class HayloFactory {

    /**
     * @return the pricingSheet
     */
    public static String[] getPricingSheet() {
        return pricingSheet;
    }

    /**
     * @param aPricingSheet the pricingSheet to set
     */
    public static void setPricingSheet(String[] aPricingSheet) {
        pricingSheet = aPricingSheet;
    }

    /**
     * @return the TAX_RATE
     */
    public static double getTAX_RATE() {
        return TAX_RATE;
    }

    /**
     * @param aTAX_RATE the TAX_RATE to set
     */
    public static void setTAX_RATE(double aTAX_RATE) {
        TAX_RATE = aTAX_RATE;
    }

    /**
     * @return the totalOrders
     */
    public static int getTotalOrders() {
        return totalOrders;
    }

    /**
     * @param aTotalOrders the totalOrders to set
     */
    public static void setTotalOrders(int aTotalOrders) {
        totalOrders = aTotalOrders;
    }

    /**
     * @return the totalVehicles
     */
    public static int getTotalVehicles() {
        return totalVehicles;
    }

    /**
     * @param aTotalVehicles the totalVehicles to set
     */
    public static void setTotalVehicles(int aTotalVehicles) {
        totalVehicles = aTotalVehicles;
    }

    /**
     * @return the totalTanks
     */
    public static int getTotalTanks() {
        return totalTanks;
    }

    /**
     * @param aTotalTanks the totalTanks to set
     */
    public static void setTotalTanks(int aTotalTanks) {
        totalTanks = aTotalTanks;
    }

    /**
     * @return the totalSales
     */
    public static double getTotalSales() {
        return totalSales;
    }

    /**
     * @param aTotalSales the totalSales to set
     */
    public static void setTotalSales(double aTotalSales) {
        totalSales = aTotalSales;
    }
	//Create our object variables (attributes)
	//variables to hold the user input
	private HayloCustomer customer;
	private HayloVehicle vehicle;
	
	//static field will apply to all objects
	//holds info about each vehicle
	//the pricing for vehicle and for fuel cells
	//will come from here
	private static String[] pricingSheet ={"EV-EX 4 500 10",
		 "EV-EX 6 1000 13",
		 "EV-DX 9 2000 8",
		 "EV-DX 12 6000 12",
		 "EV-SX 13 7000 18"};
	
	//private String owner;
	private int nbrVehicles;
	private int nbrTanks;
	
	//constants to hold our pricing properties
	private  double vehiclePrice;
	private  double fuelCellPrice;
	
	//variables to hold the cost of
	//each process
	private double manufactureCost;
	private double tanksCost;
	
	//variables to hold the results
	//of the calculations
	private double subtotal;
	private double tax;
	private double total;
	
	//Create constants for
	//items that are fixed and are not
	//going to change
	private static double TAX_RATE = 0.0725;
	
	//hold our STATIC variables
	private static int totalOrders = 0;
	private static int totalVehicles = 0;
	private static int totalTanks = 0;
	private static double totalSales = 0;

	//Constructor
	public HayloFactory(HayloCustomer aCustomer, HayloVehicle aVehicle){
	 nbrVehicles = aCustomer.getNbrVehicles();
         nbrTanks = aCustomer.getNbrTanks();
         fuelCellPrice = aVehicle.getVehicleCells();
         vehicleCost 
         
         
		//initialize our local object variables
		//with the variables passed by the user
		//owner = anOwner;

		//Add code here to increment STATIC variables
		
	}
	
	//Create methods to do
	//each calculation separately
	//this way we can follow the 
	//flow of execution
	//these methods are private and are
	//only accessible to the object itself
	//the controller class cannot execute them
	private void calcManufactureCost(){
		
	}
	
	private void calcTanksCost(){
		
	}
	
	private void calcSubtotal(){
		
	}
	
	private void calcTax(){
		
	}
	
	private void calcTotal(){
	
	}
	
	//create method to get the pricing from pricingsheet
	//and assign it to vehicle price and fuelcell price
	private void getPricing(){

	}
	
	//create a public method 
	//to have the object process the order
	//this method is accessible 
	//from the controller class
	//The order is processed by 
	//executing the calculations
	//one at a time
	public void process(){

	}
	
	
	//this public method is used to return 
	//a summary of this order this method 
	//is accessible from the controller class
	//we use the currency format to format
	//the results and display them as currency
	public String getSummary(){		
	
		String summary = "";
		

		
		return summary;
	}
	
	//this public method is used to return
	//a summary of all the sales made int the store
	//it is a STATIC CLASS method
	public static String salesSummary(){
			//our number formatting
			String result = "";

			return result;
			
		}

    /**
     * @return the customer
     */
    public HayloCustomer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(HayloCustomer customer) {
        this.customer = customer;
    }

    /**
     * @return the vehicle
     */
    public HayloVehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(HayloVehicle vehicle) {
        this.vehicle = vehicle;
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

    /**
     * @return the vehiclePrice
     */
    public double getVehiclePrice() {
        return vehiclePrice;
    }

    /**
     * @param vehiclePrice the vehiclePrice to set
     */
    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    /**
     * @return the fuelCellPrice
     */
    public double getFuelCellPrice() {
        return fuelCellPrice;
    }

    /**
     * @param fuelCellPrice the fuelCellPrice to set
     */
    public void setFuelCellPrice(double fuelCellPrice) {
        this.fuelCellPrice = fuelCellPrice;
    }

    /**
     * @return the manufactureCost
     */
    public double getManufactureCost() {
        return manufactureCost;
    }

    /**
     * @param manufactureCost the manufactureCost to set
     */
    public void setManufactureCost(double manufactureCost) {
        this.manufactureCost = manufactureCost;
    }

    /**
     * @return the tanksCost
     */
    public double getTanksCost() {

        return tanksCost;
    }

    /**
     * @param tanksCost the tanksCost to set
     */
    public void setTanksCost(double tanksCost) {
        this.tanksCost = tanksCost;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
