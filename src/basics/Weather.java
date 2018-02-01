package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Pleasant: shorts and t-shirt");
		}
		
		else if (temperature > 60 && sunCondition == "Sunny")  {
			System.out.println("Cooler: long sleeve shirt and jeans");
			System.out.println("Wear hat");
		}
		
		else if ((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("Cool day: warmer clothes");
		}
		
		else {
			System.out.println("Cold: Sweater");
		}
	}
}
