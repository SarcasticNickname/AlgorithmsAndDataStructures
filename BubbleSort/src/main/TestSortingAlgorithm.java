package main;

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
	
	private static void checkValidity(int [] sortedArr) {
		for(int i = 0; i < sortedArr.length - 1; i++) {
			assert(sortedArr[i] <= sortedArr[i+1]);
		}
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
			checkValidity(numbers);
		}
		
		long sum = 0;
		for(int i = 0; i < times.length; i++) {
			sum += times[i];
		}
		
		System.out.println("Overall time spent sorting 200 arrays(10000 elements each): " + sum + "msc");
		double averageTime = sum/200.0;
		System.out.println("Average time spent sorting 1 array out of 200 (10000 elems each):" + averageTime + "msc");
	}
}
