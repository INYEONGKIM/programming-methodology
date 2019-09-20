package week02;

import java.util.Scanner;

public class homework2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r,h;
		r = sc.nextDouble();
		h = sc.nextDouble();
		
		System.out.println(Math.PI*r*r*h/3.0);
		System.out.println(Math.PI*r*(Math.sqrt(r*r+h*h)+r));
	}
}
