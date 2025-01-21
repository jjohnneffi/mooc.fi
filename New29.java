import java.util.*;

class DictionaryOfManyTranslations
{
    private HashMap<String, ArrayList<String>> diction; 
    public DictionaryOfManyTranslations()
    {
        this.diction = new HashMap<>(); 
    }
    public void add(String word, String translation)
    {
        this.diction.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> temp = this.diction.get(word); 
        temp.add(translation); 
    }

    public ArrayList<String> translate(String word)
    {
        ArrayList<String> translate = new ArrayList<>(); 
        translate = this.diction.get(word); 
        if(translate==null)
        {
            return new ArrayList<>(); 
        }
        return translate; 
        
    }
    public void remove(String word)
    {
        this.diction.remove(word); 
    }
    public static void main(String[] args) {
        
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
dictionary.add("lie", "maata");
dictionary.add("lie", "valehdella");

dictionary.add("bow", "jousi");
dictionary.add("bow", "kumartaa");

System.out.println(dictionary.translate("lie"));
dictionary.remove("bow");
System.out.println(dictionary.translate("bow"));
    }
}