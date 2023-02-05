package overriding;

public class Loan {
	int a  =30000 ;
	
		
		public int loanEligibility () {
			
			return a ;
		}
	public int loanEligibility (String salery , int b) {  
			
			return a + (b*10);   
	}
	public int loanEligibility (String salery , String property ,int b , int c ) {
		
		return a + (b*10 ) + (c*20/100);
	}
}

