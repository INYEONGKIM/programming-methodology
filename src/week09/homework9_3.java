package week09;

public class homework9_3 {
	public static int string_sum(String str) {
		String[] s = str.split(" ");
		int cnt = 0;

		try {
			for (int i = 0; i < s.length; i++) {
				cnt += Integer.parseInt(s[i]);
			}
		} catch (Exception e) {
			cnt = 0;
		}

		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(string_sum("100 q 300")); // 0
		System.out.println(string_sum("100 300")); // 400
	}
}
