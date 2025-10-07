public class Student{
String name;
int age;
Student(String name, int age){
this.name=name;
this.age=age;
}
public void displayDetails(){
System.out.println("Student name :"+name);
System.out.println("Student age :"+age);
}
public static void main(String[] args){
Student s=new Student("Aliza",18);
s.displayDetails();
}
}