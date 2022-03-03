/*
* Create a memo map
* 
* fibMemo(n, map)
*   if n is 0 or 1
*     return n
*   if n key exists in map
*     return map.get(n)
*   else
*     calculate current fibonacci number through a recursive call
*     store value in map
*     return value
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibMap { //Fibonacci Sequence using recursion and memoization
	//declare variable
	
	// static method FibMap is static because of recursion requirements
	public static int FibMap(int n, Map<Integer, Integer> myMap) {
		if(n < 2) {
			return 1;
		}
		if(myMap.containsKey(n)) { //memoization - use of previously computed values
			return myMap.get(n);
		}
		
		int forMap = FibMap(n-1, myMap) + FibMap(n-2, myMap);
		myMap.put(n, forMap);
		// System.out.println(myMap.toString()); // debug only
		return forMap;
	}

	public static void main(String[] args) {
		//declare variable
		int userInput;
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		//input
		System.out.print("Enter number to compute Fibonacci Sequence: ");
		userInput = new Scanner(System.in).nextInt();
		
		//compute
		System.out.println(FibMap(userInput, myMap));
	}
}
