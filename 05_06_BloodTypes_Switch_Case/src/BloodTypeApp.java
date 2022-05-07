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
import java.util.Scanner;
public class WhiteApp{
	public static void main(String[] args) {
		//declare vars
		String bloodType = "";
		String[] typesArray = {"O", "A", "B", "AB"};
		int userAge;
				
		//input
		System.out.print("What is your age? ");
		userAge = new Scanner(System.in).nextInt();
		
		loopBreakLabel:
		while(true){
			System.out.print("What is your blood type?"
					+ "(Must be whitin O, A, B or AB): ");
			bloodType = new Scanner(System.in).next();
			for(String check: typesArray) {
				if(bloodType.equalsIgnoreCase(check)) break loopBreakLabel;
			}
		}
		
		//create object + set
		White bloodDonate = new White(userAge, bloodType);
		
		//compute blood donation
		bloodDonate.computeBloodType();
		
		//get output
		System.out.print(bloodDonate.getDonateOutput());
	}
}