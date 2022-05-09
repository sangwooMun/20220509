package test1;

public class Restaurant implements Store{

	String storeName;
	double storeRatio;
	
	
	
	public Restaurant(String storeName, double storeRatio) {
		super();
		this.storeName = storeName;
		this.storeRatio = storeRatio;
	}


	@Override
	public String toString() {
		return "Restaurant [storeName=" + storeName + ", storeRatio=" + storeRatio + "]";
	}


	@Override
	public int card(int price) {
		price = (int) (price - (price *(CARD_PAYMENT_RATIO +  storeRatio)));
		return price;
	}


	@Override
	public int cash(int price) {
		price = (int) (price - (price *(CASH_PAYMENT_RATIO +  storeRatio)));
		return price;
	}


	@Override
	public void showInfo() {
		System.out.println("##### 의류매장입니다.");
		System.out.println("카드 결제 할인율 : " + (CARD_PAYMENT_RATIO +  storeRatio));
		System.out.println("현금 결제 할인율 : " + (CASH_PAYMENT_RATIO +  storeRatio));
		
	}
	
	
}
