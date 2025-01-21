import java.util.*; 
class Container  
{
    private int first; 
    private int second; 
    public void add(int amount)
    {
        if((amount+first<=100)&&(amount>=0))
        {
            first += amount;
        }
        else
        {
            if(amount>0)
            {
                first = 100; 
            }
        }
    }
public void move(int data)
{
    if(((first-data<=100)&&(first-data>=0))&&(second+data<=100)&&(data>=0))
    {
        first -= data; 
        second += data; 
    }
    else
    {
        if((data>0)&&(((first-data)+second))>=0)
        {
            first = 0;
            second = 100; 
        }
    }
}

    public void remove(int amount)
    {
        if((second-amount<=100)&&(second-amount>=0)&&(amount>=0))
        {
            second -= amount; 
        }
        else
        {
            if(amount>=0)
            {
                second = 0; 
            }
        }
    }

    public int first()
    {
        return first;
    }
    public int second()
    {
        return second; 
    }
    public String toString()
    {
        return "First:" +  first + "/100"+"\n"+"Second: " + second + "/100";
    }
   
}

class LiquidContainers2
{
    
    private Scanner scan; 
    private Container cont; 
    public LiquidContainers2(Container cont)
    {
        this.cont = cont; 
        this.scan = new Scanner(System.in); 
    }
    public void run()
    {
        while(true)
        {
            System.out.println("First: " + cont.first() + "/100");
            System.out.println("Second: " + cont.second() + "/100");
            String content = scan.nextLine();
            if(content.equals("quit"))
            {
                break; 
            }
            String[] value = content.split(" ");
            int data = Integer.valueOf(value[1]);
            if(value[0].equals("add"))
            {
                cont.add(data); 
            }
            if(value[0].equals("move"))
            {
                cont.move(data);
            }
            if(value[0].equals("remove"))
            {
                cont.remove(data);
            }
        }
    }
    public static void main(String[] args) {
        Container cont = new Container(); 
        LiquidContainers2 cont2 = new LiquidContainers2(cont);
        cont2.run();
    }
}