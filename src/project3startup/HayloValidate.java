package project3startup;

import javax.swing.JOptionPane;

public class HayloValidate {

    public static String getValidName(String aName) {

        while (isValidName(aName) == false) {
            JOptionPane.showMessageDialog(null, aName + " is not valid");
            System.exit(0);
        }

        return aName;
    }

    private static boolean isValidName(String aName) {
        boolean result = true;

        for (int i = 0; i < aName.length(); i++) {
            if (Character.isLetter(aName.charAt(i)) == false) {
                result = false;
            }
        }

        return result;
    }

    public static String getValidNumber(String phone) {
        try {
            double test = Double.parseDouble(phone);
            if (phone.length() == 10) {
                String phoneFormat = phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6, 10);
                return phoneFormat;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid phone number");
                System.exit(0);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Invalid phone number");
            System.exit(0);

        }
        return null;
    }
    public static int checkVehicles(String aNbrV){
            int aNbrVehicles;
        try {
                aNbrVehicles = Integer.parseInt(aNbrV);
                if (aNbrVehicles <= 10 && aNbrVehicles >= 1) {
                return aNbrVehicles;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number of vehicles");
                    System.exit(0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid number of vehicles");
                System.exit(0);
            } return 0;
    }
    public static int checkTanks(String aNbrT){
            int aNbrTanks;
        try {
                aNbrTanks = Integer.parseInt(aNbrT);
                if (aNbrTanks == 2 || aNbrTanks == 4 || aNbrTanks == 8 || aNbrTanks == 10 || aNbrTanks == 15 || aNbrTanks == 20) {
                    return aNbrTanks;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number of tanks ex: 2,4,8,10,15 or 20");
                    System.exit(0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid number of tanks ex: 2,4,8,10,15 or 20");
                System.exit(0);
            }   return 0;
    }
            
}
