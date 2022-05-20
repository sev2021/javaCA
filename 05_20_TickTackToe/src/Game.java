import java.util.*;
public class Game{
	//declare vars
	private char[] fields = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
	Scanner userScann = new Scanner(System.in);
		
	public void printFields() { ////////////// PRINT FIELD
		System.out.print("\n   a b c"); 
		for(int i=0; i<9; i++) {
			System.out.print((i%3 == 0)? 
					"\n" + (i/3 + 1) + " |" + fields[i] + "|"
					:fields[i] + "|"); 	
		}	
	}
	
	public boolean playerMove(char playerChar) { ///// ADD MOVE
		
		System.out.print("\nSelect the field (a1): ");
		String playerMove = userScann.next();
		
		while(!"a1 a2 a3 b1 b2 b3 c1 c2 c3".contains(playerMove)) {
			System.out.print("\nSelect CORECT field: ");
			playerMove = userScann.next();
		}
		
		int markChar = ((int)playerMove.charAt(0) - 97) 
				+ ((int)playerMove.charAt(1) - 49) * 3;
		if(fields[markChar] == '_') {
			fields[markChar] = playerChar;
			return false;
		}
		return true;
	}
	
	public String checkWinner() {  /// CHECK FOR WINNER
		int counTer = 0;
			
		for(int i=0; i<9; i++) {  // check rows
			if(i%3 == 0) counTer = 0;  // reset check counter
			counTer += fields[i];
			if(counTer == 264) return "Crosses";
			if(counTer == 237) return "Noughts";
		}
		
		for(int i=0; i<9; i++) {  // check downs
			if(i%3 == 0) counTer = 0;  // reset check counter
			counTer += fields[i%3 * 3 + i/3];
			if(counTer == 264) return "Crosses";
			if(counTer == 237) return "Noughts";
		}
		
		// check diagonal
		if(fields[0] + fields[4] + fields[8] == 264) return "Crosses";
		if(fields[2] + fields[4] + fields[6] == 264) return "Crosses";
		if(fields[0] + fields[4] + fields[8] == 237) return "Noughts";
		if(fields[2] + fields[4] + fields[6] == 237) return "Noughts";
					
		return "Both"; 
	}
	
	public static void main(String[] args) { 
		//declare vars, create objects
		char playerChar;
		String winner = "Both";
		Game myGame = new Game();
		
		
		/// BEHOLD!!
		System.out.println("Noughts and crosses");
		
		for(int i=0; i<9; i++) {  //// Start Game - 9 moves!
			
			playerChar = "XO".charAt(i%2);  ///toggle "X" and "O"
			
			System.out.print("\nMove " + i + " for: " + playerChar);
			myGame.printFields();
			
			while(myGame.playerMove(playerChar)) { /// if field is taken
				System.out.print("\nTHIS FIELD IS TAKEN!"
						+ "\nTRY AGAIN - Move " + i + " for: " + playerChar);
				myGame.printFields();
			}
			
			winner = myGame.checkWinner();
			if("CrossesNoughts".contains(winner)) break;
		}
		System.out.print("\n*** END OF GAME *** \n*** " +  winner + " wins! ***");
		myGame.printFields();
	}
}