class A
{
    public void a()
    {
        System.out.println("A");
    }
}
class B extends A
{
    protected void b()
    {
        System.out.println("B");
    }
}
class C extends B{
    public void c()
    {
        System.out.println("C");
    }
}

class D
{
    public static void main(String[] args) {
       C c = new C(); 
       c.a(); 
       c.b(); 
       c.c(); 

        // A.a();
        // B.b();
        // C.c(); 

    }
}