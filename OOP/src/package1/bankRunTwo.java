package package1;

public class bankRunTwo {

	public static void main(String[] args) {
		
		checkingAccount michael = new checkingAccount("dflfj"); 
		
		bankAccount ba = new bankAccount("dfhdk");
		
		savingAccount jim = new savingAccount("dflfj");
		
	//bankAccount ba = new bankAccount("dfhdk"); this can become a comment and is no longer needed if you make the 
		//parent class bankAccount abstract
		
		jim.savingAmount=6700;
		
		michael.name="Michael";
		
		michael.setUpCheckingAccount();
		
		michael.transferMoney();
		
		

	}

}
