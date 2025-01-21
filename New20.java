import java.util.*;
class MainProgram
{
    
    //{6,5,8,7,11}
    public static int smallest(int[] array)
    {
        int max = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<max)
            {
                max = array[i];
            }
        }
        return max;
    }
    
    public static int indexOfSmallest(int[] array)
    {
        int max = Integer.MAX_VALUE;
        int count = 0; 
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<max)
            {
                max = array[i];
                count = i; 
            }
        }
        return count;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex)
    {
        int max = Integer.MAX_VALUE;
        int count = 0; 
        for(int i=startIndex;i<array.length;i++)
        {
            if(array[i]<max)
            {
                max = array[i];
                count = i; 
            }
        }
        return count;
    }
    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp; 
    }

    public static void sort(int[] array)
    {
        // int min=Integer.MIN_VALUE; 
        // for (int j=0;j<array.length-1;j++)
        // {
        //     System.out.println(Arrays.toString(array));
        //     min = j; 
        //     for (int i=j+1;i<array.length;i++)
        //     {
        //         if(array[min]>array[i])
        //         {
        //             min = i; 
        //         }
        //     }
        //     int temp = array[min];
        //     array[min] = array[j];
        //     array[j] = temp; 
        // }


        // for(int i=0;i<array.length;i++)
        // {
        //     int min_index = indexOfSmallestFrom(array, i);
        //     swap(array,i,min_index); 
        //     System.out.println(Arrays.toString(array));
        // }


        Arrays.sort(array); 
        System.out.println(Arrays.toString(array));
        //{8, 3, 7, 9, 1, 2, 4}
        

    }

  
    

    
    public static void main(String[] args) {
        //public static 
        int[] numbers = {3, 2, 5, 4, 8};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers,0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers,1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers,2));
        System.out.println(Arrays.toString(numbers));
        MainProgram.swap(numbers, 1, 0);
System.out.println(Arrays.toString(numbers));

MainProgram.swap(numbers, 0, 3);
System.out.println(Arrays.toString(numbers));
System.out.println();
int[] number = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(number);
    }
}