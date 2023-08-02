public abstract class Product {
    private double normalPrice;
    private double discountPrice;
    private int capacity;
    private String producer;
    private String name;
    private ProductType productType;

    public Product(double normalPrice, double discountPrice, int capacity, String producer, String name, ProductType productType) {
        this.normalPrice = normalPrice;
        this.discountPrice = discountPrice;
        this.capacity = capacity;
        this.producer = producer;
        this.name = name;
        this.productType = productType;
    }

    double pricePer100ml(){
        double price = getDiscountPrice() / getCapacity();
        return price;
    }

    public double getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(double normalPrice) {
        this.normalPrice = normalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
