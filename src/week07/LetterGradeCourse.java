package week07;

public class LetterGradeCourse extends Course {
	int assignScore; // 과제 점수
	int examScore; // 시험 점수

	// 문자 학점 교과목의 변수들 값을 주어진 값들로 초기화한다
	public LetterGradeCourse(String cname) {
		this.setCourseName(cname);
		this.assignScore = 0;
		this.examScore = 0;
	}

	// 교과목의 과제 점수를 반환한다
	public int getAssignScore() {
		// 여기에 코드를 입력하세요
		return this.assignScore;
	}

	// 교과목의 시험 점수를 반환한다
	public int getExamScore() {
		// 여기에 코드를 입력하세요
		return this.examScore;
	}

	// 교과목의 총점을 계산하여 반환한다
	public double getTotal() {
		// 여기에 코드를 입력하세요
		return 0.2 * this.getattendScore() + 0.3 * getAssignScore() + 0.5 * getExamScore();
	}

	// 교과목의 학점을 반환한다
	public String getGrade() {
		// 여기에 코드를 입 력 하세요
		double tot = this.getTotal();
		if (tot >= 90.0) {
			return "A";
		} else if (tot >= 80.0) {
			return "B";
		} else if (tot >= 70.0) {
			return "C";
		} else if (tot >= 60.0) {
			return "D";
		} else {
			return "F";
		}
	}

	// 교과목의 이름, 출석 점수, 과제 점수와 시험 점수를 반환한다.
	public String toString() {
		// 여기에 코드를 입력하세요
		return "교과목 이름: " + this.getCourseName() + ", 출석점수: " + this.getattendScore() + ", 과제 점수: "
				+ this.getAssignScore() + ", 시험 점수:" + this.getExamScore();
	}

	// 교과목의 과제 점수를 변경한다
	public void setAssignScore(int newAssignScore) {
		this.assignScore = newAssignScore;
	}

	// 교과목의 시힘 점수를 변경한다
	public void setExamScore(int newexamScore) {
		this.examScore = newexamScore;
	}

}