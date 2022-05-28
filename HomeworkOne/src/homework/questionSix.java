package homework;

public class questionSix {

	public static void main(String[] args) {

//Create the car price calculator by calculating monthly payment for the car – the problem is to
//find car monthly payment – where data of the system will be base price, interest, Tax, credit
//score, down payment, duration of financing time (5/6/7 years). Interest should be calculated
//according to the credit score (you can create the scenario by yourself), tax is 7% of the base
//total out of the door price.
		
		double basePrice;
		double interestAmount;
		double tax;
		int creditScore;
		int months;
		double downPayment;
		double extraFees;
		double apr;
		
		double totalPriceOfCar; 
		double totalPricewithTax; 
		double taxToPay;
		double financeAmount; 
		double totalfinanceAmount;
		double interestToPay; 
		double monthlyPayment; 
		
		basePrice = 25000 ;
		downPayment= 5000;
		tax = 7 ;
		extraFees = 1000;
		months = 72;
		
		creditScore= 475;
		apr= 10;
		
		
		
		totalPriceOfCar = basePrice + extraFees ;
		
		System.out.println("Total price of the car ...");
		System.out.println(totalPriceOfCar);
		
		
		
		taxToPay = totalPriceOfCar * (tax/100);
		
		System.out.println("Tax to be paid ...");
		System.out.println(taxToPay);
		
		
		
		totalPricewithTax = totalPriceOfCar + taxToPay;
		
		System.out.println("Total price with Tax ...");
		System.out.println(totalPricewithTax);
		
		
		
		financeAmount = totalPricewithTax - downPayment;
		
		System.out.println("Finacing amount for the car ...");
		System.out.println(financeAmount);
		
		
		if (creditScore > 700 ) { 
			
			apr = 1;
		
		}

		else if (creditScore <=700 && creditScore >600) { 
			
			apr = 2;
		}

		else if (creditScore <=600 && creditScore > 500) {
			
			apr = 3;
			
		}
		
		else if (creditScore <=500 && creditScore > 400) {
			
			apr =10;
		}
		
		
		else { System.out.println("You cannot buy a car");
		
		}
	
		
		interestToPay = financeAmount *(apr/100);
		
		System.out.println("Interest to pay is...");
		System.out.println(interestToPay);
		
		
		
		totalfinanceAmount = financeAmount + interestToPay;
		
		System.out.println("Total finance amount is...");
		System.out.println(totalfinanceAmount);
		
		
		
		monthlyPayment=totalfinanceAmount/months; 
		
		System.out.println("Monthly payment for the car...");
		System.out.println(monthlyPayment);
		
		
	}

}
