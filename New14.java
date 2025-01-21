import java.util.*;
class SimpleDictionary
{
    private HashMap<String, String> values;
    public SimpleDictionary()
    {
        this.values = new HashMap<>(); 
    }
    public void add(String word1, String word2)
    {
        this.values.put(word1, word2); 
    }
    public String translate(String check)
    {
        if (!(this.values.containsKey(check)))
        {
            return "Word " + check + " was not found"; 
        }
        return this.values.get(check); 
    }
    public static void main(String[] args) {
        
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");
        
        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));

    }
}

class TextUI
{
    private Scanner scanner; 
    private SimpleDictionary simple;

    public TextUI(Scanner scanner, SimpleDictionary simple)
    {
        this.scanner = scanner;
        this.simple = simple; 
    }
    public void start()
    {
        while(true)
        {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end"))
            {
                System.out.println("Bye bye!");
                break; 
            }
            else if (command.equals("add"))
            {
                System.out.print("Word: ");
                String word = scanner.nextLine(); 
                System.out.print("Translation: ");
                String trans = scanner.nextLine(); 
                simple.add(word, trans);
            }
            else if (command.equals("search"))
            {
                System.out.print("To be translated: ");
                String translate = scanner.nextLine(); 
                System.out.println(simple.translate(translate));
               
            }
            else
            {
                System.out.println("Unknown command");
            }

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
SimpleDictionary dictionary = new SimpleDictionary();

TextUI textUI = new TextUI(scanner, dictionary);
textUI.start();
System.out.println(dictionary.translate("pike"));
    }
}