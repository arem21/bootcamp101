package project3startup;

import java.text.NumberFormat;
import java.util.StringTokenizer;

public class HayloFactory {
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
	private final static double TAX_RATE = 0.0725;
	
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
}
