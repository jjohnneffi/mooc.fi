import java.util.*;
class IOU
{
    private HashMap<String, Double> hashmap;
    public IOU()
    {
        this.hashmap = new HashMap<>();
    }
    public void setSum(String toWhom, double amount)
    {
        this.hashmap.put(toWhom, amount); 
    }
    public double howMuchDoIOweTo(String toWhom)
    {
        if(this.hashmap.containsKey(toWhom))
        {
            return this.hashmap.get(toWhom); 
        }
        return 0.0; 
    }
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);
        
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }  //{Hello=Hi, Good=Bad} -> HashMap
}
