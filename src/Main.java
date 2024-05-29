import Management.Costumer;
import Management.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier proveedor = new Supplier();
        proveedor.showSupplier("00001");
        proveedor.updateInfo("00001");
        proveedor.showSupplier("00001");

    }
}