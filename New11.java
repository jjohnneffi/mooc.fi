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

    public String longest()
    {
        String longg = "";
        int siz = 0;
        if(elements.isEmpty())
        {
            longg = null; 
        }
        for (String val : elements)
        {
            if(val.length() > siz)
            {
                siz = val.length(); 
                longg = val; 
            }
        }
        return longg; 
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
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());
        
        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");
        
        System.out.println("Longest: " + j.longest());

    }

}