import java.util.*;
public class Test{
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
		
		while(!"a1a2a3b1b2b3c1c2c3".contains(playerMove)) {
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
	
	public String checkWinner() {  /// CHECK IF WON
		int counTer = 0;
			
		// check rows
		if(Arrays.toString(fields).contains("X, X, X")) return "Crosses";
		if(Arrays.toString(fields).contains("O, O, O")) return "Noughts";
		
		// check diagonal
		if(fields[0]=='X' && fields[4]=='X' && fields[8]=='X') return "Crosses";
		if(fields[2]=='X' && fields[4]=='X' && fields[6]=='X') return "Crosses";
		if(fields[0]=='O' && fields[4]=='O' && fields[8]=='O') return "Crosses";
		if(fields[2]=='O' && fields[4]=='O' && fields[6]=='O') return "Crosses";
			
		for(int i=0; i<9; i++) {  // check downs
			if(i%3 == 0) counTer = 0;  // reset check counter
			counTer += (int)fields[i%3 * 3 + i/3];
			if(counTer == 264) return "Crosses";
			if(counTer == 237) return "Noughts";
		}
			
		return "Both"; 
	}
	
	public static void main(String[] args) { 
		//declare vars, create objects
		char playerChar;
		String winner = "Both";
		Test game = new Test();
		
		/// BEHOLD!!
		System.out.println("Noughts and crosses");
		
		for(int i=0; i<9; i++) {  //// Start Game - 9 moves!
			
			playerChar = "XO".charAt(i%2);  ///toggle "X" and "O"
			
			System.out.print("\nMove " + i + " for: " + playerChar);
			game.printFields();
			
			while(game.playerMove(playerChar)) { /// if field is taken
				System.out.print("\nTHIS FIELD IS TAKEN!"
						+ "\nTRY AGAIN - Move " + i + " for: " + playerChar);
				game.printFields();
			}
			
			winner = game.checkWinner();
			if("CrossesNoughts".contains(winner)) break;
		}
		System.out.print("\n*** END OF GAME *** \n** " +  winner + " wins! **");
		game.printFields();
	}
}
