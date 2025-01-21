import java.nio.channels.Pipe.SourceChannel;
import java.util.*; 

class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
    

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true; 
        }
        if(!(object instanceof LicensePlate))
        {
            return false;
        }
        LicensePlate newlicense = (LicensePlate) object; 
        if(this.liNumber.equals(newlicense.liNumber) && (this.country).equals(newlicense.country))
        {
            return true;
        }
        return false; 
    }

    public int hashCode()
    {
        return(this.liNumber + "-" + this.country).hashCode(); 
    }

    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}

class VehicleRegistry
{
    private HashMap<LicensePlate, String> register; 
    public VehicleRegistry(HashMap register)
    {
        this.register = new HashMap<>(); 
    }

    public boolean add(LicensePlate licensePlate, String owner)
    {
        if((!(this.register.containsKey(licensePlate))) && (!(this.register.containsValue(owner))))
        {
                this.register.put(licensePlate,owner); 
                return true; 
        }
        return false; 
    }
    public void printLicensePlates()
    {
        for(LicensePlate val : this.register.keySet())
        {
            System.out.println(val);
        }
    }
    public void printOwners()
    {
        for(String val : this.register.values())
        {
            System.out.println(val);
        }
    }
    public String get(LicensePlate licensePlate)
    {
        if(this.register.containsKey(licensePlate))
        {
            return this.register.get(licensePlate);
        }
        return null; 
    }
    public boolean remove(LicensePlate licensePlate)
    {
        if(this.register.containsKey(licensePlate))
        {
            this.register.remove(licensePlate); 
            return true;
        }
        return false; 

    } 

    public static void main(String[] args) {
        HashMap<LicensePlate, String> value = new HashMap<>();  
        VehicleRegistry vehicle = new VehicleRegistry(value);
        LicensePlate l1 = new LicensePlate("IND", "ABC-123"); 
        LicensePlate l2 = new LicensePlate("IND", "ABC-125");
        LicensePlate l3 = new LicensePlate("IND", "EFG-344");  
        LicensePlate l4 = new LicensePlate("FIN", "STU-233");
        System.out.println(vehicle.add(l1,"John"));
        System.out.println(vehicle.add(l2, "John"));
        System.out.println(vehicle.add(l3,"Annie"));
        System.out.println(vehicle.add(l4, "Rufina"));
        System.out.println(vehicle.get(l4));
        System.out.println(vehicle.get(l1));
        // System.out.println(vehicle.remove(l4));
        // System.out.println(vehicle.remove(l2));
        System.out.println("####");
        vehicle.printLicensePlates();
        System.out.println("####");
        System.out.println("@@@@@");
        vehicle.printOwners();
        System.out.println("@@@@@@");

    }
}