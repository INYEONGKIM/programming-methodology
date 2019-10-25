package week06;

public class homework6_4 {
	public static int longest_incseq(int[] a) {
		int[] d = new int[a.length];
		d[0]=1;
		
		for(int i=1; i<a.length; i++) {
			d[i]=1;
			for(int j=0; j<i; j++) {
				if(a[i]>a[j] && d[i]<=d[j]) {
					d[i]=d[j]+1;
				}
				else if(a[i]==a[j]) {
					d[i]=d[j];
				}
			}
		}
		
		int m=d[0];
		for(int i=1; i<d.length; i++) {
			m = Math.max(m, d[i]);
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 20, 50};
		System.out.println(longest_incseq(arr));
	}
}
