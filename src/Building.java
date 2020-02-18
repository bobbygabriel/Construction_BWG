
/**
 * This is the superclass for all objects and classes in the system.
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */
public class Building {

	protected String projectName;//Name of the Building
	protected String completeAddress;//Address of the Building
	protected double totalSquareFeet;//Total square footage of the Building
	protected String occupancyGroup;//What occupancy group the Building falls in
	protected String subgroup;//What subgroup the Building falls in
	
	
	public Building(){
		
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
	}//end empty-argument constructor
	
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor
	
	
	public void draw() {
		
		System.out.println("Drawing code for <<Object Type>>.");
	}//end draw
	
	
	/**
	 * returns a formatted String that contains all the information of Building
	 */
	public String displayData() {
		
		StringBuilder sb = new StringBuilder("----------Building----------\n");
		sb.append("Project Name: "+getProjectName()+"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet()+"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup()+"\n");
		sb.append("Sub group: "+getSubgroup()+"\n");
		
		
		return sb.toString();
	}//end displayData

	
	
	/**
	* @return the current value of projectName
	*/
	public String getProjectName() {
		return projectName;
	}// end getProjectName

	/**
	* @param the value of projectName to be set
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	* @return the current value of completeAddress
	*/
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	* @param the value of completeAddress to be set
	*/
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	* @return the current value of totalSquareFeet
	*/
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	* @param the value of totalSquareFeet to be set
	*/
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	* @return the current value of occupancyGroup
	*/
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	* @param the value of occupancyGroup to be set
	*/
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	* @return the current value of subgroup
	*/
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	* @param the value of subgroup to be set
	*/
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
	
	
}//end Building
