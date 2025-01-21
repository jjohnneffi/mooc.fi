public class New6{

    private final int euros;
    private final int cents;

    public New6(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
   public New6 plus(New6 addition)
   {
    int add_euros = this.euros + addition.euros;
    int add_cents = this.cents  + addition.cents;
    while(add_cents >= 100)
    {
        add_cents-= 100; 
        add_euros += 1;
    }
    New6 value = new New6(add_euros, add_cents); 
    return value; 
   }

   public boolean lessThan(New6 compared)
   {
    if(this.euros < compared.euros){
        return true;
    }
    if(this.euros == compared.euros)
    {
        if (this.cents < compared.cents)
        {
            return true; 
        }
    }
    return false; 

    
   }
   public New6 minus(New6 decreaser)
   {
    int add_euros = this.euros - decreaser.euros;
    int add_cents = this.cents  - decreaser.cents;
    if (add_cents < 0)
    {
        add_euros -= 1;
        add_cents += 100; 
    }
    if (add_euros < 0)
    {
        add_euros = 0;
        add_cents = 0;
    }
    return new New6(add_euros, add_cents); 
    
   }
   
 
   public static void main(String[] args) {
  
    New6 a = new New6(10, 27);
    New6 b = new New6(3, 50);
    
    New6 c = a.minus(b);
    
    System.out.println(a);  // 10.00e
    System.out.println(b);  // 3.50e
    System.out.println(c);  // 6.50e
    
    c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
    //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
    
    
    System.out.println(a);  // 10.00e
    System.out.println(b);  // 3.50e
    System.out.println(c);  // 0.00e
    
   }

}