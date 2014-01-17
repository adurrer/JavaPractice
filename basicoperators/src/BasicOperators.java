
public class BasicOperators {
	public static void main(String[] args) {
	int number1 = 5;
	double number2 = 10.5;
	double result;
	
	System.out.println("Displaying number 1 and number 2!\n" +
			"number1: " + number1 +
			"\nnumber2: " + number2);
	
	System.out.println("\nPerforming addition: number 1 + number 2");
	result = number1 + number2;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming substration: number 1 - number 2");
	result = number1 - number2;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming multiplication: number 1 * number 2");
	result = number1 * number2;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming division: number 1 / number 2");
	result = number1 / number2;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming modulus: number 1 % number 2");
	result = number1 % number2;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming increment: number 1 ++");
	result = number1++;
	System.out.println("The result: " + result);
	
	System.out.println("\nPerforming decrement: number 1 --");
	result = number1--;
	System.out.println("The result: " + result);
	}
}
