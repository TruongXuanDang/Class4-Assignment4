public class Product {
    int Id;
    String Name;
    int Price;
    int Amount;

    double Decrease;

    public Product(int id, String name, int price, int amount) {
        Id = id;
        Name = name;
        Price = price;
        Amount = amount;

    }

    public Product(int id, String name, int price, int amount,double decrease){
        Id = id;
        Name = name;
        Price = price;
        Amount = amount;
        Decrease =decrease;
    }

    public int checkInventory(Product product){
        int inventoryAmount;
        inventoryAmount=product.Amount;
        return inventoryAmount;
    }
}
