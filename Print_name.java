import java.util.Scanner;

public class Print_name {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String ui = userInput.nextLine();
		System.out.println("Hello, my name is "+ ui + ".");
	}

}