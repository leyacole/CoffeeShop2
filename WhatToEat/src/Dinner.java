//package java_unit_1;

import java.util.Scanner; 

public class Dinner {
	
		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		
		String eventType = null;
		int partySize = 0;
		String result;
		String mealSug = null;
		String prepSug = null;
		
		String string_1 = ("Since you're hosting a ");
		String string_2 = (" event for ");
		String string_3 = (" participants, you should serve ");
		String string_4 = (" prepared ");
		
		System.out.println("Enter one event type: (casual, semi-formal or formal): ");
		eventType = scnr.next();
		
						
		System.out.println("Enter number of dinner guest greater than 0:  ");
		partySize = scnr.nextInt();
		
		while (partySize <= 0) {
			System.out.println("Invalid number entered. Please enter a positve number: ");  //check for 0 or negative number
			partySize = scnr.nextInt();
		}
		
			
		switch (eventType) {
		   case "casual": mealSug = "sandwiches";
		   		break;
		   case "semi-formal": mealSug = "fried chicken";
		   		break;
		   case "formal": mealSug = "chicken parmesan";
		   		break;
		   default: mealSug = "Invalid event type";
		   		break;
		
		}
				
		switch (partySize) {
		   case 1: prepSug = "in the microwave.";
		   		break;
		   case 2: case 3: case 4: case 5: case 6: case 7:
		   case 8: case 9: case 10: case 11: case 12: 
			   prepSug = "in your kitchen.";
		   		break;
		   case 13: prepSug = "by a caterer.";
		   		break;
		   default: prepSug = "by a caterer.";
		   		break;
		}
				
		result = (string_1 + eventType + string_2 + partySize + string_3 + mealSug + string_4 + prepSug );
		
		if (eventType.contentEquals("casual")) {
			if (partySize == 1) {
				System.out.println(result);
			}
			else if (partySize >= 2) {
				System.out.println(result);
			}
			else if (partySize >= 13) {
				System.out.println(result);
			}
		}
		if (eventType.contentEquals("semi-formal")) {
			if (partySize == 1) {
				System.out.println(result);
			}
			else if (partySize >= 2) {
				System.out.println(result);
			}
			else if (partySize >= 13) {
				System.out.println(result);
			}
		}
		if 	(eventType.contentEquals("formal")) {
			if (partySize == 1) {
				System.out.println(result);
			}
			else if (partySize >= 2) {
				System.out.println(result);
			}
			else if (partySize >= 13) {
				System.out.println(result);
			}
		}
		
	}
}
