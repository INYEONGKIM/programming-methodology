package week01;

import java.util.Scanner;

public class homework1_4 {
	public static void main(String[] args) {
		double F, C;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("화씨 온도를 입력하세요: ");
	    F = sc.nextInt();	     
	    C = (5/9.0)*(F-32);
	    
	    System.out.println(C);
	}
}
