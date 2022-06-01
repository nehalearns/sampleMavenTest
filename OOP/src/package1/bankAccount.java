package package1;

public class bankAccount {

	// global variable are the properties or attributes of the class
		String name; 
		String address; 
		int amountOfmoney; 
		String ssn; 
		
		//static is only part of class
		static int countClient; 
		
		// nothing in this class can be run until you make an object of these functions and a runnable class.
		//constructor will execute every time an object is created 
		
		
	  //below are two different constructors and we see example of constructor overloading
		public bankAccount() {
				
				//this.name=name; 
				System.out.println("An object is created");
				
			}
		
	   public bankAccount(String name) {
			
			this.name=name; 
			System.out.println("An object is created with name");
			
		}
	   
	   
	   
	// static is only part of this class not the object		
		public static void countClientsNumber() {
			
				
		}
		
		
		// static is only part of this class not the object	
		
	   public static void closeAccount() {
			
			System.out.println("closing account");
			
		}
		
		
		public void transferMoney() {
			System.out.println("transferring money");
			depositMoney();
			
		}
		
		
	// to keep the same name of the function and have two functions you set parameters. Without parameters even with return type the function remains the same. 
	// Method overloading shown below: include parameters to use same function differently.	
		
		 void depositMoney() {
			
		System.out.println("depositing money");
			
		}
		
	
		public void depositMoney(int x) {
			
			System.out.println("depositing money in ATM");
			
			 
			
		}
		
		
		
		
		
		public void withdrawMoney() {
			
			System.out.println("withdrawing money");
			
		}
		
		
		
		
		
		
		
		
		

	}
	

