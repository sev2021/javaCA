/*
 * In Bank.java‘s main() method, we’re trying to access three 
 * different private fields from the CheckingAccount class. 
 * Edit the checking account class to make those fields public. 
 * Make sure to edit only the fields you need in order to make 
 * Bank‘s main() method run — don’t change any of the other 
 * fields in CheckingAccount.
 */
public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name);
    bankOfGods.accountOne.addFunds(5);
    bankOfGods.accountOne.getInfo();

  }

}