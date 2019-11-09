package week07;

//학점 인정 교과목을 나타낸다.
public class PassFailCourse extends Course {
	int reportScore; // 보고서 점수
	int ptScore; // 발표 점수

	// 학점 인정 교과목의 변수들 값을 주어진 값들로 초기화한다.
	public PassFailCourse(String cname) {
		this.setCourseName(cname);
	}

	// 교과목의 보고서 점수를 반환한다
	public int getReportScore() {
		// 여기에 코드를 입력하세요
		return this.reportScore;
	}

	// 교과목의 발표점수를 반환한다
	public int getPtScore() {
		// 여기에 코드를 입력하세요
		return this.ptScore;
	}

	// 교과목의 총점을 계산하여 반환한다
	public double getTotal() {
		return 0.2 * this.getattendScore() + 0.6 * this.getReportScore() + 0.2 * this.ptScore;
	}

	// 교과목의 학점을 반환한다
	public String getGrade() {
		if (this.getTotal() >= 60.0) {
			return "CR";
		} else {
			return "NC";
		}
	}

	// 교과목의 교과목의 이름, 출석 점수, 보고서 점수와 발표 점수를 반환한다
	public String toString() {
		// 여기에 코드를 입력하세요
		return "교과목 이름: " + this.getCourseName() + ", 출석점수: " + this.getattendScore() + ", 보고서 점수: "
				+ this.getReportScore() + ", 발표 점수:" + this.getPtScore();
	}

	// 교과목의 보고서 점수를 변경한다
	public void setReportScore(int newReportScore) {
		this.reportScore = newReportScore;
	}

	// 교과목의 발표 점수를 변경한다
	public void setPtScore(int newPtScore) {
		this.ptScore = newPtScore;
	}
}
