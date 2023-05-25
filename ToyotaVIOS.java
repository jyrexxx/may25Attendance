package attendd;

public class ToyotaVIOS extends Vehicle {
	//subclass B
	String tire = "All-Season";
	
	// method drive
	void drive() {
		System.out.println("Car Moves");
	}

	@Override
	void stop() {
		//super.stop();
		System.out.println("Foot brake");
	}
}
