package differentDataType;

public class Addition {

	//this function adds two numbers
	//inside the parenthesis you put certain parameters
	//in this function the parameters are two integer values
	//name of the function is addTwoNumbers. Try to put names that are meaningful towards the function.
	//make sure to add return statement when you create functions
	//public int means you are declaring that this function will return an integer hence the return statement 
	public int addTwoNumbers (int num1, int num2) {
		
		int sum= num1 + num2 ;
		return sum;
		
	}
		
	public int addThreeNumbers (int num1, int num2, int num3) {
		
		int sum= num1 +num2+ num3 ;
		return sum;

		
	}
	
	public int addFourNumbers (int num1, int num2, int num3, int num4) {

		int sum = num1 + num2 + num3+ num4;
		System.out.println(sum);
		return sum;
	}
	
	public void addNumbers() {

		int sum = 50 + 50;
		System.out.println(sum);
	}
}
