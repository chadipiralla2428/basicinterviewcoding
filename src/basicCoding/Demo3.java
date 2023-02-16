package basicCoding;

import java.util.Arrays;

public class Demo3 {
	public static  boolean isEqual(int[] arr,int[] arr1) {
		if(arr.length!=arr1.length) {
			return false;
			
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=arr1[i]) {
			return false;
			
			}
			
		}

		return true;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,3,2,6,7,4};
		int[] arr1= {3,1,6,7,4,2};
	if(isEqual(arr, arr1)==true) {
		System.out.println("Both arrays are equal");
	}
	else {
		System.out.println("Both arrays are not equal");
	}
		
	}

}
