package homework;

public class mainRun {

	public static void main(String[] args) {
		
		questionFour runit = new questionFour () ;
		
		int sum= runit.addThreeNumbers(12, 50, 25);
		System.out.println(sum);
		
		runit.printBoolean(false);
		
		runit.printData();
		
		String name= runit.printMyName();
		System.out.println(name);
		
		boolean check= runit.checkEquality(6,6);
		System.out.println(check);
		
	}


}
