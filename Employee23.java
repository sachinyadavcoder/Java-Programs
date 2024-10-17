import java.util.*;
class Employee23
{
 int id;
 long mobile_no;
 String name;
 String mail_id;
 String address;
 Scanner sc = new Scanner(System.in);
 
 void data()
 {
  System.out.println("Enter the ID of Employee: ");
  id = sc.nextInt();
  
  System.out.println("Enter the mobile number of Employee: ");
  mobile_no = sc.nextLong();
  
  System.out.println("Enter the name of Employee:");
  name = sc.nextLine();
  
  System.out.println("Enter mail id of employee: ");
  mail_id = sc.nextLine();
  
  System.out.println("Enter address of employee: ");
  address = sc.nextLine();
  }
  void display()
   {
    System.out.println("Enter the id of employee"+id);
    System.out.println("Enter the moibile number of employee"+mobile_no);
    System.out.println("Enter the name of employee"+name);
    System.out.println("Enter the Mail ID of employee"+mail_id);
    System.out.println("Enter the adreess of employee"+address);
   }
}



class Programmer extends Employee23
{
 double gross_sal;
 double net_sal;
 double bp, hra, club, pf, da;
 
 void programmer_salary()
  {
  System.out.println("Enter Your Basic Pay: ");
  bp = sc.nextDouble();
   
  da = (0.97*bp);
  hra = (0.10*bp)
  pf = (0.12*bp)
  club = (0.001*bp);
  gross_sal = bp + da + hra;
  net_sal = gross_sal - (pf + club);
  
  System.out.println("Gross Salary is "+gross_sal);
  System.out.println("Net Salary is "+net_sal);
  }
}

class Team_leader extends Employee23
{
 double gross_sal;
 double net_sal;
 double bp, hra, club, pf, da;
 
 void teamlead_salary()
  {
  System.out.println("Enter Your Basic Pay: ");
  bp = sc.nextDouble();
   
  da = (0.97*bp);
  hra = (0.10*bp)
  pf = (0.12*bp)
  club = (0.001*bp);
  gross_sal = bp + da + hra;
  net_sal = gross_sal - (pf + club);
  
  System.out.println("Gross Salary is "+gross_sal);
  System.out.println("Net Salary is "+net_sal);
  }
}


class Assistant_Manager extends Employee23
{
 double gross_sal;
 double net_sal;
 double bp, hra, club, pf, da;
 
 void asstman_salary()
  {
  System.out.println("Enter Your Basic Pay: ");
  bp = sc.nextDouble();
   
  da = (0.97*bp);
  hra = (0.10*bp)
  pf = (0.12*bp)
  club = (0.001*bp);
  gross_sal = bp + da + hra;
  net_sal = gross_sal - (pf + club);
  
  System.out.println("Gross Salary is "+gross_sal);
  System.out.println("Net Salary is "+net_sal);
  }
}

class Project_Manager extends Employee23
{
 double gross_sal;
 double net_sal;
 double bp, hra, club, pf, da;
 
 void projman_salary()
  {
  System.out.println("Enter Your Basic Pay: ");
  bp = sc.nextDouble();
   
  da = (0.97*bp);
  hra = (0.10*bp)
  pf = (0.12*bp)
  club = (0.001*bp);
  gross_sal = bp + da + hra;
  net_sal = gross_sal - (pf + club);
  
  System.out.println("Gross Salary is "+gross_sal);
  System.out.println("Net Salary is "+net_sal);
  }
}

class Main_salary
{
 public static void main(String args[])
 {
  
 }
}






