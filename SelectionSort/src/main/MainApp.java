package main;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		Sort selectionSort = new SelectionSort();
		TestSortingAlgorithm.test(selectionSort);
	}
}
