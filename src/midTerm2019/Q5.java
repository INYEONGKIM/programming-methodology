package midTerm2019;

class Currency {
	private double dollars;
	private double won;
	private double yen;

	public Currency(double initial_amount) {
		dollars = 0.001 * initial_amount;
		won = initial_amount;
		yen = 0.1 * initial_amount;
	}

	public Currency add(Currency other) {
		double new_w = this.getWon();
		new_w += other.getWon();

		Currency c = new Currency(new_w);
		return c;
	}

	public double getDollars() {
		return dollars;
	}

	public double getWon() {
		return won;
	}

	public double getYen() {
		return yen;
	}
}

class BankAccount {
	private Currency balance;

	public BankAccount(Currency initial_amount) {
		this.balance = initial_amount;
	}

	public Currency getBalance() {
		return this.balance;
	}

	public boolean deposit(Currency money) {
		if (money.getDollars() < 0.0) {
			return false;
		} else {
			this.balance = this.getBalance().add(money);;
			return true;
		}
	}
}

public class Q5 {
	public static void main(String[] args) {
		Currency money = new Currency(100);
		BankAccount account = new BankAccount(money);
		
		account.deposit(money);	
		System.out.println("balance = " + account.getBalance().getDollars());
	}
}
