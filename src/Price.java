public abstract class Price {
    private double adultPrice;
    private double childWithExtraBedPrice;
    private double childWithNoExtraBedPrice;
    private double infantPrice;

    protected Price(){
        this(0,0,0,0);
    }

    protected Price(double adultPrice, double childWithExtraBedPrice, double childWithNoExtraBedPrice, double infantPrice) {
        this.adultPrice = adultPrice;
        this.childWithExtraBedPrice = childWithExtraBedPrice;
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
        this.infantPrice = infantPrice;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildWithExtraBedPrice() {
        return childWithExtraBedPrice;
    }

    public double getChildWithNoExtraBedPrice() {
        return childWithNoExtraBedPrice;
    }

    public double getInfantPrice() {
        return infantPrice;
    }

    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public void setChildWithExtraBedPrice(double childWithExtraBedPrice) {
        this.childWithExtraBedPrice = childWithExtraBedPrice;
    }

    public void setChildWithNoExtraBedPrice(double childWithNoExtraBedPrice) {
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
    }

    public void setInfantPrice(double infantPrice) {
        this.infantPrice = infantPrice;
    }

    public abstract String getType();

    public String toString(){
        return "\nAdult Price: RM" + adultPrice + "\nChild With Extra Bed Price: RM" + childWithExtraBedPrice + "\nChild With No Extra Bed Price: RM" + childWithNoExtraBedPrice + "\nInfant Price: RM" + infantPrice;
    }
}

