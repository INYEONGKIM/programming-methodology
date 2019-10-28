package week06;

public class homework6_4 {
	public static int longest_incseq(int[] a) {
		int max=0,n=0;
		int[] arr = new int[a.length];
		for(int i=0; i<a.length; i++) {
			if (a[0]<=a[i]) {
				arr[n]=a[i];
				n++;
			}
		}
		
		
		int[] d = new int[n];
		d[0]=1;
		for(int i=1; i<n; i++) {
			d[i]=1;
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && d[i]<=d[j]) {
					d[i]=d[j]+1;
				}
				else if(arr[i]==arr[j]) {
					d[i]=d[j];
				}
			}
		}
		max = d[0];
		for(int i=0; i<n; i++) {
			max = Math.max(max, d[i]);
		}
				
		return max;
	}
	
	public static void main(String[] args) {
//		int[] arr = {2, 5, 6, 3, 4, 5};
		int[] arr = {10, 9, 7, 8, 6, 11, 12};
		System.out.println(longest_incseq(arr));
	}
}
