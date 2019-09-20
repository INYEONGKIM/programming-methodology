package week02;

import java.util.Scanner;

public class homework2_2 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		for (int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(s.length()-1-i));
		}
	}
}
