import java.time.Clock;
import java.util.*; 
class ClockHand
{
    private int limit;
    private int value; 

    public ClockHand(int limit)
    {
        this.value = 0;
        this.limit = limit; 
    }

    public void advance()
    {
        this.value += 1;
        if (this.value >= this.limit)
        {
            this.value = 0;
        }
    }
    public int value()
    {
        return this.value;
    }
    public String toString()
    {
        if (this.value <=9)
        {
            return "0" + this.value; 
        }
        return "" + this.value; 
    }
}

public class New4
{
    private ClockHand hundreds;
    private ClockHand seconds;

    public New4()
    {
        this.hundreds = new ClockHand(100);
        this.seconds = new ClockHand(60); 

    }
    public void advance()
    {
        this.hundreds.advance();
        if (this.hundreds.value() == 0)
        {
            this.seconds.advance();
        }
    }
    public String toString()
    {
        return  seconds + ":" + hundreds;
    }
    public static void main(String[] args) {
        New4 val = new New4();
        while(true)
        {
            System.out.println(val);
            val.advance();

            try
            {
                Thread.sleep(100);

            }
            catch(Exception e)
            {
                
            }
        }
    }
}