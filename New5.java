public class New5 {
    private int day;
    private int month;
    private int year;

    public New5(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance(int howManyDays)
    {
        while(howManyDays>0)
        {
            this.day+=1;
            howManyDays-=1;
            if(this.day>30)
            {
                this.day=1;
                this.month+=1;
            }
            if(this.month>12)
            {
                this.month=1;
                this.year+=1;
            }
        }
    }

    public New5 afterNumberOfDays(int days)
    {
        int newday = this.day;
        int newmonth = this.month;
        int newyear = this.year; 
       
        while(days>0)
        {
            newday+=1;
            days-=1;
            if(newday>30)
            {
                newday=1;
                newmonth+=1;
            }
            if(newmonth>12)
            {
                newmonth=1;
                newyear+=1;
            }
        }
        New5 newsimple = new New5(newday,  newmonth, newyear);
        return newsimple; 
    }

    public boolean before(New5 compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

       return false;  
    }

    public static void main(String[] args) {
        New5 date = new New5(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
    
        New5 newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
    
            week = week + 1;
        }
    
    
        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        //    System.out.println("Try " + date.afterNumberOfDays(790));
    }
} 