public class Shampoo extends Product{
    private Detergent detergent;

    public Shampoo(double normalPrice, double discountPrice, int capacity, String producer, String name, ProductType productType, Detergent detergent) {
        super(normalPrice, discountPrice, capacity, producer, name, productType);
        this.detergent = detergent;
    }

    public Detergent getDetergent() {
        return detergent;
    }

    public void setDetergent(Detergent detergent) {
        this.detergent = detergent;
    }
}
