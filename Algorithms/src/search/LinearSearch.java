package search;

public class LinearSearch implements Search {

	@Override
	public int search(int[] nums, int num) {
		
		for(int i = 0, len = nums.length; i < len; i++) {
			if(nums[i] == num) return i;
		}
		return -1;
	}
}
