//Lab 2
import java.util.Scanner;

public class RoomGenerator {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		float length;
		float width;
		float area;
		float perimeter;
		char contin;
		
		System.out.println("Welcome to Grand Circus' Room Generator!");
		System.out.println("");
		
		System.out.println("Enter Length: ");
		length = scnr.nextFloat();
		
		System.out.println("Enter Width: ");
		width = scnr.nextFloat();
		
		area = (length * width);
		System.out.println("Area: " + area);
		
		perimeter = 2 *(length + width);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("");
		
		System.out.println("Continue? (y/n): ");
		contin = scnr.next().charAt(0);
				
		
		while (contin == 'y') {
			System.out.println("Enter Length: ");
			length = scnr.nextFloat();
			
			System.out.println("Enter Width: ");
			width = scnr.nextFloat();
			
			area = (length * width);
			System.out.println("Area: " + area);
			
			perimeter = 2 *(length + width);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("");
			
			System.out.println("Continue? (y/n): ");
			contin = scnr.next().charAt(0);
					
		}
		
			
	}

}


