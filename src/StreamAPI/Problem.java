package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem {
public static void main(String[] args) {
	 List<Employee> employeeList =new ArrayList<>();
     employeeList.add(new Employee("1", "Alice", "50000", "New York", "30"));
     employeeList.add(new Employee("2", "Alice", "60000", "Los Angeles", "35"));
     employeeList.add(new Employee("3", "Charlie", "55000", "Chicago", "32"));
     employeeList.add(new Employee("4", "David", "62000", "Houston", "40"));
     employeeList.add(new Employee("5", "Eve", "58000", "San Francisco", "28"));
     employeeList.add(new Employee("6", "Frank", "61000", "Seattle", "37"));
//     List<Sample> alice = employeeList.stream()
//             .filter(e -> e.getName().equals("Alice"))
//             .map(e->{
//                 Sample sample=new Sample();
//                 sample.setAge(e.getAge());
//                 sample.setAddress(e.getCity());
//                 return sample;
//             })
//
//             .collect(Collectors.toList());
//     
//     System.out.println(alice);

     
int highestSalary = employeeList.stream()
.map(e -> Integer.parseInt(e.getSalary())) 
.reduce(0, (max, current) -> current > max ? current : max); // Find max salary

System.out.println("Highest Salary: "+highestSalary);
 
}
}
