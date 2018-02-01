package basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0;
		do {
			System.out.println(states[i]);
			i++;
		} while (i < 5);
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println("State at " + n + ": " + state);
			if (state == "Ohio") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++;
		}
		
		for (int x = 0; x < 5; x++) {
			System.out.println("State at " + x + ": " + states[x]);
		}
	}

}
