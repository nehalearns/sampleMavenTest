package package1;

public class checkingAccount extends bankAccount {
	
	
	
	
	public checkingAccount(String name) {
		
//using the super(name); will give access to the name variable from the parent class and without this super 
//keyword the function will not work since it is a constructor and the constructor is coming from the parent class 
		
		super(name);
		
		
	}


	String checkingAccountNumber; 
	
	
	public void setUpCheckingAccount() {
		
		System.out.println("setting up checking account");
		
	}
	
//show below is a function in the parent class written once again here in child class but using super keyword allows
//to use the exact function from parent class
	
//in the function below note that it is in the parent class bankAccount as well and we rewrote this in this child class 
//again and to be able to use the value from the parent class we used the super keyword and it gets the same function from 
//parent class. 
	
// if you don't use the super keyword then it will be considered method overriding and so the child class has to use its own 
//function if that function is already in parents class.
	public void transferMoney() {
		
		super.transferMoney();
		
	}
	
	

}