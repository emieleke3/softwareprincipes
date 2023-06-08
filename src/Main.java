public class Main {
    public static void main(String[] args) {
        Vendor vendor = new Vendor("jan");
        Product product = new Product("red bull", 12.00);

        vendor.addProduct(product);
    }


}