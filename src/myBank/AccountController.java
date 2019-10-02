// Controller

package myBank;

public class AccountController {
	private BankReader reader;
	private BankWriter writer;
	private BankAccount account;
	
	public AccountController(BankReader r, BankWriter w, BankAccount a) {
		this.reader = r;
		this.writer = w;
		this.account = a;
	}
	
	public void processTransactions() {
		
		char command = this.reader.readCommand("Command D/W/Q");
		int amount;
		boolean flag;
		
		
		switch (command) {
		case 'Q':
			return ;
			
		case 'D':
			amount = this.reader.readAmount();
			flag = this.account.deposit(amount);
			
			if (flag) {
				this.writer.showTransaction("Finish Deposit", amount);
			}
			else {
				this.writer.showTransaction("Error in Deposit");
			}
				
			break;
		
		case 'W':
			amount =this.reader.readAmount();
			flag = this.account.withdraw(amount);
			
			if (flag) {
				this.writer.showTransaction("Finish Withdraw", amount);
			}
			else {
				this.writer.showTransaction("Error in Withdraw");
			}
			
			break;
			

		default:
			this.writer.showTransaction("Error in command");
		}
		
		// recur
		this.processTransactions();		
	}
}
