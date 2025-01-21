import java.nio.file.Paths;
import java.util.*;
class Statistics
{
    private String home_team;
    private String visiting_team;
    private String home_team_points;
    private String visiting_team_points; 

    public Statistics(String home_team,String visiting_team,String home_team_points,String visiting_team_points)
    {
        this.home_team = home_team;
        this.visiting_team = visiting_team;
        this.home_team_points = home_team_points;
        this.visiting_team_points = visiting_team_points; 
    }

    public String gethome_team()
    {
        return home_team; 
    }

    public String getvisit_team()
    {
        return visiting_team; 
    }

    public String gethome_point()
    {
        return home_team_points;
    }
    public String getvisit_point()
    {
        return visiting_team_points; 
    }
}

public class New3 {
    public static ArrayList<Statistics> getData(String file) {
        

        ArrayList<Statistics> values = new ArrayList<>(); 
        try ( Scanner scanner = new Scanner(Paths.get(file));){
            while (scanner.hasNextLine())
            {
                String content = scanner.nextLine().trim(); 
                String[] val = content.split(",");
                values.add(new Statistics(val[0], val[1], val[2], val[3]));
            }


        }
        catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        return values;
    }

        public static void main(String[] args)
        {
            int game_count = 0; 
            int win = 0;
            int loss = 0; 
            Scanner scan = new Scanner(System.in); 
       
        System.out.println("File: ");
        String data = scan.nextLine(); 
        System.out.println("Team: ");
        String data1 = scan.nextLine();
        ArrayList<Statistics> values = getData(data);
        for (Statistics val6 : values)
        {
            if (data1.equals(val6.gethome_team()))
            {
                game_count += 1; 
                if(Integer.valueOf(val6.gethome_point()) > Integer.valueOf(val6.getvisit_point()))
                {
                    win += 1;
                }
                else if(Integer.valueOf(val6.gethome_point()) < Integer.valueOf(val6.getvisit_point()))
                {
                    loss += 1;
                }
                else
                {
                    continue; 
                }
            }

            if (data1.equals(val6.getvisit_team()))
            {
                game_count += 1;
                if(Integer.valueOf(val6.gethome_point()) < Integer.valueOf(val6.getvisit_point()))
                {
                    win += 1;
                }
                else if(Integer.valueOf(val6.gethome_point()) > Integer.valueOf(val6.getvisit_point()))
                {
                    loss += 1;
                }
                else
                {
                    continue; 
                }
            }

            
        }
        System.out.println("Games: "+ game_count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        }
    
}
