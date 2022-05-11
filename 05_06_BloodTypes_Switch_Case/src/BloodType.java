/* develop an application that allows a user to enter their age and blood type. 
 * The app will then display a message outlining which blood groups the user 
 * can donate to and receive from. Please note that only 18+ can donate. public 
 * 
 * INPUT: users enter their age and blood type
 * PROCESS: compute which blood groups the user can donate to and receive from.
 * 				based on given blood type table. Note that only 18+ can donate
 * OUTPUT: display a message outlining which blood groups the user 
 * 				can donate to and receive from
*/
public class BloodType{
	//declare vars
	private String bloodType, receiveOutput, donateOutput;
	private int userAge;
	
	//constructor + setter
	public BloodType(int userAge, String bloodType) {
		this.userAge = userAge;
		this.bloodType = bloodType.toUpperCase();
		receiveOutput = "Your blood type is: " + this.bloodType + "."
				+ "\nYou can receive blood type: ";
		donateOutput = "\nYou can donate blood to type: ";
	}
	
	
	//compute
	public void computeBloodType() {
		switch(bloodType) {
			case "O":
				receiveOutput += " O.";
				donateOutput += " O, A, B and AB.";
				break;
			case "A":
				receiveOutput += " O and A.";
				donateOutput += " A and AB.";
				break;
			case "B":
				receiveOutput += " O and B.";
				donateOutput += " B and AB.";
				break;
			case "AB":
				receiveOutput += " O, A, B and AB.";
				donateOutput += " AB.";
				break;
			default:
				receiveOutput += "\n**** ERROR! ****" + bloodType;
		}
		
		if(userAge < 18) {
			donateOutput = "\nYou are too young to donate blood.";
		}
	}
	
	//getter method
	public String getDonateOutput() {
		return receiveOutput + donateOutput;
	}
}