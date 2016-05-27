package project3startup;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class HayloFactoryController {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HayloValidate hv = new HayloValidate();
        //create variables to hold information collected from the user
        String fn;
        String ln;
        String phone;
        int nbrVechiles;
        int nbrTanks;
        do {

            //collect the data entered by the user in 
            //variables
            String customerMsg = "Please enter the following separated by spaces"
                    + "\n\n"
                    + "- Customer First Name\n"
                    + "- Customer Last Name\n"
                    + "- Customer Phone\n"
                    + "- Number of Vehicles\n"
                    + "- Number of Tanks"
                    + "\n\n"
                    + "Example: Homer Simpson 9094559384 5 8\n\n";

            StringTokenizer tkCustomer = new StringTokenizer(
                    JOptionPane.showInputDialog(customerMsg));

            //store each token in the corresponding variable
            fn = tkCustomer.nextToken();
            ln = tkCustomer.nextToken();
            phone = tkCustomer.nextToken();
            nbrVechiles = Integer.parseInt(tkCustomer.nextToken());
            nbrTanks = Integer.parseInt(tkCustomer.nextToken());
         
            //validate each data entered here
            //Create a customer Object
            //CustomerObject variableName = new CustomerObject(arguments)
            //Present the customer with a choice of vehicles
            String[] choices = {"EV-EX 4", "EV-EX 6", "EV-DX 9", "EV-DX 12", "EV-SX 13"};

            int response = JOptionPane.showOptionDialog(
                    null // center over parent
                    , "Select a Vehicle type and Number of Fuel Cells" // message
                    , "Vehicle & Fuel Cell Selection" // title in titlebar
                    , JOptionPane.YES_NO_OPTION // Option type
                    , JOptionPane.PLAIN_MESSAGE // messageType
                    , null // icon
                    , choices // Options
                    , "APS 24" // initial value
            );
            //get the selection from the customer
            StringTokenizer tkVehicle = new StringTokenizer(choices[response]);

            //populate the vehicle variables
            //??????????????????????
            //Create our vehicle object
            //VehicleObject variableName = new VehicleObject(arguments)
            //Create our factory object
            //FactoryObject factoryVariableName = new FactoryObject(customerObjectVariable, vehicleObjectVariable);
            //ask the object to process the order
            //factoryVariableName.process();
            //write code below to display the result for each order
            //??????????????????????????????????????
        } while (JOptionPane.showConfirmDialog(null, "Enter More Orders?") == JOptionPane.YES_OPTION);

        //write code below to display the summary for all the orders
    }

}
