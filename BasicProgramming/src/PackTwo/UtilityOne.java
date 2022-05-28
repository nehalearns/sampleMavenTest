package PackTwo;

public class UtilityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		public int addThreeNumbers(int x, int y, int z) {
			
			int sum = x+y+z; 
			return sum; 
			
		}
		
		public boolean ifEligibleForLoan(int creditscore, int income) {
			
			boolean flag = true; 
			
			if(creditscore>700 && income > 50000) {
				
				flag=true; 
				System.out.println("eligible for loan");
				
			}
			
			else {
				
				flag=false; 
				System.out.println("not eligible for loan");
			}
			
			return flag; 
			
		}

	}
	}

}
