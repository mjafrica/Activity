package ph.com.bpi.hello;
import java.util.Scanner;

public class AgeActivity2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();

        int ageInt = Integer.parseInt(ageInput);

        double ageDouble = (double) ageInt;

        System.out.println("Your age as int: " + ageInt);
        System.out.println("Your age as double: " + ageDouble);

        scanner.close();

	}

}