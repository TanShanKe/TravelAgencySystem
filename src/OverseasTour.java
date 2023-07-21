import java.util.HashMap;
import java.util.Map;

public class OverseasTour extends Tour {
    private boolean privateTour;
    private boolean joinedTour;
    private String country;
    private String state;

    protected OverseasTour(){
        this(0,false,false,null,null,"","");
    }

    protected OverseasTour(int durationInDays, boolean privateTour, boolean joinedTour, NormalPrice normalPrice, PeakPrice peakPrice,String country, String state) {
        super(durationInDays, normalPrice, peakPrice);
        this.privateTour = privateTour;
        this.joinedTour = joinedTour;
        this.country = country;
        this.state = state;
    }

    public boolean isPrivateTour() {
        return privateTour;
    }

    public boolean isJoinedTour() {
        return joinedTour;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public void setPrivateTour(boolean privateTour) {
        this.privateTour = privateTour;
    }

    public void setJoinedTour(boolean joinedTour) {
        this.joinedTour = joinedTour;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "\n----------Overseas Tour----------"+ "\nCountry: " + country + "\nState: " + state + "\nPrivate Tour: " + (privateTour ? "Yes" : "No") + "\nJoined Tour: " + (joinedTour ? "Yes" : "No") + super.toString() + super.getNormalPrice().getType() + super.getNormalPrice().toString() + super.getPeakPrice().getType() + super.getPeakPrice().toString();

    }
}


