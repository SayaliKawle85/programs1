package java8_Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {

	List<Employee> empList = new ArrayList<>();

	public List<Employee> addEmployee() {
		empList.add(new Employee(101, "Prakash", 15000, "java developer", "Mumbai"));
		empList.add(new Employee(102, "Deepak", 10000, "Analyst", "Delhi"));
		empList.add(new Employee(103, "Payal", 25000, "java developer", "Mumbai"));
		empList.add(new Employee(104, "Zaid", 75000, "Analyst", "Banglore"));
		empList.add(new Employee(105, "Vaibhav", 80000, "Manager", "Delhi"));
		empList.add(new Employee(106, "Omni", 250000, "Scrum Master", "Banglore"));
		empList.add(new Employee(107, "Krishna", 76000, "java developer", "Chennai"));
		empList.add(new Employee(108, "Arnav", 96000, "Analyst", "Chennai"));
		empList.add(new Employee(109, "Soni", 85000, "Manager", "Mumbai"));
		empList.add(new Employee(110, "Seema", 95000, "Analyst", "Hyderabad"));
                empList.add(new Employee(111, "Mehek", 25000, "java developer", "Madhya pradesh"));
		empList.add(new Employee(112, "Vishal", 45000, "Analyst", "Delhi"));
           empList.add(new Employee(113, "Vikas", 85000, "Analyst", "Delhi"));


		return empList;
	}

	public List<Employee> getEmpSalGreaterThanTwentyFiveThousand() {
		// get all emps whos salary is greater than 25000
		List<Employee> salList = empList.stream().filter(a -> a.getEmpSalary() > 25000).toList();
		return salList;
	}

	public List<Employee> getEmpSalLesserThanTwentyFiveThousand() {
		// get all emps salary <25000
		List<Employee> salList = empList.stream().filter(a -> a.getEmpSalary() < 25000).toList();
		return salList;
	}

	public List<Employee> getSalBetTenThousandToFiftyThousand() {
		// get all emps whos salary is between 10000 to 50000
		List<Employee> salList = empList.stream().filter(a -> a.getEmpSalary() > 10000 && a.getEmpSalary() <= 50000)
				.toList();
		return salList;
	}

	public List<Employee> getEmpsCity() {
		// get all emps whos city is Hyderabad
		List<Employee> empCity = empList.stream().filter(a -> a.getCity() == "Hyderabad").toList();
		return empCity;
	}

	public List<Employee> getEmpsDesignation() {
		// get emps whos designation is Analyst
		List<Employee> empDesignation = empList.stream().filter(a -> a.getEmpDesignation() == "Analyst").toList();
		return empDesignation;
	}

	public static void main(String[] args) {
		EmployeeServices services = new EmployeeServices();
		services.addEmployee();
		// System.out.println(services.getEmpSalGreaterThanTwentyFiveThousand());
		// System.out.println(services.getEmpSalLesserThanTwentyFiveThousand());
		// System.out.println(services.getSalBetTenThousandToFiftyThousand());
		// System.out.println(services.getEmpsCity());
		System.out.println(services.getEmpsDesignation());
	}

}
