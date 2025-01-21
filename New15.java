import java.util.*;

class TodoList {
    private HashMap<Integer, String> tasklist; 
    int count;
    public TodoList()
    {
        this.tasklist = new HashMap<>(); 
    }
    public void add(String task)
    {
        count += 1;
        tasklist.put(count,task); 
    }
    public void print()
    {
        tasklist.forEach((key,value) -> System.out.println(key + ": " + value));
    }
    public void remove(int val)
    {
        tasklist.remove(val); 
    }
    public static void main(String[] args) {
        TodoList list = new TodoList(); 
        list.add("read the course material"); 
        list.add("watch the latest fool us"); 
        list.add("take it easy"); 

        list.print();
        list.remove(2);

        System.out.println();
        list.print();
    }
}
class UserInterface
{
    private TodoList todo; 
    private Scanner scan; 

    public UserInterface(TodoList todo, Scanner scan)
    {
        this.todo = todo; 
        this.scan = scan;
    }
    public void start()
    {
        while (true)
        {
            System.out.print("Command: ");
            String val = scan.nextLine(); 
            if (val.equals("add"))
            {
                System.out.print("To add: ");
                String val1 = scan.nextLine();
                todo.add(val1);
            }
            else if(val.equals("list"))
            {
                todo.print();
            }
            else if(val.equals("remove"))
            {
                System.out.print("Which one is removed? ");
                int num = Integer.valueOf(scan.nextLine()); 
                todo.remove(num);
            }
            else if(val.equals("stop"))
            {
                break; 
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        TodoList todo = new TodoList(); 
        UserInterface ui = new UserInterface(todo, scan);
        ui.start(); 
    }
}
