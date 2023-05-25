package attendd;

public class U_2Spy extends Vehicle{
	int wingspan = 31;
	
	void fly() {
		System.out.println("Take off");
	}

	@Override
	void stop() {
		//super.stop();
		System.out.println("Landing");
	}
	
}
