package Console;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		in printf %s is for string and %d is for int and %n is new line
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("How old are you "+ name + "?");
		int age = scanner.nextInt();
//		int ageone = Integer.parseInt(scanner.nextLine());
//		System.out.println(name + " is "+ age + " years old");
		System.out.printf("%s is  %d years old%n", name, age);
		scanner.close();
	}
}
