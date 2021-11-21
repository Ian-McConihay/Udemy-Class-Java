import java.util.Scanner;

public class ConsoleInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Please choose one of the following options");
		System.out.println("1 - Cappucino");
		System.out.println("2 - Latte");
		System.out.println("3 - Americano");
		System.out.println("4 - Mocha");
		System.out.println("5 - Macchiato");
		System.out.println("6 - Expresso");
		System.out.println("7 - Exit");
		String userChoice = scanner.nextLine();
		System.out.println("You chose " + userChoice);
		scanner.close();
	}
}
