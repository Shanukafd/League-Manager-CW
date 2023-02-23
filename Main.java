import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static LeagueManager leagueManager = new PremierLeagueManager();

    private static void addClub(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter club name : ");
        String clubName = scanner.nextLine();

        System.out.println("Enter club location : ");
        String clubLocation = scanner.nextLine();

        System.out.println("Enter manager name : ");
        String managerName = scanner.nextLine();

        System.out.println("Enter club registration number : ");
        int regNo = scanner.nextInt();

        System.out.println("Enter number of wins by the club : ");
        int wins = scanner.nextInt();

        System.out.println("Enter number of defeats the club has : ");
        int defeats = scanner.nextInt();

        System.out.println("Enter number of draws the club has : ");
        int draws = scanner.nextInt();

        System.out.println("Enter number of goals the club has : ");
        int goals = scanner.nextInt();

        System.out.println("Enter number of points the club has : ");
        int points = scanner.nextInt();

        System.out.println("Enter number of matches the club has played : ");
        int matches = scanner.nextInt();

        FootballClub footballClub = new FootballClub(clubName,clubLocation,managerName,regNo,wins,draws,defeats,goals,points,matches);
        leagueManager.addClub(footballClub);



    }
    private static void deleteClub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the registration number of the club : ");
        int regNo = scanner.nextInt();
        leagueManager.deleteClub(regNo);


    }
    private static void viewStats(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter club name : ");
        String clubName = scanner.nextLine();
        System.out.println("Enter the registration number of the club : ");
        int regNo = scanner.nextInt();
        leagueManager.viewStats(clubName,regNo);


    }
    private static void viewTable(){
        System.out.println();
        leagueManager.viewTable();

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("Enter 'A' to add a new football club.");
            System.out.println("Enter 'D' to delete an existing club. ");
            System.out.println("Enter 'V' to view the statistics of a club.");
            System.out.println("Enter 'T' to view the Premier League table. ");
            System.out.println("-----------------------------------------------");


            System.out.println("Enter your option : ");
            String option = scan.next();

            switch (option) {
                case "A":
                case "a":
                    addClub();
                    break;
                case "D":
                case "d":
                    deleteClub();
                    break;
                case "V":
                case "v":
                    viewStats();
                    break;
                case "T":
                case "t":
                    viewTable();
                    break;
                default:
                    System.out.println("Enter a valid value ! ");
                    break;


            }

        }


    }

}
