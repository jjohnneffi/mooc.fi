import java.util.*;
class LiquidContainers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int first = 0;
        int second = 0;  
        while(true)
        {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String content = scan.nextLine();
            if(content.equals("quit"))
            {
                break; 
            }
            String[] value = content.split(" ");
            int data = Integer.valueOf(value[1]);
            if(value[0].equals("add"))
            {
                if((data+first<=100)&&(data>=0))
                {
                    first += data;
                }
                else
                {
                    if(data>0)
                    {
                        first = 100; 
                    }
                }
            }
           
            if(value[0].equals("move"))
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
            if(value[0].equals("remove"))
            {
                if((second-data<=100)&&(second-data>=0)&&(data>=0))
                {
                    second -= data; 
                }
                else
                {
                    if(data>=0)
                    {
                        second = 0; 
                    }
                }
            }
        }
    }
}