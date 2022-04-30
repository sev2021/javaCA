public class Intsize{
	public static void main(String[] args) {
		// declare variables
		// integer limit 2^32 (+/- 2_147_483_648)
		int a=10_000_000;
		
		
		for(int i=0;i<20;i++) {

			System.out.println((200 + i) + " - " + (200 + i) * a);
		}

	}
}
