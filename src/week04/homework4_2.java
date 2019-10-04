package week04;

import java.util.Scanner;

public class homework4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("total credit:");
		int credit = sc.nextInt();
		System.out.print("TOEIC score:");
		int score = sc.nextInt();
		
		if (credit < 140) {
			System.out.println("failure");
		}else {
			if(score < 700) {
				System.out.println("completion");
			}else {
				System.out.println("graduation");
			}
		}	
	}
}
