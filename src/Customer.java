import java.util.ArrayList;

public class Customer extends Person implements UserInterface, CustomerInterface  {

    private ArrayList<Product> productList;
    public Customer(String name) {
        super(name);
    }

    @Override
    public void viewProduct(String name) {
        for (Product product: productList) {
            if (name.equals(product.getProductname()))
            {
                System.out.println(product.getProductname() + product.getPrice());
            } else {
                System.out.println("Thats product is not in the list");
            }
        }
    }

    @Override
    public void addToCard(Product product) {
        productList.add(product);
    }

    @Override
    public void placeOrder() {
        // ??
    }

    @Override
    public void login() {
        System.out.println("User has been logged in!");
    }

    @Override
    public void logout() {
        System.out.println("User has been logged out!");
    }
}
