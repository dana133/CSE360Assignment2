package cse360assign2;

public class AddingMachineTest {
	
	public static void main(String args[]) {
		AddingMachine myCalc = new AddingMachine();
		myCalc.add(2);
		myCalc.add(11);
		myCalc.subtract(7);
		System.out.println(myCalc.toString());
		myCalc.clear();
		System.out.println(myCalc.toString());
	}
}
