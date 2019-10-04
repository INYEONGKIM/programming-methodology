package week04;

import java.util.Scanner;

public class homework4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("grade:");
		double grade = sc.nextDouble();
		System.out.print("TOEIC score:");
		int toeic = sc.nextInt();
		
		if (toeic < 700) {
			System.out.println("D");
		}else {
			if(grade >= 4.0) { 
				System.out.println("A");
			}
			else if(grade >= 3.5) {
				System.out.println("B");
			}
			else if(grade >= 3.0) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
		}
	}
}
