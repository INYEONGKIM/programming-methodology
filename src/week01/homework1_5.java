package week01;

import java.util.Scanner;

public class homework1_5 {
	public static void main(String[] args) {
		double py, sqmt;
		Scanner sc = new Scanner(System.in);
		System.out.print("면적 (평): ");
		py = sc.nextInt();
		sqmt = py*3.305785;		
		System.out.println(sqmt);
	}
}
