package StreamAPI1;

public class Employee {
//	Given a list of employees with their names and salaries, convert it into a Map<String, Double> where the key is the name and the value is the salary.
 

	   private String name;
	 private  double salary;
	    public Employee(String name, double salary)
	    {
	    	this.name=name;
	    	this.salary=salary;
	    }


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





	}


