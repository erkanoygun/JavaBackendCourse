import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateFixture {
    List<String> rounds = new ArrayList<>();
    Random rand = new Random();

    public List<String> GenerateMatch(List<String> teams){
        String homeTeam;
        String awayTeam;

        if(teams.size() %  2 != 0){
            teams.add("Buy");
        }

        while (true)
        {
            do {
                homeTeam = teams.get((rand.nextInt(teams.size())));
                awayTeam = teams.get((rand.nextInt(teams.size())));
            } while (homeTeam == awayTeam);

            if(!rounds.contains(homeTeam + " - " + awayTeam)){
                rounds.add(homeTeam + " - " + awayTeam);
            }
            else if(!rounds.contains(awayTeam + " - " + homeTeam)){
                rounds.add(awayTeam + " - " + homeTeam);
            }
            else{
                if(rounds.size() == (teams.size() * (teams.size() - 1)))
                    break;
            }

        }

        return rounds;
    }

    public void ShowMatches(List<String> rounds, int teamsSize){
        int counter = 1;
        for (int i=0; i<rounds.size(); i++){
            if(i % (teamsSize/2) == 0){
                System.out.println(counter +". Round");
                counter++;
            }

            System.out.println(rounds.get(i));
        }
    }
}
