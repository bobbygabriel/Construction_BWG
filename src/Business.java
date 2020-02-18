
/**
 * Business is a subclass of Building
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class Business extends Building {

	protected int numRentableUnits;//Number of rentable units in the Building
	
	
	public Business() {
		
		this.numRentableUnits = 0;
	}//end empty-argument constructor
	
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of Business
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Business----------\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		
		return sb.toString();
	}//end displayData
	
	
	/**
	* @return the current value of numRentableUnits
	*/
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/**
	* @param the value of numRentableUnits to be set
	*/
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
	
}//end Business

