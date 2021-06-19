package main;

public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] num) {
		for(int i = 0, size = num.length; i < size; i++) {
			boolean flag = false;
			for(int j = 0; j < size - i - 1;j++) {
				if(num[j] > num[j+1]) {
					flag = true;
					int param = num[j];
					num[j] = num[j+1];
					num[j+1] = param;
				}
			}
			if (!flag) break;
		}
		return num;
	}
}
