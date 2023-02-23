import java.util.Objects;

public class SportsClub  {
    private String clubName;
    private String location;
    private String manager;

    public SportsClub(){

    }

    public SportsClub(String clubName, String location, String manager){
        this.clubName = clubName;
        this.location = location;
        this.manager = manager;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String toString(){
        return "Club Name : " + clubName + " location " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsClub that = (SportsClub) o;
        return clubName.equals(that.clubName) &&
                location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName , location);
    }

}
