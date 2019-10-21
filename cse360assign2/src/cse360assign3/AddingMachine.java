package cse360assign3;

/**
 * @Assignment: 3
 * @author Dana Lee
 * @Class: CSE 360
 * This class changes and accesses a total. It also keeps track of the operations done to the total in a string. It is extended by the 
 * calculator class.
 * 
 */
public class AddingMachine {
	protected int total;
	protected String history = "0";
	
	/**
	 * constructor, sets total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * @returns total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value is added to total
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * 
	 * @param value is subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * returns a string with operation history
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * clears operation history
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
	
}