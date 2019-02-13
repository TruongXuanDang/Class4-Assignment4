import java.util.ArrayList;
import java.util.List;

public class ProductList {
    List<Product> products= new ArrayList<>();


    public void AddToList(Product product){
        if(product.checkInventory(product)>0){

            products.add(product);
        }
        else if(product.checkInventory(product)<=0){
            System.out.println("Out of product: "+product.Name);
            System.out.println();
        }
    }
}
