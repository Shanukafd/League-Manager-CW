public interface LeagueManager {
    void addClub(FootballClub footballClub);
    void deleteClub(int regNo);
    void viewStats(String clubName, int regNo);
    void viewTable();

}
