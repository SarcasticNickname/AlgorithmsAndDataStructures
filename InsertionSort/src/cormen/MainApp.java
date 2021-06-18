package cormen;

public class MainApp {
	
	public static void main(String[] args) {
		Sort insertionSort = new InsertionSort();
		TestSortingAlgorithm.test(insertionSort);
	}
}
