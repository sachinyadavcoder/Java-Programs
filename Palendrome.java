//palemdrome
import java.util.*;
import java.util.*;
public class Palendrome{
	public static void main (String arg[]){
	int i ,r , temp ,a ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 st no to test:");
	a= sc.nextInt();
	
	int sum=0;
	ArrayList <Integer> list = new ArrayList <>();
	list.add(a);
	
	
	for (Integer num : list){
	for (i = 2; i <= num / 2; ++i) {
	temp=num;
	while(num>0){
	r = num%10;
	sum = (sum*10)+r;
	num=num/10;
	}
	if(temp == sum){
	System.out.println("The number is palendrome!!");
	
	}
	else{
	System.out.println("The number is not palendrome!!");
	
	}
	}
	}
	}
}
