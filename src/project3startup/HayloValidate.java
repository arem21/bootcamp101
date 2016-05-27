package project3startup;

import javax.swing.JOptionPane;

public class HayloValidate {

    public static String getValidName(String aName){
    
        while(isValidName(aName) == false){
             aName = JOptionPane.showInputDialog("Please re-enter  name. value " + aName + " is not valid");
        }
        
        return aName;
    }
    
    
    private static boolean isValidName(String aName){
        boolean result = true;
        
        for(int i=0; i < aName.length(); i++){
            if (Character.isLetter(aName.charAt(i)) == false){
                result = false;
            }
        }
        
        return result;
    }
}
