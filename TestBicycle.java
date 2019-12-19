import java.util.Scanner;

/* Declare a Bicycle array.
Let's build an array for 10 bikes
Populate the array with 10 references to bicycles
Accelerate the bicycles in the odd elements (1,3,5,7,9).
Let's print out the status of each bicycle referenced in that array
*/

public class TestBicycle {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
				
		System.out.println("Enter the amount of bikes that you are going to enter:");
		int quantity = myObj.nextInt();
		
		Bicycle[] bike = new Bicycle [quantity];
		
		System.out.println("Enter the acceleration of the bike:");
		int acceleration = myObj.nextInt();
		
		for (int i = 0; i < bike.length ; i++) 
		{
						
			bike[i] = new Bicycle (acceleration);
			
		}
		
		for (int i = 0; i < bike.length ; i++) 
		{

		if ((i==1) || (i==3) || (i==5) || (i==7) || (i==9)) {
			bike[i].setAcceleration(acceleration + 3);
		}
		}
		
		System.out.printf("\n %-20s", "ACCELERATION");
		
		for (int i = 0; i < bike.length ; i++) {
			System.out.printf("\n %-20s", bike[i].getAcceleration());

		}
		
		myObj.close();
}
}
