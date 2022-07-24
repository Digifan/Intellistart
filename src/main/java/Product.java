

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Product {

    //int id;
    String name;
    double price;

    public static Product addNewProduct(String nameOfProduct, double priceOfProduct) {

        Product newProduct = new Product();
        newProduct.setName(nameOfProduct);
        newProduct.setPrice(priceOfProduct);
        //newProduct.setId(newProduct.hashCode());
        return newProduct;
    }
}
