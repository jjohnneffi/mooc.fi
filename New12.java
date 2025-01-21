import java.util.*;

class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}

class Room
{
    private ArrayList<Person> value; 
    public Room()
    {
        this.value = new ArrayList<>();
    }
    public void add(Person person)
    {
        this.value.add(person);
    }
    public boolean isEmpty()
    {
        if(this.value.isEmpty())
        {
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons()
    {
        return this.value; 
    }
    public Person shortest()
    {
        if (this.value.isEmpty())
        {
            return null;
        }
        else{
            Person person = this.value.get(0); 
            int val_height = Integer.MAX_VALUE; 
            for (Person valu : value)
            {
                if (valu.getHeight() < val_height)
                {
                    person = valu; 
                    val_height = valu.getHeight();
                }
            }
            return person; 
        }
       
    
    }
    public Person take()
    {
        if(this.value.isEmpty())
        {
            return null;
        }
        Person leave = shortest();
        this.value.remove(leave); 
        return leave; 
    }
    public static void main(String[] args)
    {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        
        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();
        while(!(room.isEmpty()))
        {
            System.out.println(room.take());
        }
    }
}