import java.util.Scanner;

//Lab 3
public class Conditional {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		String username;
		int usernumber;
		
		System.out.println("Please enter your name: ");
		username = scnr.next();
		//System.out.println(username);  FIX ME
		
		System.out.println(username + ", Please enter a number between 1 - 100: ");
		usernumber = scnr.nextInt();
		//System.out.println(usernumber);  
		
	}
}
	
