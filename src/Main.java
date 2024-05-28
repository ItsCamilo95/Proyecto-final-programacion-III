import Management.Costumer;
import Management.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier proveedor = new Supplier();
        Costumer cliente = new Costumer();
        cliente.showCostumer("00001");
        cliente.updateInfo("00001");
        cliente.showCostumer("00001");
        cliente.showInfo();
    }
}