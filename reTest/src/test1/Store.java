package test1;

public interface Store {
	public double CARD_PAYMENT_RATIO = 0.01;
	public double CASH_PAYMENT_RATIO = 0.03;
	
	public int card(int price);
	public int cash(int price);
	
	public void showInfo();

}
