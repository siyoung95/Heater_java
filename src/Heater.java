
public class Heater {
	boolean power;
	String heat;
	String winds;
	int time = 0;

	void Object() {
		System.out.println(" ////////");
		System.out.println("//ㅡㅡㅡㅡㅡ// " + winds);
		System.out.println("//ㅡㅡㅡㅡㅡ// " + winds);
		System.out.println("//ㅡㅡㅡㅡㅡ// " + winds);
		System.out.println("//ㅡㅡㅡㅡㅡ// " + winds);
		System.out.println("//"+heat+"//");
		System.out.println("//"+heat+"//");
		System.out.println("//"+heat+"//");
		System.out.println("//"+heat+"//");
		System.out.println("//////////");
		System.out.println("   ///    ");
		System.out.println("   ///    ");
		System.out.println("   ///    ");
		System.out.println("//////////");
		System.out.println("////" + time + "////");
		System.out.println("//////////");
		System.out.println();
	}
	
	void timeDown() {
		time--;
	}
	
	void weakHeat() {
		heat = "@ @ @ @";
	}
	
	void strongHeat() {
		heat = "@@@@@@@";
	}
	
	void weakWind() {
			winds = "~ ~ ~";		
	}
	
	void strongWind() {
			winds = "~~~~~";			
	}
	
	void movingWind() {
		if(time%2 == 0) {
			winds = winds + "~~";
		} else {
			winds = winds.substring(0, 5);
		}
	}
}
