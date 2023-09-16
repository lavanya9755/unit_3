public class Product {
    int ID;
    String name;
    int quantity;
    double price;
    public Product(int iD, String name, int quantity, double price) {
        ID = iD;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    
}
class Customer{
    String customer_id;
    Product details;
    public Customer(String customer_id, Product details) {
        this.customer_id = customer_id;
        this.details = details;
    }
    public void generateID(){
        int id=000;
        System.out.println("C"+(id++));
        
    }
}
