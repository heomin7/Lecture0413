package majorleague2.model;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class Park {
    private String parkName;
    private String parkAlias;
    private String city;
    private String state;
    private String country;

    public Park(){

    }

    public Park(String parkName, String parkAlias, String city, String state, String country) {
        this.parkName = parkName;
        this.parkAlias = parkAlias;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkAlias() {
        return parkAlias;
    }

    public void setParkAlias(String parkAlias) {
        this.parkAlias = parkAlias;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName='" + parkName + '\'' +
                ", parkAlias='" + parkAlias + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
