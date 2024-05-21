package Management;

import java.util.HashMap;
import java.util.Map;

public class Supplier extends Management{
    private static final HashMap<String, Supplier> suppliers = new HashMap<>();
    private String name;
    private String nit;
    private String address;
    private String email;

    // el bloque estatico permite inicializar datos
    static {
        suppliers.put("Proveedor1", new Supplier("Proveedor1", "123456", "Dirección1", "correo1@example.com"));
        suppliers.put("Proveedor2", new Supplier("Proveedor2", "789012", "Dirección2", "correo2@example.com"));
        suppliers.put("Proveedor3", new Supplier("Proveedor3", "415972", "Dirección3", "correo3@example.com"));
        suppliers.put("Proveedor4", new Supplier("Proveedor4", "784578", "Dirección4", "correo4@example.com"));
    }

    public Supplier() {}

    public Supplier(String name, String nit, String address, String email) {
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.email = email;

        suppliers.put(name, this);
    }

    @Override
    void deleteInfo() {
        //Buscar en el hashmap por clave y borrarlo.
    }

    @Override
   public void showInfo() {
        for (Map.Entry<String, Supplier> entry : suppliers.entrySet()) {
            String key = entry.getKey();
            Supplier value = entry.getValue();
            System.out.println("Proveedor: " + key + ", Datos del proveedor: " + value);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\n"+"|------------------------|"+"\n"+
                "|- Nombre del proveedor: " + name+"\n"+
                "|- NIT: " + nit +"\n"+
                "|- Direccion: " + address +"\n"+
                "|- Correo: " + email +"\n"+
                "|------------------------|";
    }
}

