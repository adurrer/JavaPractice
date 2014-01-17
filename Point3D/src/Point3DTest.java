import java.awt.Point;


public class Point3DTest {
	public static void main(String[] args) {
		Point object1 = new Point(11, 22);
		Point3D object2 = new Point3D(7,6,64);
		
		System.out.println("The 2D point is located at (" + object1.x +
				", " + object1.y + ")");
		System.out.println("\tIt's being moved to (4,13)");
		object1.move(4, 13);
		
		System.out.println("The 2D point is now at (" + object1.x
				+ ", " + object1.y + ")");
		
		System.out.println("\tIt's being moved to (-10, -10)");
		object1.move(-10, -10);
		
		System.out.println("The 2D point is now at (" + object1.x
				+ ", " + object1.y + ")\n");
		
		
		System.out.println("The 3D point is located at (" + object2.x +
				", " + object2.y + ", " + object2.z + ")");
		
		System.out.println("\tIt's being moved to (10,22,71)");
		object2.move(10,22,71);
		
		System.out.println("The 3D point is now at (" + object2.x
				+ ", " + object2.y + "," + object2.z + ")");
		
		System.out.println("\tIt's being moved to (-20,-20,-20)");
		object2.move(-20,-20,-20);
		
		System.out.println("The 3D point is now at (" + object2.x
				+ ", " + object2.y + "," + object2.z + ")");
		
	}
}
