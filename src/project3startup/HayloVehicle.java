package project3startup;

public class HayloVehicle {

    private String type;
    private int nbrCells;

    public HayloVehicle(String aType, int aNbrCells) {
        type = aType;
        nbrCells = aNbrCells;

    }

    public String getVehicleType() {
        return type;

    }

    public int getVehicleCells() {
        return nbrCells;

    }

    public String toString() {
        String summary = "-------------\n";
        summary += "Vehicle Type: " + type + "\n";
        summary += "Vehicle Number of Cells: " + nbrCells + "\n";

        return summary;
    }
}
