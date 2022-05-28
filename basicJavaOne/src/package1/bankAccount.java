package package1;

public class bankAccount {

	// global variable , properties of the class
	
		int amountOfMoney; //can be used outside of function and throughout the package
		
		int x;
		
		public bankAccount(int amountOfMoney) {
			
			System.out.println("an object is created");
			System.out.println("line of code executing");
			
		}
		
        public bankAccount() {
			
			System.out.println("an object is now created");
			
			
		}
		

		
		
		public void deposit(int y) {
			int x; //this x will refer to the local variable x since we mentioned int x; but if we did not put int x and put just x=34 then it would be the global variable
			x= 34; //in this scenario if you still want to refer to the value of the global x you have to use "this.x=34;" 
			
			
			
		}
		
		public void checkAccount() {
			
			int x; 
			
		}

	}



	
