package week04;

public class Employee {
	private double salary;
	private int evalGrade;
	
	public Employee(double salary, int evalGrade) {
		this.salary = salary;
		this.evalGrade = evalGrade;
	}	
	
	public void set(double salary, int evalGrade) {
		this.salary = salary;
		this.evalGrade = evalGrade;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEvalGrade() {
		return evalGrade;
	}
	public void setEvalGrade(int evalGrade) {
		this.evalGrade = evalGrade;
	}
	
	public Double applyIncreaseRate() {
		if (this.evalGrade == 1) {
			return this.getSalary()*1.06;
		}else if(this.evalGrade == 2) {
			return this.getSalary()*1.04;
		}else {
			return this.getSalary()*1.02;
		}
	}
		
}
