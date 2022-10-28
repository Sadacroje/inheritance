import java.util.Scanner;

public class Employee extends Person {

private double salary;
private String department;

public Employee() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Monthly Salary: ");
int salary = sc.nextInt();
sc.nextLine();
System.out.print("Enter Department: ");
String department = sc.next();
setDepartment(department);
setSalary(salary);
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
@Override
public String toString() {
return "Name: " + getName() + "\tContact Number:" + getContactNum() + "\tSalary:" + getSalary() + "\tDepartment:" + getDepartment();
}

}