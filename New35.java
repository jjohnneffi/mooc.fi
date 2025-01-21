import java.util.*;

abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}

class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if(!(object instanceof Item))
        {
            return false; 
        }
        Item newobject = (Item) object; 
        if(this.name.equals(newobject.name))
        {
            return true; 
        }
        return false; 
    }

    public int hashcode()
    {
        return Objects.hash(name, weight); 
    }
}  

class BoxWithMaxWeight extends Box{
    private int capacity; 
    private ArrayList<Item> store; 
    public BoxWithMaxWeight(int capacity)
    {
        this.capacity = capacity; 
        this.store = new ArrayList<>(); 
    }
    @Override
    public void add(Item item)
    {
        if(this.capacity-item.getWeight() >= 0)
        {
            this.capacity -= item.getWeight(); 
            this.store.add(item); 
        }        
    }
    @Override
    public boolean isInBox(Item item)
    {
       if(this.store.contains(item))
       {
        return true;
       }
       return false; 
    }
    
    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
coffeeBox.add(new Item("Saludo", 5));
coffeeBox.add(new Item("Pirkka", 5));
coffeeBox.add(new Item("Kopi Luwak", 5));

System.out.println(coffeeBox.isInBox(new Item("Saludo")));
System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

    }
}

class OneItemBox extends Box
{
    private ArrayList<Item> onestore; 
    public OneItemBox()
    {
        this.onestore = new ArrayList<>(); 
    }
    @Override
    public void add(Item item)
    {
        if(this.onestore.size()<1)
        {
            this.onestore.add(item); 
        }
    }
    @Override
    public boolean isInBox(Item item)
    {
        if(this.onestore.contains(item))
        {
            return true; 
        }
        return false; 
    }

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();
box.add(new Item("Saludo", 5));
box.add(new Item("Pirkka", 5));

System.out.println(box.isInBox(new Item("Saludo")));
System.out.println(box.isInBox(new Item("Pirkka")));
    }
}

class MisplacingBox extends Box
{
    private ArrayList<Item> misplacebox;
    public MisplacingBox()
    {
        this.misplacebox = new ArrayList<>(); 
    }
    @Override
    public void add(Item item)
    {
        if(this.misplacebox.size()<1)
        {
            this.misplacebox.add(item); 
        }
    }
    @Override
    public boolean isInBox(Item item)
    {
        return false; 
    }
    public static void main(String[] args) {
        MisplacingBox box = new MisplacingBox();
box.add(new Item("Saludo", 5));
box.add(new Item("Pirkka", 5));

System.out.println(box.isInBox(new Item("Saludo")));
System.out.println(box.isInBox(new Item("Pirkka")));
    }
}