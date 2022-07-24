import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static void systemMenu() {
        System.out.println("Please, make your choice:");
        System.out.println("1 - Display all products list");
        System.out.println("2 - Display all users list");
        System.out.println("3 - Buy a product");
        System.out.println("4 - Display list of user's products by user id");
        System.out.println("5 - Display list of users that bought a product by product id");
        System.out.println("6 - Add new user");
        System.out.println("7 - Add new product");
        System.out.println("0 - Exit");

    }

    public static void displayUserList(HashMap <Integer, User> usersList) {
        for (Map.Entry<Integer, User> user : usersList.entrySet()) {
            System.out.println(user.toString());
        }
    }

    public static void displayProductList(HashMap <Integer, Product> productList) {
        for (Map.Entry<Integer, Product> product : productList.entrySet()) {
            System.out.println(product.toString());
        }
    }

}
