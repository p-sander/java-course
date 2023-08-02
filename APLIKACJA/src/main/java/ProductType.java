public enum ProductType {
    SHAMPOO("Shampoo"),
    CONDITIONER("Conditioner"),
    OIL("oil"),
    SERUM("serum"),
    STYLING("stylizator"),
    HAIRSKINSERUM("hair serum");
    private String description;

    ProductType(String description) {
        this.description = description;
    }

    ProductType() {

    }
}
