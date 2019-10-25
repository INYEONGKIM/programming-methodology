package week06;

public class homework6_3 {
	public static int[] merge(int[] a, int[] b) {
		int[] res = new int[a.length+b.length];
		int x=0, y=0;
		for(int k=0; k<res.length; k++) {
			if(x==a.length) {
				res[k]=b[y];
				y++;
			}else if(y==b.length) {
				res[k]=a[x];
				x++;
			}else {
				if(a[x] < b[y]) {
					res[k]=a[x];
					x++;
				}else {
					res[k]=b[y];
					y++;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 8, 16};
		int[] arr2 = {3, 6, 9, 12}; 
		int[] merged = merge(arr1, arr2); 
		
		for(int i=0; i<merged.length; i++) {
			System.out.println(merged[i]);
		}
	}
}
