import java.util.Scanner;
abstract class shape
{
	abstract public void compute(double n1,double n2);
	abstract public void area();
}
class triangle extends shape
{
	double length;
	double breadth;
	public void compute(double n1,double n2)
	{
		this.length=n1;
		this.breadth=n2;
	}
	public void area()
	{
		double total=0.5*length*breadth;
		System.out.println("The area of triangle is:"+total);
	}
}
class rectangle extends shape
{
	double length;
	double breadth;
	public void compute(double n1,double n2)
	{
		this.length=n1;
		this.breadth=n2;
	}
	public void area()
	{
		double total=length*breadth;
		System.out.println("The area of rectangle is:"+total);
	}
}

public class assno3
{
	public static void main(String[] args)
	{
		int choice;
		Scanner p=new Scanner(System.in);
		do{
		System.out.println("MENU");
		System.out.println("1 for taking area of triangle");
		System.out.println("2 for taking area of rectangle");
		System.out.println("3 for Exit");
		System.out.println("Enter your choice(1/2):");
		choice=p.nextInt();
		switch (choice)
		{
		case 1:
		System.out.print("length for triangle:");
		int k1=p.nextInt();
		System.out.print("height for triangle:");
		int k2=p.nextInt();
		triangle n1=new triangle();
		n1.compute(k1,k2);
		n1.area();
		break;
		case 2:
		System.out.print("length for rectangle:");
		int k3=p.nextInt();
		System.out.print("breadth for rectangle:");
		int k4=p.nextInt();	
		rectangle n2=new rectangle();
		n2.compute(k3,k4);
		n2.area();
		break;
		case 3:
		System.out.println("EXIT");
		break;
		default:
		System.out.println("please enter valid choice");
		break;
		}
		}while(choice!=3);
		
	}
}
