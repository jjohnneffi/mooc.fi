import java.util.HashMap;

class Program
{
    public static String sanitizedString(String text)
    {
        if(text == null)
        {
            return "";
        }
        text = text.toLowerCase(); 
        return text.trim(); 
    }
    public static void printKeys(HashMap<String, String> hashmap)
    {
        for(String values : hashmap.keySet())
        {
            System.out.println(values);
        }
    }
    public static void printKeysWhere(HashMap<String, String> hashmap, String text)
    {
        for(String values : hashmap.keySet())
        {
            if(values.contains(sanitizedString(text)))
            {
                System.out.println(values);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap <String, String> hashmap, String text)
    {
        for(String values : hashmap.keySet())
        {
            if(values.contains(sanitizedString(text)))
            {
                System.out.println(hashmap.get(values));
            }
        }
    }
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>();
hashmap.put("f.e", "for example");
hashmap.put("etc.", "and so on");
hashmap.put("i.e", "more precisely");

printKeys(hashmap);
System.out.println("---");
printKeysWhere(hashmap, "i");
System.out.println("---");
printValuesOfKeysWhere(hashmap, ".e");
    }
}

class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof Book)) {
            return false;
        }

        // let's convert the object to a Book-object
        Book comparedBook = (Book) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.name.equals(comparedBook.name) &&
            this.published == comparedBook.published &&
            this.content.equals(comparedBook.content)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }


    public int hashCode()
    {
        if(this.name == null)
        {
            return this.published; 
        }
        return this.published + this.name.hashCode(); 
    }


    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
            + "Content: " + this.content;
    }

    
}

class Program1
{
    public static void printValues(HashMap<String, Book> hashmap)
    {
        for (Book values : hashmap.values())
        {
            System.out.println(values);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text)
    {
        for (String keys : hashmap.keySet())
        {
            if(keys.contains(text))
            {
                System.out.println(hashmap.get(keys));
            }
        }
    }
    public static void main(String[] args) {
      
HashMap<Book, String> borrowers = new HashMap<>();

Book bookObject = new Book("Book Object", 2000, "...");
borrowers.put(bookObject, "Pekka");
borrowers.put(new Book("Test Driven Development",1999, "..."), "Arto");

System.out.println(borrowers.get(bookObject));
System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...")));
    }
}