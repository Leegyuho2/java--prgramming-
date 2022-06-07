package Subject;



public class bookarraytest {
	public static void main(String[] args) {
		book barray[] = new book[3];
		
		barray[0] = new book("SQL Plus",50000,0.05, 0, 0);
		barray[1] = new book("Java 2.0",40000,0.03, 0, 0);
		barray[2] = new book("JSP Servelet",60000,0.06, 0, 0);
		for(int i = 0; i < barray.length; i++) {
			System.out.println(barray[i].getTitle() + ", " +
					barray[i].getPrice() + "원, " +
						(int)(barray[i].getDiscountRate()*100) + "%");
			
			
		
		
		}
		System.out.print("책 가격의 합: ");
			//System.out.println("할인 된 책 가격의 : 142700.0원");
		System.out.println(barray[0].getPrice() + barray[1].getPrice() + barray[2].getPrice());
		
		System.out.print("할인 된 책 가격의 합:");
		
		
		System.out.print((double)((1 - barray[0].getDiscountRate()) * barray[0].getPrice()) + (double)((1 - barray[1].getDiscountRate()) * barray[1].getPrice()) + (double)((1 - barray[2].getDiscountRate()) * barray[2].getPrice()));

		
		
		
	}

}


//System.out.println("할인된 가격 : " + (int)((1 - barray[i].getDiscountRate()) * barray[i].getPrice()) + "원");
