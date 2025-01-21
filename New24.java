import java.util.*; 
class Abbreviations
{
    private HashMap<String,String> abbreviate; 
    public Abbreviations()
    {
        this.abbreviate = new HashMap<>(); 
    }
    public static String sanitizeString(String value)
    {
        if (value == null)
        {
            return "";
        }
        value = value.toLowerCase(); 
        return value.trim(); 
    }

    public void addAbbreviation(String abbreviation, String explanation)
    {
        sanitizeString(abbreviation); 
        this.abbreviate.put(abbreviation,explanation); 
    }

    public boolean hasAbbreviation(String abbreviation)
    {
        if(this.abbreviate.containsKey(abbreviation))
        {
            return true; 
        }
        return false; 
    }
    public String findExplanationFor(String abbreviation)
    {
        
            return this.abbreviate.get(abbreviation);
    }

    public static void main(String[] args) {
        
        Abbreviations abbreviations = new Abbreviations();
abbreviations.addAbbreviation("e.g.", "for example");
abbreviations.addAbbreviation("etc.", "and so on");
abbreviations.addAbbreviation("i.e.", "more precisely");

String text = "e.g. i.e. etc. lol ezc";

for (String part: text.split(" ")) {
    if(abbreviations.hasAbbreviation(part)) {
        part = abbreviations.findExplanationFor(part);
    }

    System.out.print(part);
    System.out.print(" ");
}

System.out.println();
    }

}