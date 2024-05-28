package Management;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Supplier extends Management{
    private static final HashMap<String, Supplier> suppliers = new HashMap<>();
    private String name;
    private String nit;
    private String address;
    private String email;

    // el bloque estatico permite inicializar datos
    static {
        suppliers.put("00001", new Supplier("Proveedor1", "00001", "Direccion1", "correo1@example.com"));
        suppliers.put("00002", new Supplier("Proveedor2", "00002", "Direccion2", "correo2@example.com"));
        suppliers.put("00003", new Supplier("Proveedor3", "00003", "Direccion3", "correo3@example.com"));
        suppliers.put("00004", new Supplier("Proveedor4", "00004", "Direccion4", "correo4@example.com"));
        suppliers.put("00005", new Supplier("Proveedor5", "00005", "Direccion5", "correo5@example.com"));

    }

    public Supplier() {}

    public Supplier(String name, String nit, String address, String email) {
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.email = email;

        suppliers.put(nit, this);
    }

    @Override
    public void updateInfo(String key){
        if (suppliers.containsKey(key)){
            suppliers.replace(key, new Supplier());
            System.out.println("|- El proveedor se ha actualizado.");
        }
    }

    @Override
    public void deleteInfo(String key) {
        if (suppliers.containsKey(key)){
            suppliers.remove(key);
            System.out.println("|- Proveedor eliminado.");
        }else{
            System.out.println("|- El NIT no pertenece a ningún proveedor.");
        }
    }

    @Override
   public void showInfo() {
        /*Los datos se imprimen en desorden debido a que se guardan calculando un hash y se imprimen como se
         guardaron, por ello se usa TreeMap quees una implementación de SortedMap que ordena automáticamente las claves
          en orden natural
        */
        Map<String, Supplier> suppliersTreeMap = new TreeMap<>(suppliers);
        System.out.println("|- Este es el listado de proveedores del sistema: ");

        for (Map.Entry<String, Supplier> entry : suppliersTreeMap.entrySet()) {
            Supplier value = entry.getValue();
            System.out.println(value);
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
        return  "|------------------------|"+"\n"+
                "|- Nombre del proveedor: " + name+"\n"+
                "|- NIT: " + nit +"\n"+
                "|- Direccion: " + address +"\n"+
                "|- Correo: " + email +"\n"+
                "|------------------------|";
    }
}

