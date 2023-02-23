
import java.util.ArrayList;

public class PremierLeagueManager implements LeagueManager{
    private ArrayList<FootballClub> premierLeague = new ArrayList<>();


    @Override
    public void addClub(FootballClub footballClub) {
        /*for (FootballClub fb : premierLeague){
            if (fb.getRegistrationNo() != footballClub.getRegistrationNo()){
                premierLeague.add(footballClub);
                System.out.println("Club successfully added.");
                break;
            }else{
                System.out.println("A club registered that number already exist.");
            }
        }*/
        /*for(int j = 0; j < premierLeague.size(); j ++){
            if (premierLeague.get(j).getRegistrationNo() != footballClub.getRegistrationNo()){
                premierLeague.add(footballClub);
                System.out.println("Club successfully added.");
            }else {
                System.out.println("A club registered that number already exist.");
            }
        }*/
        if(premierLeague.contains(footballClub)){
            System.out.println("Name already exist");       //check if there is already a club with same attributes
        }else{
            premierLeague.add(footballClub);
            System.out.println("Club successfully added.");
        }

    }

    @Override
    public void deleteClub(int regNo) {
        /*for(FootballClub fb : premierLeague){
            if(fb.getRegistrationNo() == regNo){
                premierLeague.remove(fb);
                System.out.println("Club successfully deleted ");
                break;
            }
            else{
                System.out.println("Registration number doesn't match.");
            }
        }*/



        for(int i = 0 ; i < premierLeague.size() ; i++){
            if (premierLeague.get(i).getRegistrationNo() == regNo){
                premierLeague.remove(i);
                System.out.println("Club successfully deleted ");
            }
            else{
                System.out.println("Registration number doesn't match.");
            }
        }

    }

    @Override
    public void viewStats(String clubName,int regNo) {
        for (FootballClub fb : premierLeague){
            if ((fb.getClubName().equals(clubName)) && (fb.getRegistrationNo() == regNo)){
                System.out.println(fb);
                break;
            }
        }

    }

    @Override
    public void viewTable() {
        for(FootballClub fb : premierLeague){
            System.out.println(fb);
        }


    }


}
