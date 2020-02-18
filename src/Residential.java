
/**
 * Residential is a subclass of Building
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class Residential extends Building {

	protected int numBedrooms;//Number of Bedrooms in the Building
	protected int numBathrooms;//Number of Bathroom in the Building
	protected boolean laundryRoom;//Whether or not there is laundry room in the Building
	
	
	public Residential() {
		
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end empty-argument constructor
	
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of Residential
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Residential----------\n");
		sb.append("Number of Bedrooms: "+getNumBedrooms()+"\n");
		sb.append("Number of Bathrooms: "+getNumBathrooms()+"\n");
		sb.append("Laundry Room: "+isLaundryRoom()+"\n");
		
		
		return sb.toString();
	}//end displayData
	
	
	/**
	* @return the current value of numBedrooms
	*/
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
	
	/**
	* @param the value of numBedrooms to be set
	*/
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	/**
	* @return the current value of numBathrooms
	*/
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
	
	/**
	* @param the value of numBathrooms to be set
	*/
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	/**
	* @return the current value of laundryRoom
	*/
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom
	
	/**
	* @param the value of laundryRoom to be set
	*/
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}//end toString
	
	
}//end Residential
