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
        String fn = "";
        String ln = "";
        String phone = "";
        String nbrVehicles = "";
        String nbrTanks = "";
        String summary;
        int knownVehicles =0;
        int knownTanks =0;

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
            if (tkCustomer.countTokens() == 5) {
                fn = tkCustomer.nextToken();
                ln = tkCustomer.nextToken();
                phone = tkCustomer.nextToken();
                nbrVehicles = tkCustomer.nextToken();
                nbrTanks = tkCustomer.nextToken();
                fn = hv.getValidName(fn);
                ln = hv.getValidName(ln);
                phone = hv.getValidNumber(phone);
                knownVehicles = hv.checkVehicles(nbrVehicles);
                knownTanks = hv.checkTanks(nbrTanks);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                System.exit(0);
            }
            //Create a customer Object
            HayloCustomer hc = new HayloCustomer(fn, ln, phone, knownVehicles, knownTanks);

            //Present the customer with a choice of vehicles
            String[] choices = {"EV-SX 13", "EV-DX 12", "EV-DX 9" , "EV-EX 6","EV-EX 4"};

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
            String vehicleType = tkVehicle.nextToken();
            int fuelCell = Integer.parseInt(tkVehicle.nextToken());
            HayloVehicle hVehicle = new HayloVehicle(vehicleType, fuelCell);

            //Create our factory object
            HayloFactory hf = new HayloFactory(hc, hVehicle);
            //ask the object to process the order
            
            hf.process();
            //write code below to display the result for each order
            String out = "Welcome to HAYLO Manufacturing \n\n"+
                    "Customer Info \n"+
                    hc.toString()+ "\n"+
                    "Vehicle Info\n"+
                    hVehicle.toString()+"\n"+
                    hf.getSummary();
            JOptionPane.showMessageDialog(null,out,"Message", JOptionPane.INFORMATION_MESSAGE);
            summary = hf.salesSummary();
        } while (JOptionPane.showConfirmDialog(null, "Enter More Orders?") == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,summary,"Message", JOptionPane.INFORMATION_MESSAGE);
    }

}
