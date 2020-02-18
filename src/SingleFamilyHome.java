
/**
 * SingleFamilyHome is a subclass of Residential
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class SingleFamilyHome extends Residential{

	private boolean garage; //Used to show whether or not the Building has a garage
	
	
	public SingleFamilyHome() {
		
		this.garage = false;
	}//end empty-argument constructor
	
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.garage = false;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of SingleFamilyHome
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Single Family Home----------\n");
		sb.append("Garage: "+isGarage()+"\n");
				
		return sb.toString();
	}//end displayData
	
	
	
	/**
	* @return the current value of garage
	*/
	public boolean isGarage() {
		return garage;
	}//end isGarage
	
	/**
	* @param the value of garage to be set
	*/
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
	
	
}//end SingleFamilyHome
