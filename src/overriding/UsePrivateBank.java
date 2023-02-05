package overriding;

public class UsePrivateBank {
	public static void main(String[] args) {
		PrivateBank p = new PrivateBank () ;
		System.out.println(p.setIntrest(100000));
	
	Bank b = new Bank() ;
 System.out.println(b.setIntrest(100000));
 
 
 Bank ba = new PrivateBank() ;
 System.out.println(ba.setIntrest(100000));
}

}
