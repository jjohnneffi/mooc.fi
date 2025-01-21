import java.util.*;
import java.nio.file.*;
class Person
{
    private String name;
    private String age; 
    public Person(String name, String age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        if (Integer.valueOf(age)>1) 
        {
            return name + ", age: " + age + " years";
        }
        else {
            
            return name + ", age: " + age + " year";
        }
    }
}

public class New2
{

    public static ArrayList<Person> readRecordsFromFile(String file)
    {
        ArrayList<Person> persons = new ArrayList<>();
        try ( Scanner scanner = new Scanner(Paths.get(file));){
           
            while(scanner.hasNextLine())
            {
                String content = scanner.nextLine();
                String[] val = content.split(",");
                persons.add(new Person(val[0], val[1]));

            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        return persons; 
    }

    public static void main(String[] args) {
        ArrayList<Person> person = readRecordsFromFile("data.csv");
        for (Person name : person)
        {
            System.out.println(name);
        }
        
    }
}