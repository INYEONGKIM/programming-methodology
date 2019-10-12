package week05;

import java.util.Scanner;

public class homework5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade,cnt=0,f=0;
		boolean flag = true;
		while(true) {
			if (flag) {
				System.out.print("Enter the first score(negative to exit):");
				flag=false;
			}else {
				System.out.print("Enter the next score(negative to exit):");
			}
			grade = sc.nextInt();
			if(grade<0) break;
			cnt++;
			if(grade<60)
				f++;
		}
		System.out.println("numStudents:"+cnt);
		System.out.println("numPass:"+(cnt-f));
		System.out.println("numFail:"+f);
	}
}
