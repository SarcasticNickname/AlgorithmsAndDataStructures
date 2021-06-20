package sort;

public class GnomeSort implements Sort {
	@Override
	public int[] sort(int[] num) {
		int indx = 0;
		int len = num.length;
		while(indx <= len - 1) {
			if(indx == 0 || num[indx] >= num[indx - 1])
				indx++;
			else {
				int param = num[indx];
				num[indx] = num[indx - 1];
				num[indx - 1] = param;
				indx--;
			}
		}
		return num;
	}
}
