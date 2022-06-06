package Subject;

public class accountTest {
	public static void main(String[] args) {
		account account = new account("441-0290-1203",500000,7.3/100); 



		System.out.println("계좌정보: " + account.getAccount() + " 현재잔액: " + account.getBalance());

		account.deposit(20000); 
		account.calculateInterest(); 

		System.out.println("계좌정보: " + account.getAccount() + " 현재잔액: " + account.getBalance());
		System.out.println("이자: " + account.calculateInterest()); 
	}




}

