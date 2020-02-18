
/**
 * Apartment is a subclass of Residential
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class Apartment extends Residential {

	private int numRentableUnits;//Number of Rentable Units in the Building
	private double avgUnitSize;//Average unit size of the Building
	private boolean parkingAvailable;//Whether or not there is parking available in the Building
	
	
	public Apartment() {
		
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end empty-argument constructor
	
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of Apartment
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Apartment----------\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		sb.append("Average Unit Size: "+getAvgUnitSize()+"\n");
		sb.append("Parking Available: "+isParkingAvailable()+"\n");
		
		
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
	
	/**
	* @return the current value of avgUnitSize
	*/
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
	
	/**
	* @param the value of avgUnitSize to be set
	*/
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	/**
	* @return the current value of parkingAvailable
	*/
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable
	
	/**
	* @param the value of parkingAvailable to be set
	*/
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
	

}//end Apartment
