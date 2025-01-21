import java.util.HashMap;

class nicknames
{
    public static void main(String[] args) {
        HashMap<String,String> nickname = new HashMap<>(); 
        nickname.put("matthew","matt");
        nickname.put("michael", "mix");
        nickname.put("arthur","artie"); 
        
        String name = nickname.get("matthew"); 
        System.out.println(name);
        System.out.println(nickname.get("michael"));
        String name1 = nickname.get("arthur"); 
        System.out.println(name1);
    }
}