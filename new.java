import java.util.*;
public class New
{
    public static void printSpaces (int number)
    {
        for (int i = 1; i<=number; i ++ )
        {
            System.out.print("*");
           
        }
        System.out.println();
    }
    public static void printTriangle(int size)
    {
        
        for (int i =1; i<=size; i++)
        {
            int k = i; 
            for (int j=1; j<=size-i; j++)
            {
                System.out.print(" ");
                
            }
            while (k>0)
            {
                System.out.print("*");
                k -= 1; 
            }
            System.out.println();
        }
        
        
    }
    public static void christmasTree(int height)
    {
        for (int i =1; i<=height; i++)
        {
            int k = i; 
            int l = i; 
            for (int j=1; j<=height-i; j++)
            {
                System.out.print(" ");
                
            }
            while (k>0)
            {
                System.out.print("*");
                k -= 1; 
            }
            while (l>1)
            {
                System.out.print("*");
                l-=1;

            }
            System.out.println();
        }
    
  
        int n = 0;
        while (n<2)
        {
        int val1 = ((height * 2)-1); 
        int cent = val1 / 2;
        int m = 0; 
        
        
        for (int i =1; i<cent; i++)
        {
            System.out.print(" ");
        }
        while (m < 3)
        {
            System.out.print("*");
            m += 1; 
        }
        n += 1; 
        System.out.println();
    
    }
    
 

    }
  
    

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        christmasTree(10);
    
    }
  
}