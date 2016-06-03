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
    private static String[] pricingSheet = {"EV-EX 4 500 10",
        "EV-EX 6 1000 13",
        "EV-DX 9 2000 8",
        "EV-DX 12 6000 12",
        "EV-SX 13 7000 18"};

    private String type;
    private int nbrVehicles;
    private int nbrTanks;
    private int nbrFuelCells;

    //constants to hold our pricing properties
    private double vehiclePrice;
    private double fuelCellPrice;

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
    public HayloFactory(HayloCustomer aCustomer, HayloVehicle aVehicle) {
        customer = aCustomer;
        vehicle = aVehicle; 
        nbrVehicles = customer.getNbrVehicles();
        nbrTanks = customer.getNbrTanks();
        nbrFuelCells = vehicle.getVehicleCells();
        type = vehicle.getVehicleType();
        totalOrders++;
        totalVehicles += customer.getNbrVehicles();
        totalTanks += customer.getNbrTanks();
    }

    //Create methods to do
    //each calculation separately
    //this way we can follow the 
    //flow of execution
    //these methods are private and are
    //only accessible to the object itself
    //the controller class cannot execute them
    private void calcManufactureCost() {
        manufactureCost = nbrVehicles * vehiclePrice;
    }

    private void calcTanksCost() {
        tanksCost = nbrVehicles * nbrTanks * nbrFuelCells * fuelCellPrice;
    }

    private void calcSubtotal() {
        subtotal = manufactureCost + tanksCost;
    }

    private void calcTax() {
        tax = subtotal * TAX_RATE;
    }

    private void calcTotal() {
        total = subtotal + tax;
    }

    //create method to get the pricing from pricingsheet
    //and assign it to vehicle price and fuelcell price
    private void getPricing() {
        int pos = 0;
        StringTokenizer st;
        for (int i = 0; i < pricingSheet.length; i++) {
            st = new StringTokenizer(pricingSheet[i]);
            if (st.nextToken().equals(type)) {
                if(st.nextToken().equals(Integer.toString(nbrFuelCells)))
                    pos = i;
            }
        }
        st = new StringTokenizer(pricingSheet[pos]);
        st.nextToken();
        st.nextToken();
        vehiclePrice = Double.parseDouble(st.nextToken());
        fuelCellPrice = Double.parseDouble(st.nextToken());
    }

    //create a public method 
    //to have the object process the order
    //this method is accessible 
    //from the controller class
    //The order is processed by 
    //executing the calculations
    //one at a time
    public void process() {
        getPricing();
        calcTanksCost();
        calcManufactureCost();
        calcSubtotal();
        calcTax();
        calcTotal();
        totalSales += total;
    }

    //this public method is used to return 
    //a summary of this order this method 
    //is accessible from the controller class
    //we use the currency format to format
    //the results and display them as currency
    public String getSummary() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String summary = "\n"
                + "Vehicle Cost (" + currency.format(vehiclePrice) + "/vehicle): " 
                + currency.format(manufactureCost) + "\n"
                + "Tanks Cost (" + currency.format(fuelCellPrice) + "/fuel cell): " 
                + currency.format(tanksCost) + "\n"
                + "Subtotal: " + currency.format(subtotal) + "\n"
                + "Tax (7.25%): " + currency.format(tax) + "\n"
                + "Total: " + currency.format(total);
        return summary;
    }

    //this public method is used to return
    //a summary of all the sales made in the store
    //it is a STATIC CLASS method
    public static String salesSummary() {
        //our number formatting
        String result = "";

        return result;

    }
}
