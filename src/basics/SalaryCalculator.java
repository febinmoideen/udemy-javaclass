package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		String career;
		career = "Software Develper";
		System.out.println("My career: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear= 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
	}
}
