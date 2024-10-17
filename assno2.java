import java.util.Scanner;
class employee
{
	String Emp_name;
	String Emp_id;
	String address;
	String mail_id;
	int no;
	double bp;
	void info()
	{
		Scanner p=new Scanner(System.in);
		System.out.print("enter the name:");
	        Emp_name=p.nextLine();
		System.out.print("enter the emp id:");
	        Emp_id=p.nextLine();
		System.out.print("enter the address:");
		address=p.nextLine();
		System.out.print("enter the mail id:");
		mail_id=p.nextLine();
		System.out.print("enter the no:");
		no=p.nextInt();
	}
}
class programmer extends employee
{
	double da,hra,pf,clubfund,gross_salary,net_salary;
	void display1()
	{
	Scanner r1=new Scanner(System.in);
	System.out.print("enter the basic pay:");
	double bp=r1.nextInt();;
	gross_salary=0;
	net_salary=0;
	da=0.97*bp;
	hra=0.1*bp;
	pf=0.12*bp;
	clubfund=0.01*bp;
	gross_salary=hra+da+bp;
	net_salary=gross_salary-(pf+clubfund);
	System.out.println("gross salary is"+gross_salary+"and net salary is"+net_salary);
	}
}
class team_lead extends employee
{
	double da,hra,pf,clubfund,gross_salary,net_salary;
	void display2()
	{
	Scanner r2=new Scanner(System.in);
	System.out.print("enter the basic pay:");
	double bp=r2.nextInt();
	gross_salary=0;
	net_salary=0;
	da=0.97*bp;
	hra=0.1*bp;
	pf=0.12*bp;
	clubfund=0.01*bp;
	gross_salary=hra+da+bp;
	net_salary=gross_salary-(pf+clubfund);
	System.out.println("gross salary is"+gross_salary+"and net salary is"+net_salary);
	}
}
class assistant_project_manager extends employee
{
	double da,hra,pf,clubfund,gross_salary,net_salary;
	void display3()
	{
	Scanner r3=new Scanner(System.in);
	System.out.print("enter the basic pay:");
	double bp=r3.nextInt();
	gross_salary=0;
	net_salary=0;
	da=0.97*bp;
	hra=0.1*bp;
	pf=0.12*bp;
	clubfund=0.01*bp;
	gross_salary=hra+da+bp;
	net_salary=gross_salary-(pf+clubfund);
	System.out.println("gross salary is"+gross_salary+"and net salary is"+net_salary);
	}
}
class project_manager extends employee
{
	double da,hra,pf,clubfund,gross_salary,net_salary;
	void display4()
	{
	Scanner r4=new Scanner(System.in);
	System.out.print("enter the basic pay:");
	double bp=r4.nextInt();
	gross_salary=0;
	net_salary=0;
	da=0.97*bp;
	hra=0.1*bp;
	pf=0.12*bp;
	clubfund=0.01*bp;
	gross_salary=hra+da+bp;
	net_salary=gross_salary-(pf+clubfund);
	System.out.println("gross salary is"+gross_salary+"and net salary is"+net_salary);
	}
}
public class assno2
{
	public static void main(String[] args)
	{
		Scanner n1=new Scanner(System.in);
		System.out.println("enter your choose");
		System.out.println("1 for enter the detail of programmer");
		System.out.println("2 for enter the detail of team lead");
		System.out.println("3 for enter the detail of assistant project manager");
		System.out.println("4 for enter the detail of project manager");
		for(int i=0;i<5;i++){
		int choice=n1.nextInt();
		switch (choice)
		{
			case 1:
			programmer p1=new programmer();
			p1.info();
			p1.display1();
			break;
			case 2:
			team_lead p2=new team_lead();
			p2.info();
			p2.display2();
			break;
			case 3:
			assistant_project_manager p3=new assistant_project_manager();
			p3.info();
			p3.display3();
			break;
			case 4:
			project_manager p4=new project_manager();
			p4.info();
			p4.display4();
			break;
		}
	}
	}
}
