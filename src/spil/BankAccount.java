package spil;

public class BankAccount {

	private int balance;
	//initiate Bank Account 
	public BankAccount(int balance){
		
		if (balance < 0)
			this.balance = 0;
		else 
			this.balance = balance;
	}
	//se if player balance reached 3000
//	public boolean isWin(){
//		
//		return this.balance >= 3000;
//	}
	
	public void Deposit(int amount){
		
		
	}
	
	public void Withdraw(int amount){
		
		if ((this.balance + amount)<0)
			this.balance = 0;
		else
			this.balance = this.balance + amount;
		
		
	}
	public int getBalance() 
	{
		return this.balance;
	}
	
	
	
	
	


}
