package cormen;

import java.util.Date;
import java.util.Random;

public class TestSortingAlgorithm {
	private static final Random rnd = new Random();
	
	private static int [] createRandomNumArray(int n) {
		int [] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = rnd.nextInt();
		}
		return num;
	}


	public static void test(Sort sort) {
		long [] times = new long [200];
		for(int i = 0; i < 200; i++) {
			int [] numbers = createRandomNumArray(10000);
			Date date = new Date();
			long time = date.getTime();
			sort.sort(numbers);
			time = (new Date()).getTime() - time;
			times[i] = time;
		}
		
		double sum = 0;
		for(int i = 0; i < times.length; i++) {
			sum += times[i];
		}
		
		System.out.println("Algorythms overall spedd sorting 200 arrays of 10000 elements: " + sum + "msc");
		double averageTime = sum/200.0;
		System.out.println("Algorithms average speed sorting 1 array out of 200 arrays(10000 elems):" + averageTime + "msc");
	}
}
