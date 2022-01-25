/*
 * In Bank.java‘s main() method, we’re trying to access three 
 * different private fields from the CheckingAccount class. 
 * Edit the checking account class to make those fields public. 
 * Make sure to edit only the fields you need in order to make 
 * Bank‘s main() method run — don’t change any of the other 
 * fields in CheckingAccount.
 */
public class CheckingAccount{
  public String name;
  private int balance;
  private String id;

  //constructor1
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  public void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  public void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

}