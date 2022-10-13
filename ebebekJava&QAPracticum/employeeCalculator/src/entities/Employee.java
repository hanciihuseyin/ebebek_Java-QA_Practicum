package entities;

public class Employee {

	// nitelikler

	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	public int currentYear = 2021;

	public Employee(String Name, double Salary, double WorkHours, int HireYear) {
		setName(Name);
		setSalary(Salary);
		setWorkHours(WorkHours);
		setHireYear(HireYear);

	}


	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public int getCurrentYear() {
		return currentYear;
	}

}
