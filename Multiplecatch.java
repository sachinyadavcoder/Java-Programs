class Multiplecatch
{
public static void main (String args[])
{
try{
int a[]=new int[5];
a[10]=55/0;

}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception Occure");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index Out Of Bounds Exception Occure");
}
System.out.println("Rest of code" );
}
}
