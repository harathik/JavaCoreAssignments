

import java.util.Arrays;

public class Bubblesort {
	static void bubble(int arr[]) {
		int a=arr.length;
		int temp=0;
		
		
		for(int i = 0; i < a; i++) {
			for (int j = 1; j < 

a-i; j++) {
				if(arr

[j-1]>arr[j]) {
					

temp=arr[j-1];
					

arr[j-1]=arr[j];
					

arr[j]=temp;
				}
			}
		}
		System.out.println

(Arrays.toString(arr));
		

	}
	public static void main(String[] args) {
		int arr[]= 

{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		bubble(arr);
	}

}
