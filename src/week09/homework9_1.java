package week09;

public class homework9_1 {
	public static String len_check(String str) {
		if (str == null) {
			throw new RuntimeException("null");
		} else if (str.length() > 20) {
			throw new RuntimeException("More than 20 words");
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
//		System.out.println(len_check("abcdefghijklmnopqrs"));// abcdefghijklmnopqrs
		System.out.println(len_check("abcdefghijklmnopqrsuvw"));
//		System.out.println(len_check(null));
	}
}
