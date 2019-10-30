package midTerm2019;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		String name;
		int number;
		int numsq;

		Scanner sc = new Scanner(System.in);

		System.out.print("Your name: ");
		name = sc.next();

		System.out.print("Your favorite number: ");
		number = sc.nextInt();

		numsq = number * number;
		System.out.println(name + ", the square of your favorite number = " + numsq);
	}
}

