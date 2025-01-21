import java.util.*;

class Work
{
    public static void sort(int[] array)
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(String[] array)
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sortIntegers(ArrayList<Integer> integers)
    {
        Collections.sort(integers);
        System.out.println(integers);
    }
    public static void sortStrings(ArrayList<String> strings)
    {
        Collections.sort(strings); 
        System.out.println(strings);
    }
    public static void main(String[] args) {
        int[] array = {2,4,6,1,2,9,3};
        sort(array); 
        String[] array1 = {"Hello","Hi","Good"}; 
        sort(array1);
        ArrayList<Integer> val = new ArrayList<>(List.of(9,1,6,8,2,4,9,2)); 
        sortIntegers(val);
        ArrayList<String> val1 = new ArrayList<>(List.of("Hello", "Hi", "Love","Affection"));
        sortStrings(val1);
    }
}