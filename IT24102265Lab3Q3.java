import java.util.Scanner;

public class IT24102265Lab3Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the rupee amount
		System.out.print("Enter the rupee amount: ");
		int amount = scanner.nextInt();

		// Define the denominations 
		int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int[] count = new int[denominations.length];

		// Calculate the number of each denomination
		for (int i = 0; i < denominations.length; i++) {
		count[i] = amount / denominations[i];
		amount %= denominations[i];
		}

		// Display the number of each denomination
		for (int i = 0; i < denominations.length; i++) {
		System.out.println(denominations[i] + " Notes/Coins: " + count[i]);
		}
	}
}