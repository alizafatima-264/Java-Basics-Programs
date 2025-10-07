public class Car{
String company;
String model;
int year;
Car(String company ,String model ,int year){
this.company=company;
this.model=model;
this.year=year;
}
public void displayDetails(){
System.out.println("Car company :"+company);
System.out.println("Car model :"+model);
System.out.println("Car year :"+year);

}
public static void main(String[] args){
Car c=new Car("tesla", "model S", 2025);
c.displayDetails();
}

}