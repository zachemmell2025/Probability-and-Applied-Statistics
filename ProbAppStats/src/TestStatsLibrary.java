import java.util.ArrayList;

public class TestStatsLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatsLibrary test = new StatsLibrary();
		ArrayList<Integer> someInput = new ArrayList<>();
		someInput.add(5);
		someInput.add(6);
		someInput.add(7);
		someInput.add(3);
		someInput.add(9);
		someInput.add(2);
		someInput.add(4);
		someInput.add(4);
		someInput.add(4);
		someInput.add(4);
		someInput.add(4);
		double result = test.mean(someInput);
		System.out.println("Average: " + result);
		
		int medianResult = test.median(someInput);
		System.out.println("Median: " + medianResult);
		
		int modeResult = test.mode(someInput);
		System.out.println("Mode: " + modeResult);
		
		double stanDevResult = test.standardDeviation(someInput);
		System.out.println("Standard Deviation: " + stanDevResult);
		
		int n = 9;
		int r = 3;
		System.out.println(test.permutations(n, r));
		System.out.println(test.combinations(n, r));
	}

}
