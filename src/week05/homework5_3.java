package week05;

import java.util.Scanner;

public class homework5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim().toLowerCase();
		int c=0;
		for(int i=0; i<s.length(); i++) {
			if('a'<=s.charAt(i) && s.charAt(i)<='z')
				c++;
		}
		System.out.println("Please enter a sentence:"+c);
	}
}
