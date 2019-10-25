package week06;

import java.util.Arrays;
import java.util.Collections;

public class homework6_1 {	
	public static int kthbig(int[] arr, int k) {
		int[] rank = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int cnt=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] < arr[j]) cnt++;
			}
			rank[cnt]=arr[i];
		}
		return rank[k-1];
	}

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 11, 9, 18};
		System.out.println(kthbig(arr, 2));
		//	    Arrays.sort(arr);
//		Integer[] arr2 = {1, 4, 2, 5, 11, 9, 18};
//		Arrays.sort(arr2, Collections.reverseOrder());
//		System.out.println(arr2[0]);
	}
}
