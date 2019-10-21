package cse360assign3;

public class AddingMachineTest {
	
	public static void main(String args[]) {
		calculator myCalc = new calculator();
		
		myCalc.add(2);
		myCalc.add(11);
		myCalc.subtract(7);
		myCalc.multiply(4);
		myCalc.power(5);
		myCalc.divide(6);
		System.out.println("total: " + myCalc.getTotal());
		System.out.println(myCalc.toString());
		myCalc.divide(0);
		System.out.println("total: " + myCalc.getTotal());
		System.out.println(myCalc.toString());
		myCalc.add(2);
		myCalc.add(11);
		System.out.println("total: " + myCalc.getTotal());
		System.out.println(myCalc.toString());
		/*myCalc.clear();
		System.out.println("total: " + myCalc.getTotal());
		System.out.println(myCalc.toString());*/
		
	}
}
