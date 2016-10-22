package spil;

public class Bank {
	private int balance;
	
	public Bank(){
		this(3000);
	}
	
	
	//initiate Bank Account and if balance is negative set it to 0
	public Bank(int balance){
		
		if (balance < 0)
			this.balance = 0;
		else 
			this.balance = balance;
	}

	//Prevent balance to become negative
	public void changeBalance(int amount){
		
		if ((this.balance - amount)<0)
			this.balance = 0;
		else
			this.balance -= amount;		
	}
	
	/**
	 * Return balance from Balance object
	 * @return
	 */
	public int getBalance() 
	{
		return this.balance;
	}

}
