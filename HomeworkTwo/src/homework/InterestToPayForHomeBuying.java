package homework;

public class InterestToPayForHomeBuying {

	
	
	public double totalPriceOfFinance(double interestToPay, double loanAmount) {
		
		double totalFinancePrice = interestToPay + loanAmount; 
		return totalFinancePrice; 
		
	}
	
	public double getApr (int creditScore) {
		
		double apr= 4 ;

	
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

    return apr;
	
	}	
}

