package week07;

public class Student {
	private String name; // 이름
	private int number; // 학번
	// 이름을 기본 값으로 초기화하면서 Student 객체를 생성한다

	public Student() {
		this.name = "";
		this.number = 0;
	}

	// 이름을 매개번수 값으로 초기화하면서 Student 객체를 생성한다
	public Student(String Name, int Number) {
		this.name = Name;
		this.number = Number;
	}

	// 이름을 반환한다
	public String getName() {
		// 여기에 코드를 입력하세요
		return this.name;
	}

	// 학번을 반환한다
	public int getNumber() {
		// 여기에 코드를 입력하세요
		return this.number;
	}


	// 학생의 모든 데이터를 반환한다.
	public String toString() {
		return ("이름: " + this.name + ", " + "학번: " + this.number);
	}

	// 현 객체의 현재 상태가 other 객체와 같은지 알려준다.
	public boolean equals(Student other) {
		return this.getNumber()==other.getNumber() && this.getName().equals(other.getName());
	}

	// 이름을 주어진 값으로 변경한다
	public void setName(String Name) {
		this.name = Name;
	}

	// 학번을 주어진 값으로 변경한다
	public void setNumber(int Number) {
		this.number = Number;
	}
}