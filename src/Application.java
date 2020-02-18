
/**
 * This class tests all methods/getters/setters/toString used in the 5 other classes and superclass
 * I put random numbers in the setters to test them.
 * 
 * @author Bobby Gabriel
 *@version 1.0
 *Programming Project 2
 *Spring/2020
 */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Building
		
		//creates constructor from Building class
		Building b = new Building();	
		
		//prints methods from Building class
		System.out.println(b.displayData());
		
		b.draw();
		
		b.setProjectName("Bobby's House");
		
		b.getProjectName();
		
		b.setCompleteAddress("2001 Newburg Road");
		
		b.getCompleteAddress();
		
		b.setTotalSquareFeet(350.20);
		
		b.getTotalSquareFeet();
		
		b.setOccupancyGroup("Residential");
		
		b.getOccupancyGroup();
		
		b.setSubgroup("R-1");
		
		b.getSubgroup();
		
		System.out.println(b.toString()+"\n\n");
		
		
		//Business
		
		//create constructor from Business Class
		Business b2 = new Business();
		
		//prints methods from Business Class
		System.out.println(b2.displayData());
		
		b2.draw();
		
		b2.setNumRentableUnits(4);
		
		b2.getNumRentableUnits();
		
		System.out.println(b2.toString()+"\n\n");
		

		//Residential
		
		//create constructor from Residential Class
		Residential r = new Residential();
		
		//prints methods from Residential Class;
		System.out.println(r.displayData());
		
		r.draw();
		
		r.setNumBedrooms(6);
		
		r.getNumBedrooms();
		
		r.setNumBathrooms(2);
		
		r.getNumBathrooms();
		
		r.setLaundryRoom(false);
		
		r.isLaundryRoom();
		
		System.out.println(r.toString()+"\n\n");
		
		
		//Mall
		
		//Create constructor from Mall class
		Mall m = new Mall();
		
		System.out.println(m.displayData());
		
		//prints methods from Residential Class;
		m.draw();
		
		m.setNumRentedUnits(2);
		
		m.getNumRentedUnits();
		
		m.setMedianUnitSize(300.4);
		
		m.getMedianUnitSize();
		
		m.setNumParkingSpaces(4);
		
		m.getNumParkingSpaces();
		
		System.out.println(m.toString()+"\n\n");
		
		
		//Apartment
		
		//Create constructor from Apartment Class
		Apartment a = new Apartment();
		
		//prints methods from Apartment Class
		System.out.println(a.displayData());
		
		a.draw();
		
		a.setNumRentableUnits(60);
		
		a.getNumRentableUnits();
		
		a.setAvgUnitSize(600.95);
		
		a.getAvgUnitSize();
		
		a.setParkingAvailable(true);
		
		a.isParkingAvailable();
		
		System.out.println(a.toString()+"\n\n");
		
		
		//SingleFamilyHome
		
		//create constructor from SingleFamilyHome Class
		SingleFamilyHome s = new SingleFamilyHome();
		
		//prints methods from SingleFamilyHome class
		System.out.println(s.displayData());
		
		s.draw();
		
		s.setGarage(false);
		
		s.isGarage();
		
		System.out.println(s.toString());
		
	}//end main

}//end Application
