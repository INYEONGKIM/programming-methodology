package week06;

public class homework6_2 {
	public static String[] getSuffixArray(String s) {
		String[] res = new String[s.length()];
		for(int i=0; i<res.length; i++) {
			res[i] = s.substring(i, s.length());
		}		
		return res;
	}
	
	public static void main(String[] args) {
		String[] suffix_arr = getSuffixArray("program");
		for(int i=0; i<suffix_arr.length; i++) {
			System.out.println(suffix_arr[i]);
		}
	}
}
