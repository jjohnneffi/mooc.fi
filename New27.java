class SimpleDate
{
    private int day; 
    private int month; 
    private int year; 
    public SimpleDate(int day, int month, int year)
    {
        this.day = day; 
        this.month = month; 
        this.year = year; 
    }

    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if (!(object instanceof SimpleDate))
        {
            return false; 
        }
        SimpleDate simple = (SimpleDate) object; 
        if(this.day == simple.day && this.month == simple.month && this.year == simple.year)
        {
            return true; 
        }
        return false; 
    }
    public int hashCode()
    {
        return(this.day + "." + this.month + "." + this.year).hashCode(); 
    }

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));
        System.out.println(d.equals(new SimpleDate(1,4,2005)));
    }
}