package cse360assignment02;

public class AddingMachine {
  private int total;
  //Creating the transaction string
  private string transactions;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    //Initializing string to 0
    transactions="0";
  }
  
  public int getTotal () {
    //return 0;
    // Returning the total value
    return total;
  }
  
  public void add (int value) {
    //Adding parameter to total variable
    total = total + value;
    string+=" + "+value;
  }

  public void subtract (int value) {
    //Subtract parameter from total variable
    total = total - value
    string+=" - "+value;  
  }

  public String toString () {
    // Returning the transactions
    return transactions;
  }

  public void clear() {
      transactions = "0";
      total = 0;
  }
}