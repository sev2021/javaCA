// Example of using for loops with multiple parameters:
// i - index
// f1, f2 - Fibonacci counters
// v - additional temporary value to store f1 or f2 value


public class White{

	public static void main(String[] args) {
		//declare variable
		int rounds = 11;
		
		for(int i=0, f1=1, f2=1, v=0;  i<rounds;  v=f1, f1=f2, f2+=v, i++) {
			System.out.println(i + " - " + f1 + " - " + f2);
		}
	}
}
