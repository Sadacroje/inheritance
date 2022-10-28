import java.util.Scanner;
public class Faculty extends Employee {
private boolean status;
public Faculty() {
Scanner sc = new Scanner(System.in);
System.out.print("Are you regular? Press Y/N: ");
String yes_no = sc.next();
if (yes_no.equals("Y")) {
status = true;
} else {
status = false;
}
}
public boolean isRegular() {
return status;
}
@Override
public String toString() {
return "Name: " + getName() + "\tContact Number:" + getContactNum() + "\tSalary:" + getSalary() + "\tDepartment:" + getDepartment() + "\tIsRegular:" + isRegular();
}

}