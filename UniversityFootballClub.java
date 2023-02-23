public class UniversityFootballClub extends FootballClub  {
    private String universityName;

    public UniversityFootballClub(){

    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String toString(){
        return "University Name : " + universityName;
    }
}
