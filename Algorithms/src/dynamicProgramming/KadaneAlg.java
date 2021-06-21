package dynamicProgramming;

/*
 * Class implements Kadane's algorithm of finding
 * maximum subarray.
 * @author SarcasticNickname
 */
public class KadaneAlg {
	public static int findMaxSubarray(int [] num) {
		int maxSum = num[0];
		int currSum = num[0];
		int start = 0,end = 0;
		
		for(int i = 0, len = num.length; i < len; i++) {
			if(num[i] > currSum + num[i]) {
				currSum = num[i];
				start = i;
			}
			else 
				currSum += num[i];
			if(maxSum < currSum) {
				maxSum = currSum;
				end = i;
			}
			
		}
		System.out.printf("Indixes of maximal subarray: x: %d ,  y: %d  \n", start,end);
		return maxSum;
	}
}
