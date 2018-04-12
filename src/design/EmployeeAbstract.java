package design;

public abstract class EmployeeAbstract implements Employee{

  //String employeeSocialSecurity;
  int empAge;

  public EmployeeAbstract()
  {}
  public EmployeeAbstract(int age){
      this.empAge=age;
  }

  public abstract String getSocialSecurity();


  public int getEmployeeAge()
    {
        return empAge;

    }




}
