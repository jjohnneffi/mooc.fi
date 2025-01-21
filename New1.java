import java.util.*;
class Book
{
  private String title;
  private String pages; 
  private String year;

  public Book(String title, String pages, String year)
  {
    this.title = title; 
    this.pages = pages; 
    this.year = year;
  }

  public String  getTitle()
  {
    return title; 
  }

  public String toString()
  {
    return title + ", " + pages + " pages, " + year;  
  }
  

}

class New1 
{
 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> item = new ArrayList<>();

   while (true)
   {
    System.out.print("Title: ");
    String val1 = scan.nextLine().trim();
    if (val1.isEmpty()) break;
    System.out.print("Pages: ");
    String val2 = scan.nextLine().trim();
    if (val2.isEmpty()) break; 
    System.out.print("Publication year: ");
    String val3 = scan.nextLine().trim();
    if(val3.isEmpty()) break;
    item.add(new Book(val1,val2,val3));
   }
   System.out.println("What information will be printed? ");
   String val4 = scan.nextLine().trim();
   if (val4.equals("everything"))
   {
    for (Book product : item)
    {
    System.out.println(product);
    }
   }
   else if (val4.equals("name"))
   {
    for (Book product : item)
    {
      System.out.println(product.getTitle());
    }
   }
}
}