package week04;

import java.util.Scanner;

public class homework4_3 {
	public static void main(String[] args) {
		double tot=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("attendance score:");
		tot += 0.1*sc.nextDouble();
		
		System.out.print("assignment score:");
		tot += 0.4*sc.nextDouble();
		
		System.out.print("quiz score:");
		tot += 0.1*sc.nextDouble();
		
		System.out.print("midterm exam score:");
		tot += 0.2*sc.nextDouble();
		
		System.out.print("final exam score:");
		tot += 0.2*sc.nextDouble();
		
		System.out.println("total score:"+tot);
		char g;
		
		if (tot>=90) {
			g='A';
		}
		else if(tot>=80) {
			g='B';
		}
		else if(tot>=70) {
			g='C';
		}
		else if(tot>=60) {
			g='D';
		}
		else {
			g='F';
		}
		System.out.println("grade:"+g);
	}
}
