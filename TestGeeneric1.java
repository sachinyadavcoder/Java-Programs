import java.util.ArrayList; // Import ArrayList
import java.util.Scanner;

class TestGeeneric1
{
public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);

ArrayList <Integer> list = new ArrayList <Integer>();
System.out.print("Enter Number  : ");
int n= sc.nextInt();

list.add(n);

if(list.get(0)%2==0){
System.out.println("Number is even");
}
else{
System.out.println("Number is odd");
}


  }
}
