
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


@ToString
public class Market {
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Product> productsList = new ArrayList<>();
    public static HashMap <Integer, HashSet<Integer>> userWarehouse = new HashMap<>();
    public static HashMap <Integer, HashSet<Integer>> buyerList = new HashMap<>();

    public static void main(String[] args) {
        boolean stop = false;
        int userId, productId;
        while (!stop) {
            Utils.systemMenu();
            Scanner in = new Scanner(System.in);
            int selector = in.nextInt();

            switch (selector) {
                case 1 -> Utils.displayProductList(productsList);
                case 2 -> Utils.displayUserList(usersList);
                case 3 -> {
                    System.out.println("Please, input User ID and Product ID : ");
                    in = new Scanner(System.in);
                    userId = in.nextInt();
                    productId = in.nextInt();
                    if (usersList.get(userId).moneyAmount >= productsList.get(productId).price) {

                        usersList.get(userId).moneyAmount -= productsList.get(productId).price;
                        userWarehouse.get(userId).add( productId );
                        buyerList.get(productId).add( userId );
                        System.out.println("Success");
                       }
                        else {System.out.println("Insufficient money!");}
                    }
                case 4 -> {
                    System.out.print("Please, input User ID: ");
                    in = new Scanner(System.in);
                    userId = in.nextInt();
                    System.out.println(userWarehouse.get(userId).toString());   // Display list of user's products by user id;
                }
                case 5 -> {
                    System.out.print("Please, input Product ID: ");
                    in = new Scanner(System.in);
                    productId = in.nextInt();
                    System.out.println(buyerList.get(productId).toString());  // Display list of users that bought a product by product id
                }
                case 6 -> {
                    System.out.println("Please enter User's  First Name and Last Name");
                    in = new Scanner(System.in);
                    String fullName = in.nextLine();
                    if (fullName.equals("")) {System.out.println("Wrong input!"); break; }
                    String [] splitFullName = fullName.split(" ");
                    System.out.println("Please enter amount of money: ");
                    float moneyTotal = in.nextFloat();
                    usersList.add(User.addNewUser(splitFullName[0], splitFullName[1], moneyTotal)); // Add new user to the list
                }
                case 7 -> {
                    System.out.println("Please enter Product Name: ");
                    in = new Scanner(System.in);
                    String productName = in.nextLine();
                    if (productName.equals("")) {System.out.println("Wrong input!"); break; }
                    System.out.println("Please enter product price: ");
                    double productPrice = in.nextDouble();
                    productsList.add(Product.addNewProduct(productName, productPrice));     //Add new product to the list
                }
                case 0 -> {stop = true;
                in.close();}
            }
        }

    }
}
