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

public class FibMap {
	//declare variable
	
	public static int FibMap(int n, Map<Integer, Integer> myMap) {
		return n;
	}

	public static void main(String[] args) {
		//declare variable
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		System.out.println(FibMap(10, myMap));

		myMap = new HashMap<Integer, Integer>();
		System.out.println(FibMap(20, myMap));
	}
}
