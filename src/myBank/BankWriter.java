// View (output view)

package myBank;

import java.text.DecimalFormat;

public class BankWriter {
	private BankAccount bank;
	private String last_transaction;
	
	public BankWriter(BankAccount b) {
		this.bank = b;
	}
	
	public void showTransaction(String message, int amount) {
		this.last_transaction = message + " $" + cent2dollar(amount);
		System.out.println(bank.account_name + " "+ this.last_transaction);
		System.out.println("Now remain " + cent2dollar(bank.getBalance()));
	}
	
	//overloading for error
	public void showTransaction(String message) {
		System.out.println(message);
	}
	
	private String cent2dollar(int amount) {
		String res = new DecimalFormat("0.00").format(amount/100.0);
		return res;
	}
	
}
