package design;

import java.util.Calendar;
import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	int employeeId, empPerformance;
	double empSalary;
	String empName;
	String ssn, deptName;
	static double houseRent;
	static double medicalAllownce;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {
		employeeId=0;
		empName="";
		empSalary=0;
		empAge=0;
		deptName="";
		ssn="";
	}
	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;

	}

	public EmployeeInfo(int employeeId, String name) {

		this.employeeId = employeeId;
		empName = name;
	}

	public EmployeeInfo(int employeeId, String name, int age) {
		super(age);
		this.employeeId = employeeId;
		empName = name;

	}

	public EmployeeInfo(int employeeId, String name, int age, String department) {
		super(age);
		this.employeeId = employeeId;
		empName = name;
		deptName = department;
	}

	public EmployeeInfo(int employeeId, String name, int age, String department, String ssn) {
		super(age);
		this.employeeId = employeeId;
		empName = name;
		this.ssn = ssn;
		deptName = department;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus( double empSalary, int empPerformance) {
		double total = 0;
		if(empPerformance == 1)
           total=empSalary*10/100.0;
        else if(empPerformance==2)
			total=empSalary*8/100.0;
        else
        	total=empSalary*5/100.0;

        	return total;
		}

		/*
		 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
		 * Then it will return the total pension. So you need to implement the logic.
		 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
		 *
		 */
		public static double calculateEmployeePension (int numberOfYearsWithCompany) {
			double total = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter start date in format (example: May,2015): ");
			String joiningDate = sc.nextLine();
			System.out.println("Please enter today's date in format (example: August,2017): ");
			String todaysDate = sc.nextLine();
			String convertedJoiningDate = DateConversion.convertDate(joiningDate);
			String convertedTodaysDate = DateConversion.convertDate(todaysDate);
			//implement numbers of year from above two dates
			int numOfYears;

			//Calculate pension

			return total;
		}

		@Override
		public int employeeId () {
			return employeeId;
		}

		@Override
		public String employeeName () {
			return empName;
		}

		@Override
		public void assignDepartment () {

		}
		public String getDeptName()
		{
			return deptName;
		}
		public void setEmpSalary ( double salary)
		{
			empSalary = salary;
		}

		@Override
		public double calculateSalary () {

			empSalary += houseRent + medicalAllownce;

			return empSalary;
		}

		@Override
		public void benefitLayout () {
			houseRent = empSalary * 10.0 / 100;
			medicalAllownce = empSalary * 5.0 / 100;
			System.out.println("house Rent:- "+houseRent);
			System.out.println(("medical allowance:- "+medicalAllownce));
		}

		@Override
		public String getSocialSecurity () {
			return ssn;
		}

		private static class DateConversion {

			public DateConversion(Months months) {
			}

			public static String convertDate(String date) {
				String[] extractMonth = date.split(",");
				String givenMonth = extractMonth[0];
				int monthDate = whichMonth(givenMonth);
				String actualDate = monthDate + "/" + extractMonth[1];
				return actualDate;
			}

			public static int whichMonth(String givenMonth) {
				Months months = Months.valueOf(givenMonth);
				int date = 0;
				switch (months) {
					case January:
						date = 1;
						break;
					case February:
						date = 2;
						break;
					case March:
						date = 3;
						break;
					case April:
						date = 4;
						break;
					case May:
						date = 5;
						break;
					case June:
						date = 6;
						break;
					case July:
						date = 1;
						break;
					case August:
						date = 1;
						break;
					case September:
						date = 1;
						break;
					case October:
						date = 1;
						break;
					case November:
						date = 1;
						break;
					case December:
						date = 1;
						break;
					default:
						date = 0;
						break;
				}
				return date;

			}
		}
	}
