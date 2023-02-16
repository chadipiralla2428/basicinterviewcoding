package ArraysConcepts;

import java.util.Arrays;

public class MergingOfTwoArrays {
	public static void main(String[] args) {
		int[] arr= {1,2,5,8,9,10,12,25};
		int[] arr1= {3,4,6,7,11,20};
		int len=arr.length+arr1.length;
		int[] mergeArray=new int[len];
		int index=0;
	/**	for(int i=0;i<=arr.length-1;i++) {
			mergeArray[index]=arr[i];
			index++;
		}
		for(int i=0;i<=arr1.length-1;i++) {
			mergeArray[index]=arr1[i];
			index++;
		}*/
		
		System.arraycopy(arr, 0, mergeArray, 0, arr.length);
		System.arraycopy(arr1, 0, mergeArray, arr.length, arr1.length);
		Arrays.sort(mergeArray);
		for(int i=0;i<=mergeArray.length-1;i++) {
			System.out.print(mergeArray[i]+" ");
		}
		
	}

}
