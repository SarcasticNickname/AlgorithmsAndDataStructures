package main;

import java.util.Arrays;

public class MainApp {
	public static void main(String [] args) {
		Sort bubbleSort = new BubbleSort();
		int [] num = new int [] {4,123,567,9,10,90};
		num = bubbleSort.sort(num);
		TestSortingAlgorithm.test(bubbleSort);
		System.out.println(Arrays.toString(num));
	}
}
