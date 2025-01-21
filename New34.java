
import java.util.*;
class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - getBalance();
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;
        } else {
            this.balance = this.capacity;
        }
       
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
    
}

class ProductWarehouse extends Warehouse
{
    private String productName;
    public ProductWarehouse(String productName, double capacity)
    {
        super(capacity); 
        this.productName = productName;
    }
    public void setName(String newName)
    {
        this.productName = newName; 
    }
    public String getName()
    {
        return productName; 
    }
    public String toString()
    {
        return productName + ": " + super.toString();  
    }
    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
juice.addToWarehouse(1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
juice.addToWarehouse(1.0);
System.out.println(juice);  
    }
}


class ChangeHistory
{
    private ArrayList<Double> history; 
    public ChangeHistory()
    {
        this.history = new ArrayList<>();
    }
    public void add(double status)
    {
        this.history.add(status); 
    }
    public void clear()
    {
        this.history = new ArrayList<>();
    }
    public double maxValue()
    {
        if(!history.isEmpty())
        {
            double initial = 0.0; 
            for(Double val : history)
            {
                if (initial < val)
                {
                    initial = val; 
                }
            }
            return initial; 
        }
        return 0.0;
    }
    public double minValue()
    {
        if(!history.isEmpty())
        {
            double initial = history.get(0); 
            for(Double val : history)
            {
                if(initial > val)
                {
                    initial = val;
                }
            }
            return initial; 
        }
        return 0.0;
    }
    public double average()
    {
        double avg = 0.0; 
        if(!history.isEmpty())
        {
            for(Double val : history)
            {
                avg += val; 
            }
            avg /= history.size(); 
        }
        return avg; 
    }
    public String toString()
    {
        return this.history.toString(); 
    }
}

class ProductWarehouseWithHistory extends ProductWarehouse
{
    private ChangeHistory change; 
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance)
    {
        super(productName, capacity);
        this.change = new ChangeHistory(); 
        this.change.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    public void addToWarehouse(double amount)
    {
        super.addToWarehouse(amount);
        this.change.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount)
    {
        super.takeFromWarehouse(amount);
        this.change.add(super.getBalance());
        return super.getBalance(); 
    }
    public String history()
    {
        return this.change.toString(); 
    }
    public void printAnalysis()
    {
        System.out.println("Largest amount of product: " + this.change.maxValue());
        System.out.println("Smallest amount of product: " + this.change.minValue());
        System.out.println("Average: " + this.change.average());
    }
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
juice.addToWarehouse(1.0);
System.out.println(juice);
System.out.println(juice.history());
juice.printAnalysis();
    }
}

