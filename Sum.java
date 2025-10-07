public class Sum{
public int add(int a,int b){
int sum;
sum=a+b;
System.out.println("Sum : "+sum);
return sum;
}
public static void main(String[] args){
Sum s=new Sum();
int sum=s.add(10,20);
}
}