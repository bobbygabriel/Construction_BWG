
/**
 * Mall is a subclass of Business
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class Mall extends Business{

	private int numRentedUnits;//Number of rented units in the Building
	private double medianUnitSize;//Average size of a unit in the Building
	private int numParkingSpaces;//Number of parking spaces in the Building
	
	
	public Mall() {
		
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end empty-argument constructor
	
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of Mall
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Mall----------\n");
		sb.append("Number of Rented Units: "+getNumRentedUnits()+"\n");
		sb.append("Median Unit Size: "+getMedianUnitSize()+"\n");
		sb.append("Number of Parking Spaces: "+getNumParkingSpaces()+"\n");
		
		
		return sb.toString();
	}//end displayData
	
	
	
	/**
	* @return the current value of numRentedUnits
	*/
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	/**
	* @param the value of numRentedUnits to be set
	*/
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	/**
	* @return the current value of medianUnitSize
	*/
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/**
	* @param the value of medianUnitSize to be set
	*/
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	/**
	* @return the current value of numParkingSpaces
	*/
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	/**
	* @param the value of numParkingSpaces to be set
	*/
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString
	
	
}//end Mall
