import java.util.ArrayList;

public class Vendor extends Person implements UserInterface, VendorInterface{
    public static ArrayList<Product> vendorProducts = new ArrayList<>();
    public Vendor(String name) {
        super(name);
    }

    public void kanker() {

    }
    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void addProduct(Product product) {
        vendorProducts.add(product);
    }

    @Override
    public void updateProduct(String name) {
        for (Product vendorproduct: vendorProducts) {
            if(vendorproduct.getProductname().equals(name)) {
                System.out.println(vendorproduct.getProductname());
                vendorProducts.indexOf(vendorproduct.getProductname());
            }
        }
    }

    @Override
    public void deleteProduct(Product product) {

    }
}
