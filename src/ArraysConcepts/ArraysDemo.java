package ArraysConcepts;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr= {1,4,3,6,8,2,9,10};
		Arrays.sort(arr);
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
