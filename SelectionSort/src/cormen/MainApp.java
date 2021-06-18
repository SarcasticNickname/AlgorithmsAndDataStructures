package cormen;

public class MainApp {

	public static void main(String[] args) {
		Sort selectionSort = new SelectionSort();
		TestSortingAlgorithm.test(selectionSort);
	}
}
