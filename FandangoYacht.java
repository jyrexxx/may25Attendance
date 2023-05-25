package attendd;

public class FandangoYacht extends Vehicle{
	//subclass D
	String Mainsailcolor = "White";
	
	void Float() {
		System.out.println("Pitch");
	}

	@Override
	void stop() {
		//super.stop();
		System.out.println("Drop Anchor");
	}
}
