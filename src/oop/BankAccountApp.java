package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("213456789", 1000);
		
		acc1.setName("Jim");
		acc1.makeDeposit(500);
		acc1.showBalance();
		acc1.makeDeposit(600);
		acc1.showBalance();
		acc1.payBill(1000);
		acc1.showBalance();
		acc1.accrue();
		acc1.showBalance();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "005400657";
	private String name;
	private String ssn;
	private double balance;
	
	public BankAccount(String SSN, double initialDeposit) {
		this.ssn = SSN;
		iD++;
		setAccountNumber();
		this.balance = initialDeposit;
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = Integer.toString(iD) + Integer.toString(random)  + ssn.substring(0, 2);
		System.out.println(accountNumber);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		balance -= amount;
	}
	
	public void makeDeposit(double amount) {
		balance += amount;
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * ( 1 + (rate/100));
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAccount Number: " + accountNumber + "\nRouting Number: " + routingNumber + "\nBalance: " + balance;
	}
}
