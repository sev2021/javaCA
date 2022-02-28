import java.util.Scanner;
public class Rands {
	/* Generate range of random numbers,
  *  compute average and find nearest random number(s).
  */
  
  public static void main(String[] args) {
		//declare variavles
		double randAver = 0;
		int[] randInt = new int[10]; //hardcoded, can be changed
		String nearRandMessage = "";
		double nearRand = 200;	//hardcoded, can be changed
		
		
		//input
		for(int i=0; i<randInt.length; i++) {
			randInt[i] = (int)(Math.random() * 100) - 50; //hardcoded, can be changed
			randAver += randInt[i];
			System.out.print(randInt[i] + ", ");
		}
		
		//compute
		randAver /= randInt.length;		
		System.out.println("\nAverage: " + randAver + "\n\nDistance to average:");
		
		for(int i=0; i<randInt.length; i++) {
			double randDistance = Math.abs(randInt[i]-randAver);
			System.out.print(randInt[i] + "(" + randDistance + "), ");
			if(randDistance < nearRand) {
				nearRand = randDistance;
				nearRandMessage = "\n\nNearest number to average " + randAver + " is number " + randInt[i];
			}
			else if(randDistance == nearRand) {
				nearRandMessage += " AND NUMBER " + randInt[i];
			}
		}
		
    //output
		System.out.print(nearRandMessage);
	}
}
