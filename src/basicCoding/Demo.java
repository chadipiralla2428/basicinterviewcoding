package basicCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo {
	public static void binarySearchDemo(int[] arr,int first,int last, int num) {
		
		while(first<=last) {
			int mid= (first+last)/2;
			
			if(arr[mid]==num) {
				System.out.println("number is found at position:"+mid);
				break;
			}
			else if(arr[mid]<num) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}
			
		}
		if(first>last) {
			
		  System.out.println("number is not found");
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,8,9,10};
		int last = arr.length-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int num=sc.nextInt();
		binarySearchDemo(arr, 0, last, num);
		
	
	}

}
