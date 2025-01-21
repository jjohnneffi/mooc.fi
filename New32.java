class SuperClass
{
    protected String data;
    public SuperClass()
    {
        this("Hello World"); 
    }
    public SuperClass(String value)
    {
        this.data = value; 
    }
    public String toString()
    {
        return this.data; 
    }
   
}
class SubClass extends SuperClass
{
    public SubClass()
    {
        super("Hi World"); 
        
    }
    public String toString()
    {
        return super.toString() + " Hmm.."; 
    }
    public static void main(String[] args) {
        SuperClass sup = new SuperClass(); 
        SubClass sub = new SubClass(); 
        System.out.println(sup);
        System.out.println(sub);
    }
}
