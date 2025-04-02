package StreamAPI1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(
		    new Employee("Alice", 5000),
		    new Employee("Bob", 6000),
		    new Employee("Charlie", 7000)
		);
Map<String,Double> employeeMap=employees.stream().collect(Collectors.toMap(Employee:: getName,Employee:: getSalary));
	System.out.println("EmployeeToMap: "+employeeMap );
}
}
