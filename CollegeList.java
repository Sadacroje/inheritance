CollegeList.java

import java.util.Scanner;
public class CollegeList {

public static void main(String[] args) {
Person person;
Scanner sc = new Scanner(System.in);
System.out.print("Select Among Employee, Faculty, or Student by pressing E,F,or S: ");
String option = sc.next();

switch (option) {
case "E":
person = new Employee();
System.out.println(person.toString());
break;
case "F":
person = new Faculty();
System.out.println(person.toString());
break;
case "S":
person = new Student();
System.out.println(person.toString());
break;
default:
System.out.println("Invalid choice...");
break;
}

}
}