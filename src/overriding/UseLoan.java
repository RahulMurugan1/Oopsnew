package overriding;

public class UseLoan {
public static void main(String[] args) {
	Loan a  = new Loan () ;
	System.out.println(a.loanEligibility());
	System.out.println(a.loanEligibility("salery" , 15000));
	System.out.println(a.loanEligibility("salery" , "property", 15000 , 200000 ));
}
}
