public class Product {
    //atributos,
    private int id;
    private String name;
    private double price;
    private int quantity;



    //metodo constructor
    public Product (int id,String name,double price ,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    //getters y setters para basicamente modificar los atributos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price= price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //metodo pa datos quemados
    public static void addProduct() {
        Product nuevoProduct = new Product(562,"calzoncillos de cr7 prime",10.000,98);
    }
}
