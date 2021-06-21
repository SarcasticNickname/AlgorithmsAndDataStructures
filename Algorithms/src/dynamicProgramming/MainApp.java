package dynamicProgramming;

public class MainApp {

	public static void main(String[] args) {
		int maxSum = KadaneAlg.findMaxSubarray(new int [] {13,-3,-25,20,-3,-6,-23,18,20,-7,12,-5,-22,15,-4,7});
		System.out.println(maxSum);
	}

}
