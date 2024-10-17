
abstract class Shape
{
  abstract public void Compute_area(int a, int b);
  abstract public void Calculate_area();
}

class Triangle extends Shape
 {
  public int base;
  public int height;
  public void Compute_area(int base, int height)
   {
    this.base=base;
    this.height=height;
   }
   public void Calculate_area()
   {
    System.out.println("The Area of Triangle = "+0.5*base*height);
   }
 }
 
 class Rectangle extends Shape
 {
  public int length;
  public int breadth;
  public void Compute_area(int length, int breadth)
   {
    this.length=length;
    this.breadth=breadth;
   }
   public void Calculate_area()
   {
    System.out.println("The Area of Reactangle = "+length*breadth);
   }
 }
 
 class Abstract_p
 {
  public static void main(String args[])
   {
    Shape t1 = new Triangle();
    t1.Compute_area(5,6);
    
    
    Shape t2 = new Rectangle();
    t2.Compute_area(9,9);
    
    t1.Calculate_area();
    t2.Calculate_area();
   }
 }
 
 
 
 
 
 
 
 
