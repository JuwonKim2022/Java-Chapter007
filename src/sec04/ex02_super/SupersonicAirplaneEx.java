package sec04.ex02_super;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
//		sa.fly();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
