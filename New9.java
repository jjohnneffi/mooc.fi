
import java.util.*;

class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString()
    {
        String returnvalue = "";
        for (String val : elements)
        {
            returnvalue += val + "\n"; 
        }
        if (elements.isEmpty())
        {
            return "The collection alphabet is empty"; 
        }
        else
        {
        if (elements.size() == 1)
        {
             return "The collection alphabet has " + elements.size() + " element" + "\n" + returnvalue; 
        }
        else
        {
            return "The collection alphabet has " + elements.size() + " elements" + "\n" + returnvalue; 
        }    
        
    }
    }
  
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
System.out.println(s);

System.out.println();

s.add("a");
System.out.println(s);

System.out.println();

s.add("b");
System.out.println(s);

System.out.println();

s.add("c");
System.out.println(s);
    }

}