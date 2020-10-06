package cse360assignment02;

public class AddingMachine {
  private int total;
  private string transactions = "";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    transactions="0";
  }
  
  public int getTotal () {
    //return 0;
    return total;
  }
  
  public void add (int value) {
    total = total + value;
    string+=" + "+value;
  }

  public void subtract (int value) {
    total = total - value
    string+=" - "+value;  
  }

  public String toString () {
    return transactions;
  }

  public void clear() {
      transactions = "0";
      total = 0;
  }
}