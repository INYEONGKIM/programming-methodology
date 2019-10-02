// Controller

package myBank;

public class AccountController2 {
	private BankReader reader; //input view
	private BankWriter writer, primary_writer, secondary_writer; //output view
	private BankAccount account, primary_account, secondary_account;
	
	public AccountController2(BankReader r, BankAccount p, BankWriter pw, BankAccount s, BankWriter sw) {
		this.reader = r;
		this.primary_account = p;
		this.primary_writer = pw;
		this.secondary_account = s;
		this.secondary_writer = sw;
		
		
			
		this.account = p;
		this.writer = pw;
	}
	
	public void processTransactions() {
		
		char command = this.reader.readCommand("Command P/S/D/W/Q");
		int amount;
		boolean flag;
		
		switch (command) {
		case 'Q':
			return ;
			
		// change account p/s
		case 'P':
			this.primary_writer.showTransaction("Deactivate myAccount");
			this.account = this.primary_account;
			this.writer = this.primary_writer;
			this.primary_writer.showTransaction("Activate myAccount2");
			
			break;
			
		case 'S':
			this.primary_writer.showTransaction("Deactivate myAccount2");
			this.account = this.secondary_account;
			this.writer = this.secondary_writer;
			this.primary_writer.showTransaction("Activate myAccount");
			
			break ;
			
			
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
