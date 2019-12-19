/*Declare a Bicycle array.
Let's build an array for 10 bikes
Populate the array with 10 references to bicycles
Accelerate the bicycles in the odd elements (1,3,5,7,9).
Let's print out the status of each bicycle referenced in that array
*/

public class Bicycle {
	
	private int acceleration;
	
	
	public Bicycle (int acceleration) {
		
		this.acceleration = acceleration;
		
	}
	
	public void setAcceleration (int acceleration) {
		this.acceleration = acceleration;
	}
	
	public int getAcceleration () {
		return acceleration;
	}
	
}
