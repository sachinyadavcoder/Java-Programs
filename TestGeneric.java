import java.util.*;

class TestGeneric
{
public static void main(String args[])
 {
ArrayList <Integer> list = new ArrayList <Integer>();
list.add(3);
list.add(4);
list.add(5);
list.remove(2);
//add
System.out.print(list.get(1)+" + "+list.get(0)+" = ");
System.out.println(""+list.get(1)+list.get(0));


  }
}
