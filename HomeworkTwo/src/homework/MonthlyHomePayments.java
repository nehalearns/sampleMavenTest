package homework;

public class MonthlyHomePayments {

public static void main(String[] args) {
	//Create a java program to calculate the monthly home payment when a home buyer applies for the loan. 
	//It should ask for credit score for the interest rate:
	
	//Your program should ask for the Base price of the home.
	//You program should ask for the loan terms (20-30 years).
	//After all this information your program should print the monthly payment amount.
	//This program is already solved in the class (see the sample code).

	
	double housePrice= 500000;
	double downPayment=50000; 
	double apr=1.5;
	int creditScore = 780; 
	int months = 360;
	double interestToPay; 
	double monthlyPayment; 
	double totalPriceOfFinance;
	double loanAmount;
	
	
	if (creditScore > 760) {
		
		apr= 1.5 ;
		
	}
	
	else if (creditScore <= 760 && creditScore>700) {
		
		apr= 3 ;
				
	}
	
	else if (creditScore <= 700 && creditScore>650) {
		
		apr= 4 ;
				
	}
	
    else if (creditScore <= 650 && creditScore>600) {
		
		apr= 5 ;
				
	}
	
    else {
    	
    	System.out.println("You are not eligible for home buying loan");
    }
	
	loanAmount = housePrice - downPayment ;
	System.out.println("Total loan amount is ...");
	System.out.println(loanAmount);
	
	
	interestToPay = loanAmount *(apr/100);
	System.out.println("Total interest to pay ...");
	System.out.println(interestToPay);
	
	
	totalPriceOfFinance =  interestToPay + loanAmount ;
	System.out.println("Total price home financing ...");
	System.out.println(totalPriceOfFinance);
	
	
	monthlyPayment = totalPriceOfFinance / months ;
	System.out.println("Total monthly payment is ...");
	System.out.println(monthlyPayment);
	
	
}
}
	
	
	
	
	
	
