package packageTwo;

public class arrayTest {

	public static void main(String[] args) {
		
		//int a; 
		int x [] = new int[5];
		
		x[1]=34;
		x[2]=20;
		x[4]=87;
		
		System.out.println(x[3]);
		System.out.println(x[2]);
		
		//index starts at 0 up until the number inside []. You can store however many data you want to as 
		//long as you indicate inside [] the number of data you want to store. 
		
		
		String addresses []=new String [10];
		
		addresses[9]="fairfax";
		
		System.out.println(addresses[9]);
		System.out.println(addresses[0]);
		
		//you will get ArrayIndexOutOfBoundsException if you were to use 'System.out.println(addresses[11]);'
		//bc 11 is not within the bounds and the index starts at 0. 0 and an undeclared number both will give you null but
		// out of bounds will only sow when you try to print for an undeclared index variable.
		
	}

}
