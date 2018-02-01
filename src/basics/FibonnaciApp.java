package basics;

public class FibonnaciApp {

	public static void main(String[] args) {	
		System.out.println(fib(5));
	}
	
	static int fib(int x) {
		
		if (x == 0) {
			return 0;
		}
		
		else if (x == 1) {
			return 1;
		}
		
		return (fib(x-1) + fib(x-2));
	}

}
