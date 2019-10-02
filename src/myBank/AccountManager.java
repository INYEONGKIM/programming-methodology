// Main

package myBank;

public class AccountManager {
	public static void main(String[] args) {
		BankReader r = new BankReader();
		BankAccount a = new BankAccount("myAccount", 0);
		BankWriter w = new BankWriter(a);
		
		
		AccountController controller = new AccountController(r, w, a);
		controller.processTransactions(); //start
	}
}
