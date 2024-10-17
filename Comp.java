import java.util.*;
class Complex_number
{
 float real;
 float img;
 public Complex_number()
 {
   real=0;
   img=0;
 }   
 public Complex_number(float real, float img)
  {
   this.real=real;
   this.img=img;
  }
  public void Display(Complex_number C1, Complex_number C2)
  {
    System.out.println("First Complex Number =("+C1.real+")+("+C1.img+")i");
    System.out.println("First Complex Number =("+C2.real+")+("+C2.img+")i");
  }
  
    public void Add_number(Complex_number C1, Complex_number C2)
      {
        float real;
        float img;
        
        real=(C1.real+C2.real);
        img=(C1.img+C2.img);
        
        System.out.println("Addition of Complex Number = "+real+"+"+img+"i");
      }
      
      public void Sub_number(Complex_number C1, Complex_number C2)
      {
        float real;
        float img;
        
        real=(C1.real-C2.real);
        img=(C1.img-C2.img);
        
        System.out.println("Substraction of Complex Number = "+real+"+"+img+"i");
      }
      
      public void Mult_number(Complex_number C1, Complex_number C2)
      {
        float real;
        float img;
        
        real=(C1.real*C2.real-C1.img*C2.img);
        img=(C1.real*C2.img+C1.img*C2.real);
        
        System.out.println("Addition of Complex Number = "+real+"+"+img+"i");
      }
      
      public void Div_number(Complex_number C1, Complex_number C2)
      {
        float real;
        float img;
        
        real=(C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
        img=(C1.img*C2.real-C1.real*C2.img)/(C2.img*C2.real-C2.real*C2.img);
        
        System.out.println("Division of Complex Number = "+real+"+"+img+"i");
      }
}      
      
  public class Comp
  {
   public static void main(String args[])
   {
    float n1, n2;
    Complex_number c=new Complex_number();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Complex Number in a+bi format: ");
    
    System.out.println("Enter 1 real number: ");
    n1=sc.nextFloat();
    System.out.println("Enter 1 imaginary number: ");
    n2=sc.nextFloat();
    Complex_number c1=new Complex_number(n1,n2);
    
    System.out.println("Enter 2 real number: ");
    n1=sc.nextFloat();
    System.out.println("Enter 2 imaginary number: ");
    n2=sc.nextFloat();
    Complex_number c2=new Complex_number(n1,n2);
    
    System.out.print("\n");
    c.Display(c1,c2);
    
    System.out.print("\n");
    c.Add_number(c1,c2);
    
    System.out.print("\n");
    c.Sub_number(c1,c2);
    
    System.out.print("\n");
    c.Mult_number(c1,c2);
    
    System.out.print("\n");
    c.Div_number(c1,c2);
    
   }
  }
