package Task11;

public class Account {
	int accountNo;
	double balance;

	public Account() {
		this.accountNo = 0;
		this.balance = 0.0;
	}

	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	 // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance+= amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
    
    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Current Balance: $" + balance);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 =new Account();
		Account acc2 =new Account(12345,12000.0);
		System.out.println("Account No is "+acc1.accountNo);
		System.out.println("Balance amount is "+acc1.balance);
		acc1.deposit(2000);
		acc1.withdraw(1000);
		acc1.checkBalance();
		
		System.out.println();
		System.out.println("Account No is "+acc2.accountNo);
		System.out.println("Balance amount is "+acc2.balance);
		acc2.deposit(2000);
		acc2.withdraw(1000);
		acc2.checkBalance();
	
	}

}
