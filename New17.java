import java.util.*; 
class JokeManager
{
    private ArrayList<String> comedy;
    public JokeManager()
    {
        this.comedy = new ArrayList<>(); 
    }
    public void addJoke(String joke)
    {
        if (!(comedy.contains(joke)))
        {
            this.comedy.add(joke);  
        }
    }
    public String drawJokes()
    {
        Random draw = new Random(); 
        int index = draw.nextInt(comedy.size());
        return comedy.get(index); 
    }
    public void printJokes()
    {
        for (String val : this.comedy)
        {
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        
        JokeManager manager = new JokeManager();
manager.addJoke("What is red and smells of blue paint? - Red paint.");
manager.addJoke("What is blue and smells of red paint? - Blue paint.");

System.out.println("Drawing jokes:");
for (int i = 0; i < 5; i++) {
    System.out.println(manager.drawJokes());
}

System.out.println("");
System.out.println("Printing jokes:");
manager.printJokes();
    }

}
class UserInterface
{
    private JokeManager fun; 
    private Scanner scan;
    public UserInterface(JokeManager fun)
    {
        this.fun = fun; 
        this.scan = new Scanner(System.in); 
    }
    public void start()
    {
        while(true)
        {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String val = scan.nextLine(); 
            if (val.equals("1"))
            {
                System.out.println("Write the joke to be added: ");
                String jok = scan.nextLine(); 
                fun.addJoke(jok);
            }
            else if (val.equals("2"))
            {
                System.out.println(fun.drawJokes());
            }
            else if (val.equals("3"))
            {
                fun.printJokes();
            }
            else 
            {
                break; 
            }

        }
    }
    public static void main(String[] args) {
        JokeManager jokey = new JokeManager(); 
        UserInterface ui = new UserInterface((jokey));
        ui.start();
    }
}