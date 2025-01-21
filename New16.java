import java.util.*; 
class GradeRegister
{
    private ArrayList<Integer> values; 
    int[] grades = {0,0,0,0,0,0}; 
    int count; 
    int grade;
    int point;  
    public GradeRegister()
    {
        this.values = new ArrayList<>();
    }
    public void addGradeBasedOnPoints(int val)
    {
        this.values.add(val); 
    }
    public double averageOfGrades()
    {
        count = 0; 
        if(values.size() == 0)
        {
            return -1; 
        }
        for (Integer marks : values)
        {
           
            if (marks < 50)
            {
                count += 0;
                grades[5] += 1;
            }
            else if (marks < 60)
            {
                count += 1;
                grades[4] += 1;
            }
            else if (marks < 70)
            {
                count += 2;
                grades[3] += 1;
            }
            else if (marks < 80)
            {
                count += 3;
                grades[2] += 1;
            }
            else if (marks < 90)
            {
                count += 4; 
                grades[1] += 1; 
            }
            else 
            {
                count += 5; 
                grades[0] += 1;
            }
        }
        return (double) count / (double) values.size(); 
    }
    public int[] grade_points()
    {
        return grades; 
    }

    public double averageOfPoints()
    {
        if (values.size() == 0)
        {
            return -1;
        }
        for (Integer marks : values)
        {
            point += marks; 
        }
        return (double) point / (double) values.size(); 
    }
    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
register.addGradeBasedOnPoints(93);
register.addGradeBasedOnPoints(91);
register.addGradeBasedOnPoints(92);
register.addGradeBasedOnPoints(88);

System.out.println(register.averageOfGrades());
System.out.println(register.averageOfPoints());
    }
}

class UserInterface
{
    private ArrayList<Integer> value; 
    private Scanner scan;
    private GradeRegister grade_access; 
    int count = 5; 
    public UserInterface(GradeRegister grade_access)
    {
        this.value = new ArrayList<>();
        this.grade_access = grade_access;
        this.scan = new Scanner(System.in); 
    }
    public void display()
    {
        for (Integer data : grade_access.grade_points())
        {
            System.out.print(count + ": "); 
            for(int i=1; i<=data; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            count -= 1; 
        }
    }
    public void add()
    {
        while (true)
        {
            System.out.print("Points: ");
            String val = scan.nextLine(); 
            if(val.equals(""))
            {
                break; 
            }
            grade_access.addGradeBasedOnPoints(Integer.valueOf(val));
            
        }
        grade_access.averageOfGrades();
        display();
        System.out.println("The average of points:");
        System.out.println(grade_access.averageOfPoints());
        System.out.println("The average of grades:");
        System.out.println(grade_access.averageOfGrades());
       
    }

    public static void main(String[] args) {
        GradeRegister grade = new GradeRegister(); 
        UserInterface ui = new UserInterface(grade); 
        ui.add();
    }
}