package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo emp1=new EmployeeInfo();
		EmployeeInfo emp2= new EmployeeInfo(1,"Fatima",35,"IT","1234-234-3567");
		System.out.println("Employee ID:- "+emp2.employeeId());
		System.out.println("Employee Name : "+emp2.employeeName());
		System.out.println("Employee Age: "+emp2.getEmployeeAge());
		System.out.println("Employee Department: "+emp2.getDeptName());
		System.out.println("Employee SSN: "+emp2.getSocialSecurity());
		emp2.setEmpSalary(10000);
		System.out.println("Employee basic Salary:= "+EmployeeInfo.empSalary);
		emp2.benefitLayout();
		System.out.println("Total salary after benefits are: "+emp2.calculateSalary());
		System.out.print(EmployeeInfo.calculateEmployeePension());

	}

}
