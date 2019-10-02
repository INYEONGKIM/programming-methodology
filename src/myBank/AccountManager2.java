// Main

package myBank;

public class AccountManager2 {
	public static void main(String[] args) {
		BankReader r = new BankReader();
		BankAccount p = new BankAccount("myAccount", 0);
		BankAccount s = new BankAccount("myAccount2", 0);
		
		
		BankWriter pw = new BankWriter(p);
		BankWriter sw = new BankWriter(s);
		
		AccountController2 controller = new AccountController2(r, p, pw, s, sw);
		controller.processTransactions(); //start
	}
}
