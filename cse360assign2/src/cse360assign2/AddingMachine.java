package cse360assign2;

/**
 * @Assignment: 2
 * @author Dana Lee
 * @Class: CSE 360
 * This class changes and accesses a total. It also keeps track of the operations done to the total in a string.
 * 
 */
public class AddingMachine {
	private int total;
	private String history = "0";
	
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
	}
	
}