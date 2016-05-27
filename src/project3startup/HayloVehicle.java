package project3startup;

public class HayloVehicle {
	private String type;
	private int nbrCells;

	public HayloVehicle(String aType,int aNbrCells){

	}
	
	/*uncomment these methods and write code for them
	public String getVehicleType(){

	}
	
	public int getVehicleCells(){

	}
	*/
	
	public String toString(){
		String summary="-------------\n";
		
		summary += "Vehicle Type: " + type + "\n";
		summary += "Vehicle Number of Cells: " + nbrCells + "\n";
		
		return summary;
	}
}
