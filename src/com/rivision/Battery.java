package com.rivision;

public class Battery {
	private boolean isLiIon ;
	private int price ;
	private int mah ;
	
	
	public Battery(boolean isLiIon,int price ,int mah  ) {
		this.isLiIon = isLiIon ;
		this.price = price  ;
		this.mah = mah ;
	}
	public String toString() {
		return isLiIon +","+ price +"," + mah ;
	}

}
