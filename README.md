Java links:
* https://www.jdoodle.com/online-java-compiler/
  
  
**1D arrays in Java:** 
  
  int tabl[ ] = {1, 2, 3};  
  int tabl[ ] = new int[3];  
  int tabl[ ] = new int[]{1,2,3};  
  -or-  
  int[] tabl;   //array declaration   
  tabl = new int[4];  //array initiation for size of 4  
  ...  
  tabl = new int[8];  //array initiation for size of 8  
  ...  

 **2D arrays in Java:**  
 
  int tabl[ ][ ] = {{1, 2}, {4, 6}, {7, 8}, {11, 25}};  
  int tabl[ ][ ] = {{1, 2, 3}, {4, 6}, {7, 8, 9, 10}, {11, 25}}; - variouas inner arrays allowed  
  int tabl[ ][ ] = new int[2][5];  
  
**Array iteration simple way**
  
  int arr[ ] = {11,22,33,44};  
  for(int a: arr) {System.out.println(a)};  
  
**Array to String translation**  
  
  import java.util.Arrays;  
  int[] arr = {22,33,44};  
  String srr = Arrays.toString(arr);  
  
 **-------------------------------------------**  
 **CLI input in Java:**
 
  import java.util.Scanner;  
  ...  
  Scanner keyboard = new Scanner(System.in);  
  ...  
  input = keyboard.nextInt(); 
  
  
 **dialogs in Java:**
 
  import javax.swing.JOptionPane;  
  JOptionPane.showInputDialog("message_here");
  JOptionPane.showMessageDialog(null, "message_here");
  int a = JOptionPane.showOptionDialog(null, "Messagin in dialog", null, 2, 3, null, arr1, 2);  
  (manual: int a = JOptionPane.showOptionDialog(null, arr1, null, a, a, null, args, arr1);)  
  
**-------------------------------------------**  
**class template**  
//declare vars  
//constructor  
//set method  
//compute  
//get method  
  
**app template**  
//declare vars  
//declare and create objects  
//set  
//compute  
//get  
//output  
  
