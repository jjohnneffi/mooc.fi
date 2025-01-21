import java.util.*;
class Person
{
    protected String name; 
    protected String address; 

    public Person(String name, String address)
    {
        this.name = name; 
        this.address = address; 
    }

    public String toString()
    {
        return name + "\n" + "  " + address;  
    }
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }
}

class Student extends Person
{
    protected String stud_name; 
    protected String stud_add; 
    protected int credits; 
    public Student(String stud_name, String stud_add)
    {
        super(stud_name, stud_add); 
    }
    public void study()
    {
        credits += 1; 

    }
    public int credits()
    {
        return credits; 
    }
    public String toString()
    {
        return super.toString() + "\n" + "  " + "Study Credits " + credits; 
    }
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }
}
class Teacher extends Person
{
    protected String stud_name; 
    protected String stud_add;
    protected int  teach_salary; 
    public Teacher(String stud_name, String stud_add, int teach_salary)
    {
        super(stud_name, stud_add);
        this.teach_salary = teach_salary; 
    }
    public String toString()
    {
        return super.toString() + "\n" + "  salary " + this.teach_salary + " euro/month";   
    }

    

    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
System.out.println(ada);
System.out.println(esko);

Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

int i = 0;
while (i < 25) {
  ollie.study();
  i = i + 1;
}
System.out.println(ollie);
    }
}

public class New33
{
    public static void printPersons(ArrayList<Person> persons)
    {
        for(Person val : persons)
        {
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
    
        printPersons(persons);
    }
}