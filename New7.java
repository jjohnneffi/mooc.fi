import java.util.*;
class Stack
{
    private ArrayList<String> value; 

    public Stack()
    {
        this.value = new ArrayList<>(); 
    }

    public boolean isEmpty()
    {
        if(this.value.isEmpty())
        {
            return true;
        }
        return false; 
    }
    public void add(String value)
    {
        if(!(this.value.contains(value)))
        {
            this.value.add(value);
        }
    }
    public ArrayList<String> values()
    {
        return value; 
    }
    
    public String take()
    {
        return value.get(0); 
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }

}