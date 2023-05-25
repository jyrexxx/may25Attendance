package attendd;

public class vehicleTest {
	/*Your code should have a Base Class Vehicle class to represent different means of TRANSPORTATION. 
	  This class should represent the vehicle SPEED, COLOR, PRICE and has a method STOP. 
	  To keep your code shorter, you should apply the Object-Oriented concepts - Inheritance and Overriding 
      method and do the following:
	*/
	
	public static void main(String[] args) {
		/*a.) Create a subclass of Car class and name it Toyota VIOS, which has the following 
		  properties and methods (tire type and method drive());  
		*/
		
		//Instantiation of car
		ToyotaVIOS broom = new ToyotaVIOS();
		
		broom.speed = 170;
		broom.color = "Blue";
		broom.price = 985000;
		System.out.println("Speed: " + broom.speed + "kmph");
		System.out.println("Color: " + broom.color);
		System.out.println("Php " + broom.price);
		System.out.println("Tire Type: " + broom.tire);
		
		broom.drive();
		broom.stop();
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		
		/*b.)Create a subclass of Plane class and name it U-2 Spy Plane, which has the following 
	  	  properties and methods (wing span and method fly());
		*/
		
		//Instantiation of plane
		U_2Spy Fly = new U_2Spy();
		
		Fly.speed = 805;
		Fly.color = "Gray";
		Fly.price = 120000000;
		System.out.println("Speed: " + Fly.speed + "kmph");
		System.out.println("Color: " + Fly.color);
		System.out.println("$ " + Fly.price);
		System.out.println("Wingspan: " + Fly.wingspan + "meters");
		
		Fly.fly();
		Fly.stop();
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		
		/*c.) Create a subclass of Boat class and name it Fandango Yacht, which has the following 
	   	  properties and methods (MainSail color and method float()); 
		*/
		
		//Instantiation of boat
		FandangoYacht Float = new FandangoYacht();
		
		Float.speed = 18;
		Float.color = "White";
		Float.price = 545000;
		System.out.println("Speed: " + Float.speed + "kn");
		System.out.println("Color: " + Float.color);
		System.out.println("$ " + Float.price);
		System.out.println("Mainsail Color: " + Float.Mainsailcolor);
		
		Float.Float();
		Float.stop();
	}
}
