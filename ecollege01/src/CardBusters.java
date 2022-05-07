//Java Foundations - Interim Practical Assessment
//Exercise 1
public class CardBusters {
	public static void main(String[] args) {
		//variable declaration and initiation
		int[] player1arr = {10,6,8,9,7,12,7};
		int[] player2arr = {7,6,9,5,2,8,11};
		int player1wins = 0;
		int player2wins = 0;
		
		int rounds = player1arr.length < player1arr.length? player1arr.length: player2arr.length;
		
		//compute results
		//output results
		System.out.println("********************Play Card Busters!!!***********************");
		
		for(int round=0; round<rounds; round++) {
			
			System.out.print("\nRound No: " + (round + 1));
			
			if(player1arr[round] > player2arr[round]) {
				player1wins++;
				System.out.println("- Player 1 wins the round: " 
						+ player1arr[round] + " beats " + player2arr[round] );
			}
			
			else if(player1arr[round] < player2arr[round]) {
				player2wins++;
				System.out.println("- Player 2 wins the round: " 
						+ player2arr[round] + " beats " + player1arr[round] );
			}
			else {
				System.out.println("- Tie! " + player1arr[round] 
						+ " ties with " + player1arr[round] );
			}
		}
				
		//final results output
		if(player1wins > player2wins) {
			System.out.println("\nPlayer One wins!! He won " + player1wins
					+ " rounds beating Player Two who won " + player2wins + " rounds!");
		}
		else if(player1wins < player2wins) {
			System.out.println("\nPlayer Two wins!! He won " + player2wins
					+ " rounds beating Player One who won " + player1wins + " rounds!");
		}
		else {
			System.out.println("\nIt's a tie!! Player One and Player Two both won "
					+ player1wins + " rounds!");
		}

		System.out.println("\nGoodbye!");
	}

}
