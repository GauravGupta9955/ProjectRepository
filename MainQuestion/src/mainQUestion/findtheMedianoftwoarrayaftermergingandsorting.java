package mainQUestion;

import java.util.Arrays;

public class findtheMedianoftwoarrayaftermergingandsorting {

	public static void main(String[] args) {
		int[] nums = {2};
		int[] nums2= {1,3};
		double output =findmedian(nums,nums2);
		System.out.println(output);
		
}
	private static double findmedian(int[] nums, int[] nums2) {
		// TODO Auto-generated method stub
		
	    int numsLength= nums.length;
	    int nums2Length=nums2.length;
	    
	    int total=numsLength +nums2Length;
	    int newArray[] = new int[total];
	    System.arraycopy(nums, 0, newArray, 0, numsLength);
	    System.arraycopy(nums2, 0, newArray, numsLength, nums2Length);
	    
	    Arrays.sort(newArray);
	    
	   int length=newArray.length;
	   
	   double median=0.00;
	   
	   if(length%2!=0)
		   median=newArray[length/2];
	   else
		   median= (newArray[length/2]+newArray[(length/2)-1])/2; 
	    
		return median;
	}

}
