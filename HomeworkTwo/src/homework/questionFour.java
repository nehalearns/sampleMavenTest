package homework;

public class questionFour {

	//Create a java non-runnable class and create 5 functions in the class, 
	//you can give any names for the functions:
	
	
	//Function-1 will take 3 integer number as inputs and return the summation of the 3 numbers function 
	//name: add3Numbers
	
public int addThreeNumbers (int num1, int num2, int num3) {
		
		int sum= num1 +num2+ num3 ;
		return sum;
	}

	
	//Function -2 will take 1 string as input and print the value of the string; it will not return 
	//anything function name: printData
	
	public void printData () {
		String name= "Neha";
		System.out.println("This is printing my name");
		System.out.println(name); 
	}
	
	
	//Function-3 will take 2 numbers as input and returns a Boolean value true if the two numbers are 
	//equal otherwise will return false function name: checkEquality
	
	public boolean checkEquality(int a, int b) {

		if (a == b) {
			return true;
		} 
		
		else {
			
			return false;
		}
	}
	
	
	//Function-4 will not take any input and just print your name whenever the function will be called, 
	//will not return any output also function name: printName 
	
	public String printMyName () {
		
		String name = "neha";
		return name;
		
	}
	
	
	//Function-5 will take a Boolean value as input and print the value in the console, 
	//will not return anything, function name: printboolean
	
	public void printBoolean (boolean x) {
		
		 x = true ;
		 
		System.out.println(x);
		
	}
	
	
	
}
