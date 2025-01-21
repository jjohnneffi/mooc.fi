import java.util.*; 
class Gift
{
    private String name; 
    private int weight; 

    public Gift(String name, int weight)
    {
        this.name = name; 
        this.weight = weight; 
    }
    public String getName()
    {
        return this.name; 
    }
    public int  getWeight()
    {
        return this.weight; 
    }
    public String toString()
    {
        return this.name + " (" + this.weight + " kg)"; 
    }
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone",2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
}
class Package
{
    private ArrayList<String> gifts;
    public Package()
    {
        this.gifts = new ArrayList<>(); 
    }
    public void addGift(Gift gift)
    {
        this.gifts.add(gift.getName());
    }
    public int totalWeight()
    {
        return this.gifts.size(); 
    }
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}