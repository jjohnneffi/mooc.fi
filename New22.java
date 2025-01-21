import java.util.*;
class Book
{
    private String name;
    private int id; 
    
    public Book(String name, int id)
    {
        this.name = name; 
        this.id = id; 
    }

    public int getId()
    {
        return id; 
    }
    public static int linearSearch(ArrayList<Book> books, int searchedId)
    { // {2,4,6,9,1,5,8}  // 9
        int count = 0; 
        for(Book data : books)
        {

            if(searchedId == data.getId())
            {
                return count; 
            }
            count += 1; 
        }
        return -1; 
    }
    public static int binarySearch(ArrayList<Book> books, int searchedId)
    {
        books.sort(Comparator.comparingInt(Book::getId));
        int left = 0;
        int right = books.size()-1; 
        
      //{8,9,10,11,12,13} // 13
        while(left<=right)
        {
            int mid = left + (right-left) / 2; 
            if(searchedId == books.get(mid).getId())
            {
                return mid; 
            }
            else if(searchedId > books.get(mid).getId())
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        ArrayList<Book> content = new ArrayList<>();
        content.add(new Book("Shepherds",2323)); 
        content.add(new Book("Darling",1223));
        content.add(new Book("Friend", 3832));
        content.add(new Book("Content", 8374));  
        int val = linearSearch(content,1223);
        System.out.println("The searched id is at index (using linear search) " + val);
        int val1 = binarySearch(content, 8374);
        System.out.println("The searched id is at index (using binary search) " + val1);

    }
}