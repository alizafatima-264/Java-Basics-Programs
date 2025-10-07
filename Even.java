public class Even{
public boolean isEven(int n){
if(n%2==0){
return true;
}
else{
return false;
}
}
public static void main(String[] args){
Even e=new Even();
boolean result=e.isEven(78);
System.out.println(result);
}
}