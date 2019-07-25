
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		String string1;
		String string2;
		
		int count1 = 0;  			//count for string1
		int count2 = 0;  			//count for string2
		int countDiff = 0;			
		
		
		
		System.out.println("Enter first string: ");
		string1 = scnr.next();
		
				
                System.out.println("Enter second string: ");
		string2 = scnr.next();
		
		for (int i = 0; i < string1.length(); ++i) {
			char character = string1.charAt(i);
			int ascii = (int) character ;
			count1 = count1 + ascii;
			System.out.println(character + ": " + ascii);
		}	
		
		
		for (int i = 0; i < string2.length(); ++i) {
			char character = string2.charAt(i);
			int ascii = (int) character ;
			count2 = count2 + ascii;
			System.out.println(character + ": " + ascii);
		
		}
		
		countDiff = (count1 - count2);       //difference of the two strings
		
		System.out.println("Difference(as absolute value): " + Math.abs(countDiff));
		
	}
}
