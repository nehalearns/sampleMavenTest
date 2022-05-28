package package1;

public class basicClass {

//void means it is not returning anything and empty parenthesis means it is taking no parameters
	
public void printSomething() {
		
		System.out.println("I am printing something");
		
	}
	
//public int sum means it will return an integer and the parameters here are int x and int y. it is taking
//two int for parameters.

	public int sum(int x, int y) {
		
		int sum = x+y; 
		
		return sum; 
		
	}

//public string means it will return string and the empty parenthesis means no parameters
	
	public String getMyname() {
		
		String name = "John";
		
		return name; 
		
	}
	
	
	public double celsisusToFarenthite(double celsius){

		double farenhite; 

		farenhite = (celsius * 1.8) + 32;
		
		//System.out.println(farenhite);
		
		return farenhite;

		}
	
	
}
