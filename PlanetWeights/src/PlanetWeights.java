import java.io.IOException;


public class PlanetWeights {
	public static void main(String[] args) {
		double weight = Double.valueOf(args[0]);
		System.out.println("Your weight on Earth is " + weight + "lbs\n");
		System.out.println("Your weight on the Moon is " + (weight*.166) + "lbs\n");
		System.out.println("Your weight on Mercury is " + (weight*.378) + "lbs\n");
		System.out.println("Your weight on Venus is " + (weight*.907) + "lbs\n");
		System.out.println("Your weight on Mars is " + (weight*.38) + "lbs\n");
		System.out.println("Your weight on Jupiter is " + (weight*2.364) + "lbs\n");
		System.out.println("Your weight on Staurn is " + (weight*1.08) + "lbs\n");
		System.out.println("Your weight on Uranus is " + (weight*.795) + "lbs\n");
		System.out.println("Your weight on Neptune is " + (weight*1.125) + "lbs\n");
		System.out.println("Your weight on Pluto is " + (weight*.041) + "lbs\n");
		System.out.println("And Pluto is a planet too, dont hurt its feelings! :D");
		
	}
}
