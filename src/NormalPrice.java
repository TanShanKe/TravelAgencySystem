public class NormalPrice extends Price {

    protected NormalPrice(){
        this(0,0,0,0);
    }
    protected NormalPrice(double adultPrice, double childWithExtraBedPrice, double childWithNoExtraBedPrice, double infantPrice) {
        super(adultPrice, childWithExtraBedPrice, childWithNoExtraBedPrice, infantPrice);
    }

    public String getType() {
        return "\n----------Normal Price----------";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

