package overriding;

public class PrivateBank  extends Bank {
	public int setIntrest(int amount) {
		return amount * 7/100 ;
	}
public boolean isCivilBank () {
	return true ;
}
}
