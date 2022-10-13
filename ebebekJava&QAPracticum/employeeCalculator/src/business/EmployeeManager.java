package business;

import entities.Employee;

public class EmployeeManager {

	public EmployeeManager() {
		super();
	}

	private Employee employee;

	public EmployeeManager(Employee employee) {
		super();
		this.employee = employee;

	}

	public double tax() {
		if (employee.getSalary() > 0 && employee.getSalary() < 1000) {
			return 0;
		} else {
			return (employee.getSalary() * 3 / 100);
		}
	}

	public double bonus() {
		if (employee.getWorkHours() > 40) {
			return ((employee.getWorkHours() - 40) * 30);
		} else {
			return 0;
		}
	}

	public double raiseSalary() {
		if ((employee.getCurrentYear() - employee.getHireYear()) < 10) {
			return (employee.getSalary() * 5 / 100);
		}
		if ((employee.getCurrentYear() - employee.getHireYear()) > 9
				&& (employee.getCurrentYear() - employee.getHireYear()) < 20) {
			return (employee.getSalary() * 10 / 100);
		} else {
			return (employee.getSalary() * 15 / 100);
		}
	}

	public void toString(Employee employee) {
		System.out.println("Adı:" + employee.getName());
		System.out.println("Maaşı:" + employee.getSalary());
		System.out.println("Çalışma saati: " + employee.getWorkHours());
		System.out.println("Çalışma yılı: " + employee.getHireYear());
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maaş Artışı: " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + ((employee.getSalary() + bonus()) - tax()));
		System.out.println("Toplam Maaş: " + (((employee.getSalary() + bonus()) - tax()) + raiseSalary()));

	}

}
