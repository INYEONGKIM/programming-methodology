package week01;

public class homework1_3 {
	public static void main(String[] args) {
		// 영작문， 프로그래밍, 이산수학 과목의 점수들을 저장하는 
	    // 변수들을 선언한다
	    int compgrade, proggrade, mathgrade;
	    // 과목 접수들의 평균을 저장하는 변수를 선언한다 
	    double average;  
	    compgrade = 88;
	    proggrade = 92;
	    mathgrade = 79;
	    average = (compgrade+proggrade+mathgrade)/3.0;
	    
	    // 평균점수를 출력한다 
	    System.out.println(average);
	}
}
