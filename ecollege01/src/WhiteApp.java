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