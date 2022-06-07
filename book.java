package Subject;

public class book {
	String title;
	int price;
	double discountRate;
	

	public book() {
		super();

	}

	public book(String title, int price, double discountRate, int sum, double sum1) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		
	}

	public String getTitle() {
		return title;
	}


	public int getPrice() {
		return price;
	}


	public double getDiscountRate() {
		return discountRate;



	}
	

}
