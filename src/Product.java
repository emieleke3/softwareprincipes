public class Product {
    private String productname;
    private double price;
    public Product(String productname, double price) {
        this.productname = productname;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductname() {
        return productname;
    }
}
