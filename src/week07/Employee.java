package week07;

//Employee.java
//직원을 나타낸다
public class Employee {
	public String name; // 이름
	public String department; // 소속부서

	public Employee() {
		
	}
	
	public Employee(String Name, String Department) {
		this.name = Name;
		this.department = Department;
	}

	// 이름을 반환한다
	public String getName() {
		// 여기에 코드를 입력하세요
		return this.name;
	}

	// 소속부서를 반환한다
	public String getDepartment() {
		// 여기에 코드를 입력하세요
		return this.department;
	}

	// 이름을 변경한다
	public void setName(String Name) {
		this.name = Name;
	}

	// 소속부서를 변경한다
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}

}
