package cormen;

public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] num) {
		
		for(int i = 0; i < num.length; i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			
			for(int j = 0; j < num.length; j++) {
				
				if(num[j] < min) {
					min = num[j]; 
				
				/*if(num[j] < num[index]) {
					index = j;*/
				}
			}
			int param = num[i];
			num[i] = min;
			num[index] = param;
			
		/*	int param = num[i];
			num[i] = num[index];
			num[index] = param;  */
		}
		return num;
	}

}
