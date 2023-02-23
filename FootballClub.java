
public class FootballClub extends SportsClub  {
    private int registrationNo;
    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;
    private int numberOfGoals;
    private int numberOfPoints;
    private int numberOfMatches;

    public FootballClub(){

    }

    public FootballClub( String clubName, String location,String manager,int registrationNo, int noOfWins, int noOfDraws, int noOfDefeats, int noOfGoals, int noOfPoints, int noOfMatches){
        super(clubName,location,manager);
        this.registrationNo = registrationNo;
        this.numberOfWins = noOfWins;
        this.numberOfDraws = noOfDraws;
        this.numberOfDefeats = noOfDefeats;
        this.numberOfGoals = noOfGoals;
        this.numberOfPoints = noOfPoints;
        this.numberOfMatches = noOfMatches;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public void setNumberOfDraws(int numberOfDraws) {
        this.numberOfDraws = numberOfDraws;
    }

    public int getNumberOfDefeats() {
        return numberOfDefeats;
    }

    public void setNumberOfDefeats(int numberOfDefeats) {
        this.numberOfDefeats = numberOfDefeats;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public String toString(){
        return "Name of the club :"+ super.getClubName() + "| club located at : " + super.getLocation() + "| club manager : " + super.getManager() + "| No of wins : " + numberOfWins + "| No of draws : " + numberOfDraws + "| No of defeats : " + numberOfDefeats +
                " No of Goals : " + numberOfGoals + "| No of points : " + numberOfPoints + "| No of matches : " + numberOfMatches;
    }


}
