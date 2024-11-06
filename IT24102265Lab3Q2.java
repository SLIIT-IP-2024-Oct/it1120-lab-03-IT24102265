import java.util.Scanner;

public class IT24102265Lab3Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter the monthly salary
		System.out.print("Enter the monthly salary: ");
		double monthlySalary = scanner.nextDouble();

		// Prompt user to enter the number of OT hours
		System.out.print("Enter the number of OT hours: ");
		double otHours = scanner.nextDouble();

		// Prompt user to enter the OT hourly rate
		System.out.print("Enter the OT hourly rate: ");
		double otHourlyRate = scanner.nextDouble();

		// Calculate the OT amount
		double otAmount = otHours * otHourlyRate;

		// Calculate the total salary
		double totalSalary = monthlySalary + otAmount;

		// Display the total amopunt
		System.out.println("The total salary including OT is: " + totalSalary);
	}
} 