import java.util.Scanner;
class compno
{
	float real,img;
	public compno(float a,float b)
	{
		real=a;
		img=b;
	}
	static void add(compno c1,compno c2)
	{
		float real=c1.real+c2.real;
		float img=c1.img+c2.img;
		System.out.println("Addition of complex no is"+real+"+"+img+"i");
	}
	static void sub(compno c1,compno c2)
	{
		float real=c1.real-c2.real;
		float img=c1.img-c2.img;
		System.out.println("Subtraction of complex no is"+real+"+("+img+")i");
	}
	static void mul(compno c1,compno c2)
	{
		float real=c1.real*c2.real-c1.img*c2.img;
		float img=c1.img*c2.real+c1.real*c2.img;
		System.out.println("multiplictaion of complex no is"+real+"+("+img+")i");
	}
	static void div(compno c1,compno c2)
	{
		float denom=c2.real*c2.real+c2.img*c2.img;
		float real=(c1.real*c2.real-c1.img*c2.img)/denom;
		float img=(c1.real*c2.img+c1.img*c2.real)/denom;
		System.out.println("divisiom of complex no is"+real+"+("+img+")i");
	}
}
public class assno1
{
	public static void main(String[] args)
	{
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the real no 1:");
		float r1=p.nextInt();
		System.out.print("Enter the img no 1:");
		float i1=p.nextInt();
		System.out.print("Enter the real no 2:");
		float r2=p.nextInt();
		System.out.print("Enter the img no 2:");
		float i2=p.nextInt();
		compno n1=new compno(r1,i1);
		compno n2=new compno(r2,i2);
		compno.add(n1,n2);
		compno.sub(n1,n2);
		compno.mul(n1,n2);
		compno.div(n1,n2);
				
	}
}
