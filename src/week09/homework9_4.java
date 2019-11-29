package week09;

public class homework9_4 {

	public static int fact(int n) {

		try {
			// fill here!
			if (n < 0) {
				throw new IllegalArgumentException();
			} else if (n == 0) {
				return 1;
			} else {
				int i = n;
				while (--i > 0) {
					n *= i;
				}
			}

		} catch (IllegalArgumentException e) {
			// fill here!
			System.out.println("Negative numbers cannot be calculated");
		}

		return n;
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
		// 120
		
		System.out.println(fact(0));

		System.out.println(fact(-5));
		// Negative numbers cannot be calculated
		// -5
	}
}
