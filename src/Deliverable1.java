import java.util.Scanner;

public class Deliverable1 {
	public static void main(String[] args) {
		String number1;
		String number2;
		int num1;
		int num2;
		int total1;
		int total2;
		int total3;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter Number 1 :");
		number1 = scnr.next();// user enters first #

		System.out.println("Enter Number 2 :");
		number2 = scnr.next();// user enters second #

		num1 = Integer.parseInt(number1);// translate from string to int so i can actually use the entered numbers
		num2 = Integer.parseInt(number2);
		
		System.out.println();
		System.out.println("First number is : " + num1);
		System.out.println("Second number is : " + num2);
		System.out.println();

		if (num1 > 999)
			System.out.println("\nMust be more then 3 digits.");// Must be 3 digits
		if (num2 < 100)
			System.out.println("Must be less then 3 digits.");// Must be 3 digits

		sum1 = num1 / 100;//algorythm used to pick out each digit indiviually
		sum2 = (num1 - (sum1 * 100)) / 10;
		sum3 = num1 - (sum1 * 100) - (sum2 * 10);

		sum4 = num2 / 100; 
		sum5 = (num2 - (sum4 * 100)) / 10;
		sum6 = num2 - (sum4 * 100) - (sum5 * 10);

		total1 = sum1 + sum4;// Simple addition prior to comparing 
		total2 = sum2 + sum5;
		total3 = sum3 + sum6;

		if (total1 == total2 && total2 == total3) { //This is where the entered numbers are calculated and then checked for being equal
			System.out.println("True");
		} else {
			System.out.println("False");

		}

	}
}
