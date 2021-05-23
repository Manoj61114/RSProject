package OverrideC;

public class Override2 extends OverRideConcept{

	
	public static void start() {
		System.out.println("Bstart");
	}
	
	public void stop() {
		System.out.println("BStop");
	}
	public void stop2() {
		System.out.println("DStop");
	}
	
	
		
	public static void main(String[] args) {
		start();
		Override2 obj =  new Override2();
		obj.stop();
		obj.stop2();
		//==========================================
		OverRideConcept.start();
		OverRideConcept  obj1 = new OverRideConcept();
		obj1.stop();
		obj1.stop1();
		
	}
	
}
