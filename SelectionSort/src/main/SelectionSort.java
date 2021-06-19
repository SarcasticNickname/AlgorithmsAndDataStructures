package main;

public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] num) {
		
		for(int i = 0, size = num.length; i < size - 1; i++) {
			int min = Integer.MAX_VALUE;
			int index = i;
			
			for(int j = i + 1; j < size; j++) {
				
				if(num[j] < min) {
					min = num[j]; 
					index = j;
				}
			}
			
			int param = num[i];
			num[i] = num[index];
			num[index] = param;  
		}
		return num;
	}

}
