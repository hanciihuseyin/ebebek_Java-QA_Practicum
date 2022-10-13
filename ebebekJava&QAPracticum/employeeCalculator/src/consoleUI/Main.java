package consoleUI;

import business.EmployeeManager;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Hüseyin", 2000, 55, 2019);
		
		EmployeeManager employeeManager = new EmployeeManager(employee);
		employeeManager.toString(employee);
		

	}

}
