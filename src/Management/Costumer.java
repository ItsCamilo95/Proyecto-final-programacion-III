package Management;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Costumer extends Management{

    private static final HashMap<String, Costumer> costumers = new HashMap<>();
    private String id;
    private String name;
    private String address;
    private String contact;

    Scanner input = new Scanner(System.in);
    Scanner numericalInput = new Scanner(System.in);

    static{
        costumers.put("00001", new Costumer("00001", "Cliente1", "Direccion1", "3248758912"));
        costumers.put("00002", new Costumer("00002", "Cliente2", "Direccion2", "3218972332"));
        costumers.put("00003", new Costumer("00003", "Cliente3", "Direccion3", "3487596124"));
        costumers.put("00004", new Costumer("00004", "Cliente4", "Direccion4", "3146885921"));
        costumers.put("00005", new Costumer("00005", "Cliente5", "Direccion5", "3198745978"));
    }

    public Costumer(){}

    public Costumer(String id, String name, String address, String contact){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;

        // la palabra reservada this, en este caso, guardará toda la instancia de costumer.
        costumers.put(id, this);
    }

    @Override
    public void updateInfo(String key){
            if (costumers.containsKey(key)){
                boolean run = true;
                while(run) {
                    System.out.println("|--------------------|");
                    System.out.println("|- Actualizar datos de: "+key);
                    System.out.println("|- ¿Qué dato desea actualizar?");
                    System.out.println("|- 1.Nombre.");
                    System.out.println("|- 2.Dirección.");
                    System.out.println("|- 3.Contacto.");
                    System.out.println("|- 4. Volver.");
                    byte opcion = numericalInput.nextByte();

                    switch (opcion){
                        case 1:{
                            System.out.println("|- Digite el nuevo nombre:");
                            String newName = input.nextLine();
                            costumers.get(key).setName(newName);
                            break;
                        }
                        case 2:{
                            System.out.println("|- Digite la nueva dirección:");
                            String newAddress = input.nextLine();
                            costumers.get(key).setAddress(newAddress);
                            break;
                        }
                        case 3:{
                            System.out.println("|- Digite el nuevo contacto:");
                            String newContact = input.nextLine();
                            costumers.get(key).setContact(newContact);
                            break;
                        }
                        case 4:{
                            run = false;
                            break;
                        }
                        default:{
                            System.out.println("|- Digite un número válido.");
                        }
                    }
                }
        }System.out.println("|- El id no se encuentra en el sistema.");
    }

    @Override
    public void deleteInfo(String key) {
        String message = costumers.containsKey(key) ? costumers.remove(key) + "|- Cliente eliminado" : "|- El id " +
                "no " +
                "pertenece a ningún cliente.";
        System.out.println(message);
    }

    @Override
    public void showInfo() {
        /*Los datos se imprimen en desorden debido a que se guardan calculando un hash y se imprimen como se
         guardaron, por ello se usa TreeMap quees una implementación de SortedMap que ordena automáticamente las claves
          en orden natural
        */
        Map<String, Costumer> costumersTreeMap = new TreeMap<>(costumers);
        System.out.println("|- Este es el listado de clientes del sistema: ");
        for (Map.Entry<String, Costumer> entry : costumersTreeMap.entrySet()){
            String key = entry.getKey();
            Costumer value = entry.getValue();
            System.out.println("|- Cliente: "+key+ ", datos del cliente: "+value);
        }
    }

    public void showCostumer(String key){
       if(costumers.containsKey(key)){
           System.out.println(costumers.get(key));
        }else{
           System.out.println("|- El id no existe en el sistema.");
       }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return  "\n"+"|------------------------|"+"\n"+
                "|- Nombre del cliente: " + name+"\n"+
                "|- Identificación: " + id +"\n"+
                "|- Dirección: " + address +"\n"+
                "|- Teléfono: " + contact +"\n"+
                "|------------------------|";
    }
}
