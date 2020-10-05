package cse360assignment02;
/**
 * main method, create the variables
 * 
 */  
public class AddingMachine {		
	private int total;				//create variable
	private String holdOperations;
/**
 * constructor, set the variables to initial value
 * 
 */  
  public AddingMachine () {
    total = 0;  					// not needed - included for clarity
    holdOperations = "0";
  }
/**
 * method for getting the total after the operations
 * @return the total
 *
 */  
  public int getTotal () {			
    return total;					
  }
/**
 * @param value for adding, does not return
 * 
 */ 
  public void add (int value) {		
	  total = total + value;
	  holdOperations += " " + "+" + " " + value;
  }
  	
/**
 * @param value for subtracting, does not return
 * 
 */
public void subtract (int value) {
	  total = total - value;
	  holdOperations +=  " " + "-" + " " + value;
  }
/**
 * concatenate the strings 
 *
 */
 public String toString () {		
    return holdOperations ;
  }
/**
 * clear method to reset the memory back to 0
 *
 */
  public void clear() {		
	  total = 0;
  }
}

