package homework;

import java.util.Scanner;

public class HomePaymentsScannerClass {

	public static void main(String[] args) throws InterruptedException {
		
Scanner calc = new Scanner(System.in);
		
		InterestToPayForHomeBuying utility = new InterestToPayForHomeBuying ();
		
		System.out.println("Enter the home price...");
		double housePrice = calc.nextDouble(); 
		
		System.out.println("Enter the down payment amount...");
		double downPayment = calc.nextDouble(); 
		
		Thread.sleep(1000);
		System.out.println("Enter the loan term in months...");
		int months = calc.nextInt(); 
		
		System.out.println("Enter your credit score...");
		int creditScore = calc.nextInt(); 
		

	
		
		
		
		
		
		
		
		double apr=1.5;
		
		double interestToPay; 
		
		double totalPriceOfFinance;
		
		double loanAmount;
		
		
	//	if (creditScore > 760) {
			
		//	apr= 1.5 ;
			
	//	}
		
	//	else if (creditScore <= 760 && creditScore>700) {
			
	//		apr= 3 ;
					
	//	}
		
	//	else if (creditScore <= 700 && creditScore>650) {
			
	//		apr= 4 ;
					
	//	}
		
	//    else if (creditScore <= 650 && creditScore>600) {
			
	//		apr= 5 ;
					
	//	}
		
	//    else {
	    	
	//    	System.out.println("You are not eligible for home buying loan");
	//    }
		
		loanAmount = housePrice - downPayment ;
		//System.out.println("Total loan amount is ...");
		//System.out.println(loanAmount);
		
		
		interestToPay = loanAmount *(apr/100);
		//System.out.println("Total interest to pay ...");
		//System.out.println(interestToPay);
		
		
		totalPriceOfFinance =  interestToPay + loanAmount ;
		//System.out.println("Total price home financing ...");
		//System.out.println(totalPriceOfFinance);
		
		
		double monthlyPayment = totalPriceOfFinance / months ;
		System.out.println("Total monthly payment is ...");
		System.out.println(monthlyPayment);
		
		//System.out.println("Monthly payment for the car...");
		//double monthlyPayment = calc.nextDouble();
		
		
		
		//call out function from InterestToPayFroHome class:
		double APR;
		APR = utility.getApr(656);
		System.out.println("Printing Apr from utility class...");
		System.out.println(APR);
		
		
		
		double price= utility.totalPriceOfFinance(20000, 450000);
		System.out.println("Printing total financing price from utility class...");
		System.out.println(price);
	}
}
