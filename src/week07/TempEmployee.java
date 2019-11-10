package week07;

public class TempEmployee extends Employee {
	protected double payRate; // 시간당 임금
	private int hoursWorked; // 근무 시간

	// 계약직직원의 이름, 소속부서, 시간담 임금을 주어진 값으로 초기화하고
	// 근무 시간은 0으로 초기화 하면서 TempEmployee 객체를 생성한다
	public TempEmployee(String name, String department, double payRate) {
		this.setName(name);
		this.setDepartment(department);
		this.payRate = payRate;
		this.hoursWorked = 0;
	}

	// 계약직 직원의 월급을 계산한다
	public double pay() {
		int tmp = this.getHoursworked();
		this.hoursWorked = 0;
		return tmp * this.payRate;
	}

	// 계약직 직원의 추가 근무시간을 누적된 근무시간에 더한다
	public void addHours(int moreHours) {
		this.hoursWorked += moreHours;
	}

	// 근무 시간을 반환한다
	public int getHoursworked() {
		// 여기에 코드를 입력하세요
		return this.hoursWorked;
	}

	// 계약직 직원의 모든 데이터를 반환한다
	public String toString() {
		return "직원의 이름 : " + this.getName() + ", 소속 부서: " + this.getDepartment() + ", 시간당 임금: " + this.payRate
				+ ", 근무 시간: " + this.getHoursworked();
	}

}
