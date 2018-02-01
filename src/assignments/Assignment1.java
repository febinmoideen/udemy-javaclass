package assignments;

public class Assignment1 {
	public static void main (String[] args) {
		System.out.println(sumUntil(-1));
		System.out.println(factorial(4));
		
		int[] arr = {-1, -7, 100}; 
		System.out.println(min(arr));
		System.out.println(avg(arr));
		System.out.println(max(arr));
	}
	
	public static int sumUntil(int n) {
		if (n < 1) {
			return 0;
		}	
		return (n * (n + 1))/2;
	}
	
	public static int factorial(int n) {
		if (n < 0) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int min(int[] nums) {
		
		if (nums.length == 0) {
			return 0;
		}
		
		int result = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < result) {
				result = nums[i];
			}
		}
		
		return result;
	}
	
	public static int avg(int[] nums) {
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		return sum/nums.length;	
	}

	public static int max(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int result = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > result) {
				result = nums[i];
			}
		}
		
		return result;
	}
}
