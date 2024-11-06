import java.util.Scanner;
public class IT24102265Lab3Q1A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter the price of 1kg of rice
		System.out.print("Enter theprice of 1kg of rice: ");
		double pricePerKg = scanner.nextDouble();

		// Prompt user to enter the number of kilograms they want to buy
		System.out.print("Enter the number of kilograms you want to buy: ");
		double numberOfKgs = scanner.nextDouble();

		// Calculate the total amount
		double totalAmount = pricePerKg * numberOfKgs;

		// Display the total amopunt
		System.out.println("The total amount is: " + totalAmount);
	}
} 