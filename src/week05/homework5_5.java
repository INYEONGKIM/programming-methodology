package week05;

import java.util.Scanner;

public class homework5_5 {
	public static void main(String[] args) {
		System.out.print("Please enter an integer:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2; i<=n; i++) {
			for(int j=1; j<i; j++) {
				if (i%j==0) {
					System.out.println(String.format("(%d,%d)", i,j));
				}
			}
		}
	}
}
