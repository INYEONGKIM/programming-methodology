package week05;

import java.util.Scanner;

public class homework5_4 {
	public static void main(String[] args) {
		System.out.print("Please enter a sentence:");
		int a = 0, e = 0, i = 0, o = 0, u = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim().toLowerCase();

		for (int j = 0; j < s.length(); j++) {
			char t = s.charAt(j);
			if (t == 'a') {
				a++;
			} else if (t == 'e') {
				e++;
			} else if (t == 'i') {
				i++;
			} else if (t == 'o') {
				o++;
			} else if (t == 'u') {
				u++;
			} else if ('a' < t && t <= 'z') {
				c++;
			}
		}
		System.out.println("a:" + a);
		System.out.println("e:" + e);
		System.out.println("i:" + i);
		System.out.println("o:" + o);
		System.out.println("u:" + u);
		System.out.println("consonant:" + c);
	}
}
