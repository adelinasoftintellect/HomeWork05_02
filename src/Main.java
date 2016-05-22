import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name" );
		String name = input.nextLine();
		printName(name);

	}

	private static void printName(String name) {
		System.out.println("Greeting, " + name + "");	
	}
}
