package project3startup;

import javax.swing.JOptionPane;

public class HayloValidate {

    //Check to see if name input is valid
    public static String getValidName(String aName) {

        while (isValidName(aName) == false) {
            JOptionPane.showMessageDialog(null, aName + " is not valid");
            aName = JOptionPane.showInputDialog(null, "Please enter valid name");
        }

        return aName;
    }

    //Check to see if length of name is valid
    private static boolean isValidName(String aName) {
        boolean result = true;

        for (int i = 0; i < aName.length(); i++) {
            if (Character.isLetter(aName.charAt(i)) == false) {
                result = false;
            }
        }

        return result;
    }

    //Check to see if phone length is valid and does not contain alphabetical letters
    public static String getValidNumber(String phone) {
        while (true) {
            try {
                double test = Double.parseDouble(phone);
                if (phone.length() == 10) {
                    String phoneFormat = phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6, 10);
                    return phoneFormat;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid phone number");
                    phone = JOptionPane.showInputDialog(null, "Please enter phone number");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid phone number");
                phone = JOptionPane.showInputDialog(null, "Please enter phone number");
            }
        }
    }

    //Check to see if vehicles are in between 1 and 10
    public static int checkVehicles(String aNbrV) {
        int aNbrVehicles;
        while (true) {
            try {
                aNbrVehicles = Integer.parseInt(aNbrV);
                if (aNbrVehicles <= 10 && aNbrVehicles >= 1) {
                    return aNbrVehicles;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number of vehicles");
                    aNbrV = JOptionPane.showInputDialog(null, "Please enter number of vehicles");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid number of vehicles");
                aNbrV = JOptionPane.showInputDialog(null, "Please enter number of vehicles");
            }
        }
    }

    //Valid tanks are 2, 4, 8, 10, 15, 20
    public static int checkTanks(String aNbrT) {
        int aNbrTanks;
        while (true) {
            try {
                aNbrTanks = Integer.parseInt(aNbrT);
                if (aNbrTanks == 2 || aNbrTanks == 4 || aNbrTanks == 8 || aNbrTanks == 10 || aNbrTanks == 15 || aNbrTanks == 20) {
                    return aNbrTanks;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number of tanks ex: 2,4,8,10,15 or 20");
                    aNbrT = JOptionPane.showInputDialog(null, " Please enter number of Tanks");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid number of tanks ex: 2,4,8,10,15 or 20");
                aNbrT = JOptionPane.showInputDialog(null, " Please enter number of Tanks");
            }
        }
    }

}
