public class DomesticTour extends Tour {
    private boolean privateTour;
    private boolean honeymoonTour;
    private String state;

    protected DomesticTour(){
        this(0,false,false,null,null,"");
    }

    protected DomesticTour(int durationInDays, boolean privateTour, boolean honeymoonTour, NormalPrice normalPrice, PeakPrice peakPrice, String state) {
        super(durationInDays, normalPrice, peakPrice);
        this.privateTour = privateTour;
        this.honeymoonTour = honeymoonTour;
        this.state = state;
    }

    public boolean isPrivateTour() {
        return privateTour;
    }

    public boolean isHoneymoonTour() {
        return honeymoonTour;
    }

    public void setPrivateTour(boolean privateTour) {
        this.privateTour = privateTour;
    }

    public void setHoneymoonTour(boolean honeymoonTour) {
        this.honeymoonTour = honeymoonTour;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "\n----------Domestic Tour----------" + "\nState: " + state + "\nPrivate Tour: " + (privateTour? "Yes":"No") +  "\nHoneymoon Tour: " + (honeymoonTour? "Yes":"No") + super.toString() + super.getNormalPrice().getType() + super.getNormalPrice().toString() + super.getPeakPrice().getType() + super.getPeakPrice().toString();
    }
}
