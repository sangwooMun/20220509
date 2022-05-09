package test1;

public class paymentMain {

	public static void main(String[] args) {
		int price = 50000;
		
		Store clothes = new Clothes("의류", 0.02);
		clothes.showInfo();
		System.out.println("카드 결제 금액 : " + clothes.card(price));
		System.out.println("현금 결제 금액 : " + clothes.cash(price));
		
		price = 10000;
		
		Store restaurant = new Restaurant("식당", 0.03);
		restaurant.showInfo();
		System.out.println("카드 결제 금액 : " + restaurant.card(price));
		System.out.println("현금 결제 금약 : " + restaurant.cash(price));

	}

}
