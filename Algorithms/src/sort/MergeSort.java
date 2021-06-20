package sort;

/**
 * @author SarcasticNickname
 */
public class MergeSort implements Sort {
	
	private void merge(int [] num,int left,int mid, int right) {
		int length  = right - left + 1;
		int [] param = new int[num.length];
		
		int lindx = left;
		int rindx = mid + 1;
		int pindx = 0;
		
		while(lindx <= mid && rindx <= right) {
			if(num[lindx] < num[rindx])
				param[pindx++] = num[lindx++];
			else
				param[pindx++] = num[rindx++];
		}
		
		while(lindx <= mid) {
			param[pindx++] = num[lindx++];
		}
		
		while(rindx <= right) {
			param[pindx++] = num[rindx++]; 
		}
		System.arraycopy(param, 0, num, left, length);
	}

	public void doSort(int[] num,int left, int right) {
		if(left >= right) 
			return;
		//Оператор сдвига на бит вправо без учёта знака,
		//Но у нас же индексы, не может быть отрицательного
		//По сути деление на 2(ещё и -1 для нечётных)
		int mid = (left+right) >>> 1;
		
		doSort(num, left, mid);
		doSort(num, mid+1, right);
		merge(num, left, mid, right);
	}
	
	@Override
	public int[] sort(int[] num) {
		doSort(num, 0, num.length - 1);
		return num;
	}
}
