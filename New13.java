import java.util.*;
class Item
{
    private String name; 
    private int weight; 

    public Item(String name, int weight)
    {
        this.name = name; 
        this.weight = weight; 
    }
    public String getName()
    {
        return this.name;
    }
    public int getWeight()
    {
        return this.weight; 
    }
    public String toString()
    {
        return this.name + " (" + this.weight + " kg)"; 
    }
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }
}
class Suitcase
{
    int value; 
    int heavy; 
    Item heavier = new Item("",0);
    private ArrayList<Item> values; 
    private int test_weight; 

    public Suitcase(int test_weight)
    {
        this.values = new ArrayList<>(); 
        this.test_weight = test_weight;
    }
    public void addItem(Item item)
    {

        if (value+item.getWeight() < test_weight)
        {
            if (heavy <= item.getWeight())
            {
                heavier = item; 
            }
            values.add(item); 
            value += item.getWeight();
        }
    }
    public void printItems()
    {
        for(Item val : values)
        {
            System.out.println(val);
        }
    }
    public int totalWeight()
    {
        return value; 
    }
    public Item heaviestItem()
    {
        return heavier; 
    }
    public String toString()
    {
        if (values.size()==0)
        {
            return  "no items (" + value + " kg)"; 
        }
        else if (values.size()==1)
        {
            return values.size() + " item (" + value + "kg)"; 
        }
        else 
        {
            return values.size() + " items (" + value + "kg)"; 
        }
    }
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

    }
}
class Hold
{
    int hold_value; 
    private ArrayList<Suitcase> hold; 
    private int hold_weight; 
    public Hold(int hold_weight)
    {
        this.hold_weight = hold_weight; 
        this.hold = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase)
    {
        if(hold_value + suitcase.totalWeight() < hold_weight)
        {
            hold_value += suitcase.totalWeight();
            this.hold.add(suitcase);
        }
    }
    public String toString()
    {
        return hold.size() + " suitcases " + "(" + hold_value + " kg)"; 
    }
    public void printItems()
    {
        for (Suitcase content : hold)
        {
            content.printItems();
        }
    }
    public static void main(String[] args) {
      
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
