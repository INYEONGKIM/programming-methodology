package week07;

public class Graduate extends Student {
	private String tatype; // 조교 유형
	private double scholarshipRate; // 장학금 비율

	// 대학원생의 이름, 학번 조교 유형, 장학금 비율
	// 각각 주어진 값으로 초기화 하면서 객체를 생성
	public Graduate(String Name, int Number, String Tatype, double ScholarshipRate) {
		this.setName(Name);
		this.setNumber(Number);
		this.setTatype(Tatype);
		this.setScholarshipRate(ScholarshipRate);
	}

	// 조교 유형 변경
	public void setTatype(String newTatype) {
		this.tatype = newTatype;
	}

	// 장학금 비율 변경
	public void setScholarshipRate(double newScholarshipRate) {
		this.scholarshipRate = newScholarshipRate;				
	}

	// 조교 유형을 반환한다
	public String getTatype() {
		return this.tatype;
	}

	// 장학금 비율을 반환한다
	public double getScholarshipRate() {
		return this.scholarshipRate;
	}

	// 대학원생의 모든 데이터를 반환한다.
	public String toString() {
		return ("이름: " + this.getName() + ", " + "학번: " + this.getNumber() + ", 조교 유형: "+this.getTatype()+", 장학금 비율: "+this.getScholarshipRate());
	}
}
