import java.util.*; 
class StorageFacility
{
    private HashMap<String,ArrayList<String>> storage; 
    public StorageFacility()
    {
        this.storage = new HashMap<>(); 
    }
    public void add(String unit, String item)
    {
        this.storage.putIfAbsent(unit,new ArrayList<>()); 
        ArrayList<String> temp = this.storage.get(unit); 
        temp.add(item); 
    }
    public ArrayList<String> contents(String storageUnit)
    {
        ArrayList<String> content = this.storage.get(storageUnit);
        if(content==null)
        {
            return new ArrayList<>(); 
        }
        return content;
    }
    public void remove(String storageUnit, String item)
    {
        if(this.storage.get(storageUnit).isEmpty())
        {
            this.storage.remove(storageUnit); 
        }
        else
        {
            this.storage.get(storageUnit).remove(item); 
        }
    }
    public ArrayList<String> storageUnits()
    {
        ArrayList<String> title = new ArrayList<>();
        for(String val : this.storage.keySet())
        {
            title.add(val); 
        }
        return title; 
    }
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
facility.add("a14", "ice skates");
facility.add("a14", "ice hockey stick");
facility.add("a14", "ice skates");

facility.add("f156", "rollerblades");
facility.add("f156", "rollerblades");

facility.add("g63", "six");
facility.add("g63", "pi");

facility.remove("f156", "rollerblades");


System.out.println(facility.contents("f156"));

facility.remove("f156", "rollerblades");

System.out.println(facility.storageUnits());
    }
}