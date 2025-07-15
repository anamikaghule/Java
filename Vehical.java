package pqr;

class Car{
	int CarNumber = 2055;
	float Carprice = 70000.0f;
	String Carname = "fortuner";
	String Carbrand = "Toyota";
	Short Carspeed= 200;
	  
	
}
class Bike
{
	int Bikenumber = 2004;
	float Bikeprice = 18000.0f;
	String Bikename = "Splender";
	String Bikebrand = "Honda";
	Short Bikespeed= 60;
	 
	
}

class Bicycle{
	int Bicyclenumber = 2055;
	float Bicycleprice = 70000.0f;
	String Bicyclename = "Giant";
	String Bicyclebrand = "Ranger";
	Short Bicyclespeed= 40;
	
	
}

public class Vehical { 
	public static void main(String[]args)
	
	{ 
		Car c1=new Car();
		Bike b1=new Bike();
		Bicycle b2=new Bicycle();
		System.out.println("Car number is:"+ c1.CarNumber);
		System.out.println("Car price is:"+ c1.Carprice);
		System.out.println("Car name is:"+ c1.Carname);
		System.out.println("Car brand is:"+ c1.Carbrand);
		System.out.println("Car speed is:"+ c1.Carspeed);
		
		System.out.println("");
		
		System.out.println("Bike number is:"+ b1.Bikenumber);
		System.out.println("Bike price is:"+ b1.Bikeprice);
		System.out.println("Bike name is:"+ b1.Bikename);
		System.out.println("Bike brand is:"+ b1.Bikebrand);
		System.out.println("Bike speed is:"+ b1.Bikespeed);
		
		System.out.println("");
		
		System.out.println("Bicycle number is:"+ b2.Bicyclenumber);
		System.out.println("Bicycle price is:"+ b2.Bicycleprice);
		System.out.println("Bicycle name is:"+ b2.Bicyclename);
		System.out.println("Bicycle brand is:"+ b2.Bicyclebrand);
		System.out.println("Bicycle speed is:"+ b2.Bicyclespeed);
		
		System.out.println("");
			
	}
	

}
