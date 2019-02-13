public class Main {

    public static void main(String[] args) {

        Product product1=new Product(1,"candy",10000,5);
        Product product2=new Product(2,"cake",12000,2);
        Product product3=new Product(3,"book",9000,0,0.2);

        ProductList productList = new ProductList();
        productList.AddToList(product1);
        productList.AddToList(product2);
        productList.AddToList(product3);

        int Sum = 0;
        double SumOfMoney=0;


        for (Product product:productList.products) {
            System.out.println("Id san pham: "+product.Id);
            System.out.println("Ten san pham "+product.Name);
            SumOfMoney=product.Price*product.Amount*(1-product.Decrease);
            System.out.println("Tong tien: "+SumOfMoney);
            System.out.print("\n");
            Sum+=SumOfMoney;
        }
        System.out.println("Tong so tien: "+Sum);
    }
}
