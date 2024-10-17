import java.util.*;
class assno7
{
	public static void main(String args[])
	{
	//creating ArrayList
	ArrayList <Integer> list = new ArrayList<Integer>();
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n=sc.nextInt();
	//adding element in ArrayList
	list.add(n);
	
	System.out.println("\t What You want to check : ");
	System.out.println("1.To Check EvenOdd");
	System.out.println("2.To Check Is Prime ");
	System.out.println("3.To Check Is Palinedrome");
	System.out.println("4.Exit");
	int ch;
	do{
	System.out.print("-----> Check : ");
	ch=sc.nextInt();
	switch(ch){
	case 1:EvenOdd(list.get(0));
	 break;
	 case 2:IsPrime(list.get(0));
	 break;
	 case 3:IsPalindrome(list.get(0));
	 break;
	 case 4:System.out.println("Exit");
	 break;
	 default:
	 System.out.println("Invalid Choice");
	 } 
	}while(ch!=4);
	}
public static void EvenOdd(int n){
 	if(n%2==0){
	System.out.println(n+" Is Even");
	}
	else{
	System.out.println(n+" Is Odd");
	}
 }
 public static void IsPrime(int n){
 boolean IsPrime=true;
	 for(int i = 2;i<n;i++)
	 {
	   if(n%i==0)
	    {
	    IsPrime=false;
	    break;
	    }
	 }
	if(IsPrime)
	{System.out.println(n+" Is Prime");
	}
	else{
	System.out.println(n+" Is not Prime");
	}
 }
 public static void IsPalindrome(int n){
 		int temp;
		temp=n;
		int rev=0,rem;
		while(temp>0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		  	if(n==rev)
		  	{
		  		System.out.println(n+" Is Palindrome");
		  	}
		  	else
		  	{
		  		System.out.println(n+" Is Not Palindrome");
		  	}
	
 }
	
	
 
}
