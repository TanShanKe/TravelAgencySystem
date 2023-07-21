public class Tour {
    private int durationInDays;
    private NormalPrice normalPrice;
    private PeakPrice peakPrice;

    protected Tour(){
        this(0,null,null);
    }

    protected Tour(int durationInDays, NormalPrice normalPrice, PeakPrice peakPrice) {
        this.durationInDays = durationInDays;
        this.normalPrice = normalPrice;
        this.peakPrice = peakPrice;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public NormalPrice getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(NormalPrice normalPrice) {
        this.normalPrice = normalPrice;
    }

    public PeakPrice getPeakPrice() {
        return peakPrice;
    }

    public void setPeakPrice(PeakPrice peakPrice) {
        this.peakPrice = peakPrice;
    }

    public String toString(){
        return "\nDuration: " + getDurationInDays() + " days";
    }
}
