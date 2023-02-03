import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Zach Emmell
 *
 */
public class StatsLibrary {

	public double mean(ArrayList<Integer> array) {
		double total = 0;
		for (int singleElement: array) {
			 total = total + singleElement;
		}
		double mean = total / array.size();
		return mean;
	}
	
	public int median(ArrayList<Integer> array) {
		int medianPlace = (array.size() - 1) / 2;
		int median = array.get(medianPlace);
		return median;
	}
	
	public int mode(ArrayList<Integer> array) {
		int maxValue = 0, maxCount = 0;
		for(int i = 0; i < array.size(); i++) {
			int count = 0;
			for (int j = 0; j < array.size(); j++) {
				if (array.get(j) == array.get(i))
					count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = array.get(i);
			}
		}
		return maxValue;
		
	}
	
	public double standardDeviation(ArrayList<Integer> array) {
		double total = 0;
		for (int singleElement: array) {
			 total = total + singleElement;
		}
		double mean = total / array.size();
		
		double td = 0; 
		for(int i = 0; i < array.size(); i++) {
			double fd = array.get(i) - mean;
			for(int j = 0; j < array.size(); j++) {
				double sd = Math.pow(fd, 2);
				for(int k = 0; k < array.size(); k++) {
					td += sd;
				}
				
			}
		}
		double fourd = td / (array.size() - 1);
		double stanDev = Math.sqrt(fourd);
		return stanDev;
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public double permutations(int n, int r) {
		double p = factorial(n) / factorial(n - r);
		return p;
	}
	
	public double combinations(int n, int r) {
		double c = factorial(n) / factorial(r) * factorial(n - r);
		return c;
	}
}
