package Subject;

public class account {
	private String account; //정수 정의
	private int balance;
	private double interestRate; 

	public account() 
	{
	}

	public account ( String account, int balance, double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount ( String account ) // account setter + getter
	{
		this.account = account;
	}
	public String getAccount () 
	{
		return account;
	}


	public void setBalance(int balance) // balance setter + getter
	{
		this.balance = balance;
	}
	public int getBalance () 
	{
		return balance;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public double getInterestRate()
	{
		return interestRate;
	}

	public double calculateInterest() 
	{
		return balance*interestRate;
	}

	public void deposit (int money)
	{
		balance = money + balance;
	}

	public void withdraw (int money)
	{
		balance = balance - money;
	}
}


