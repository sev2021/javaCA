import java.io.File;
import java.io.IOException;

public class Fib{
	public static void main (String[] args){
		try{
			File myFile = new File("aa.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File already exist!");
			}
		} catch(IOException e){
			System.out.print("Error occured:");
			e.printStackTrace();
		}
	}
}
