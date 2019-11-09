package week07;

public class Pet {
	private String name; // 이름
	private int age; // 나이

	// 애완동물의 이름과 나이를 각각 기본 값으로 초기화하면서
	// Pet 객체를 생성한다
	// 나이 기본값: 빈 문자열, 나이 기본값: 0
	public Pet() {
		// 여기에 코드를 입력하세요
		this.name = "";
		this.age = 0;
	}

	// 애완동물의 이름과 나이를 각각 주어진 값으로 초기화하면서
	// Pet 객체를 생성한다
	public Pet(String name, int age) {
		// 여기에 코드를 입력하세요
		this.name = name;
		this.age = age;
	}

	// 애완동물의 이름을 변경한다
	public void setName(String newName) {
		// 여기에 코드를 입력하세요
		this.name = newName;
	}

	// 애완동물의 나이를 변경한다
	public void setAge(int age) {
		// 여기에 코드를 입력하세요
		this.age = age;
	}

	// 애완동물의 이름을 알려 준다
	public String getName() {
		// 여기에 코드를 입력하세요
		return this.name;
	}

	// 애완동물의 나이를 알려 준다
	public int getAge() {
		// 여기에 코드를 입력하세요
		return this.age;
	}

	// 애완동물의 이름과 나이를 알려 준다
	public String toString() {
		// 여기에 코드를 입력하세요
		return ("이름: " + this.getName() + ", 나이: " + this.getAge());
	}
}
