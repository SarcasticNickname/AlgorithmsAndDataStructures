package sort;

public class QuickSort implements Sort {
	
	private void swap(int[] num, int indx1, int indx2) {
		int param = num[indx1];
		num[indx1] = num[indx2];
		num[indx2] = param;
	}
	
	private int partition(int[] num, int start, int end) {
		int pivotIndx = end;
		int pivot = num[pivotIndx];
		int pIndx = start;
		for(int i = start; i < end; i++) {
			if(num[i] <= pivot) {
				swap(num,i,pIndx);
				pIndx++;
			}
		}
		swap(num,pIndx,pivotIndx);
		return pIndx;
	}
	
	private void quickSort(int[] num, int start, int end) {
		if(start >= end)
			return;
		int pIndx = partition(num, start,end);
		quickSort(num, start, pIndx - 1);
		quickSort(num, pIndx + 1, end);
	}

	@Override
	public int[] sort(int[] num) {
		quickSort(num, 0, num.length - 1);
		return num;
	}
}
