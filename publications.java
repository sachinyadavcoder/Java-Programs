class Publication
{
    String title;
    double price;
    int copies;
    
public Publication(String title,double price,int copies)
{
    this.title = title;
    this.price = price;
    this.copies = copies;
}

public double saleCopy(int copiesSold)
{

  return copiesSold*price;
    }
}

class Book extends Publication
{
  String author;
  
public Book(String title,double price,int copies,String author)
{
  super(title,price,copies);
  this.author = author;
}
public void orderCopies(int numOfcopies)
{
  this.copies +=numOfcopies;
    }
}
class Magazine extends Publication
{
  String currentissue;
public Magazine(String title,double price,int copies,String currentissue)
{
  super(title,price,copies);
  this.currentissue = currentissue;
}
public void orderQty(int qty)
{
  this.copies +=qty;
}
public void recieveissue(String issue)
{
  this.currentissue = issue;
  }
}
public class Main
{
public static void main(String[]args)
{
Book book1 = new Book("java Programming",5000.0,100,"james Gosling");

Magazine("Tech Today",100.0,50,"August2024");

book1.orderCopies(20);
mag1.orderQty(10);

mag1.reciveissue("September 2024");
//Calculate total sales for book and magazine
  double bookSales = book1.saleCopy(120);//Assuming 120 copies were sold
  double magSales = mag1.saleCopy(60);//Assuming 60 copies were sold
  
System.out.println("Total copies of the book ordered :" + book.copies);
System.out.println("Total sales for the book :" + bookSales);
System.out.println("Total sales for the magazine :" + magSales);
System.out.println("Total sales for all publication :" + (bookSales + magSales));
   }
 }
 





  
    
