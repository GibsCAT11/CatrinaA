package mx.itson.catrina.entities;

/**
 * La clase `Customer` representa un cliente y contiene información relacionada.
 * Se utiliza para inicializar variables y realizar operaciones relacionadas con clientes.
 * 
 * @author GibsCAT11
 */
public class Customer {
    
    // Variables de la entidad que representan información del cliente
    private String id;
    private String name; 
    private String address; 
    private String city; 
    private String rfc; 
    private String zip_code; 

    /**
     * Obtiene el ID del cliente.
     * @return ID del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     * @param id ID del cliente a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del cliente.
     * @param name Nombre del cliente a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la dirección del cliente.
     * @return Dirección del cliente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Establece la dirección del cliente.
     * @param address Dirección del cliente a establecer.
     */
    public void setDomicilio(String address) {
        this.address = address;
    }

    /**
     * Obtiene la ciudad del cliente.
     * @return Ciudad del cliente.
     */
    public String getCity() {
        return city;
    }

    /**
     * Establece la ciudad del cliente.
     * @param city Ciudad del cliente a establecer.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Obtiene el RFC del cliente.
     * @return RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del cliente.
     * @param rfc RFC del cliente a establecer.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el código postal del cliente.
     * @return Código postal del cliente.
     */
    public String getZip_code() {
        return zip_code;
    }

    /**
     * Establece el código postal del cliente.
     * @param zip_code Código postal del cliente a establecer.
     */
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
    
}
