package week02;

import java.util.Scanner;

public class homework2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		System.out.print("총 시간(seconds): \n"+tot/(60*60*24)+"일 ");
		tot%=60*60*24;
		System.out.print(tot/(3600)+"시간 ");
		tot%=3600;
		System.out.print(tot/60+"분 "+tot%60+"");
	}
}
