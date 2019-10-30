package midTerm2019;

public class Q3 {
	public static int getCRT(int p1, int p2, int r1, int r2) {
		int res = -1;
		for (int i = 1; i < p1 * p2; i++) {
			if (i % p1 == r1 && i % p2 == r2) {
				res = i;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(getCRT(5, 7, 3, 4)); // 18
	}
}
