package cse360assign3;
/**
 * @Assignment: 3
 * @author Dana Lee
 * @Class: CSE 360
 * This class is a child class of the AddingMachine class. It includes the divide, multiply, and power methods. 
 */
public class calculator extends AddingMachine{
	
	public calculator() {
		super();
	}
	/**
	 * 
	 * @param value divides the total, sets total to 0 if division by 0 is attempted
	 */
	public void divide(int value) {
		if(value == 0) {
			total = 0;
			history = "(" + history + ") / " + value;
		}
		else {
			total = total/value;
			history = "(" + history + ") / " + value;
		}
	}
	
	/**
	 * 
	 * @param value gets multiplied with total
	 */
	public void multiply(int value) {
		total = total * value;
		history = "(" + history + ") * " + value;
	}
	
	/**
	 * 
	 * @param value is the power the total is raised to; sets total to 0 if negative exponent is entered
	 */
	public void power(int value) {
		if(value < 0) {
			total = 0;
			history = "(" + history + ") ^ " + value;
		}
		else {
			total = (int) Math.pow(total, value);
			history = "(" + history + ") ^ " + value;
		}
	}
}
