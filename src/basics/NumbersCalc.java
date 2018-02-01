package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		printName();
		
		int x = 10;
		int y = 20;
		System.out.println("Sum is: " + addNumbers(x, y));
		System.out.println("Product is: " + multiplyNumbers(x, y));
	}
	
	static void printName() {
		System.out.println("My name is Febin");
	}
	
	static int addNumbers(int x, int y) {
		return x + y;
	}
	
	static int multiplyNumbers(int x, int y) {
		return x * y;
	}

}
