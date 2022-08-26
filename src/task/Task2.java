package task;

abstract class Bank {
	abstract void getBalance();
}
class BankA extends Bank {
	void getBalance() {
		System.out.println("Deposited 100");
	}
}
class BankB extends  Bank {
	void getBalance() {
		System.out.println("Deposited 150");
	}
}
class BankC extends Bank {
	void getBalance() {
		System.out.println("Deposited 200");
	}
}

public class Task2 {

	public static void main(String[] args) {
		Bank a = new BankA();
		a.getBalance();
		Bank b = new BankB();
		b.getBalance();
		Bank c = new BankC();
		c.getBalance();
	}
}
