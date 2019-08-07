package MaximumDifference17;

public class UserMainCode {
	public static int findMaxDistance (int[] arr) {
		int maxIndex=0;
		int maxDiff=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(Math.abs(arr[i]-arr[i-1]) > maxDiff ) {
				if(arr[i]>arr[i-1]) 
					maxIndex=i;
				else 
					maxIndex=i-1;
				}		
			}
		return maxIndex;
	}
		
}

