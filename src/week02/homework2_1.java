package week02;

import java.util.Random;

public class homework2_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		String pnumber = "0";
		
		pnumber += rand.nextInt(4)+2;
		pnumber += rand.nextInt(6)+1;
		pnumber += "-";
		
		for (int i=0; i<8; i++) {
			if (i==3) {
				pnumber += "-";
			}	
			else {
				pnumber += rand.nextInt(10);
			}			
		}
		System.out.println(pnumber);
	}

}
