// Model

package myBank;

import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name;
	private int balance;
	
	public BankAccount(String name, int init_amount) {
		this.account_name = name;
		this.balance = init_amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public boolean deposit(int amount) {
		if (amount < 0) {			
			JOptionPane.showMessageDialog(null, "Wrong deposit amount");
			return false;
		}
		else {
			this.balance += amount;
			return true;
		}
	}
	
	public boolean withdraw(int amount) {
		if (amount > this.balance || amount < 0) {
			JOptionPane.showMessageDialog(null, "Wrong withdraw amount");
			return false;
		}
		else {
			this.balance -= amount;
			return true;
		}
	}


}
