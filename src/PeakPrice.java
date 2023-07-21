public class PeakPrice extends Price {

    protected PeakPrice(){
        this(0,0,0,0);
    }
    protected PeakPrice(double adultPrice, double childWithExtraBedPrice, double childWithNoExtraBedPrice, double infantPrice) {
        super(adultPrice, childWithExtraBedPrice, childWithNoExtraBedPrice, infantPrice);
    }

    public String getType() {
        return "\n----------Peak Price----------";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
