package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 * La clase `Account` representa una cuenta bancaria y contiene información relacionada.
 * Se utiliza para inicializar variables y realizar operaciones relacionadas con cuentas.
 * 
 * @author GibsCAT11
 */
public class Account {
    
    // Variables de instancia que representan información de la cuenta
    private String product;
    private String account;
    private String clabe;
    private String currency;
    private Customer customer; 
    private List<Transactions> transactions;

   
    /**
     * Deserializa un objeto `Account` a partir de una cadena JSON.
     * 
     * @param json Cadena JSON que representa un objeto `Account`.
     * @return Objeto `Account` deserializado.
     */
    public Account deserializar(String json){
        Account deserializado = new Account();
        try{
            // Utiliza la biblioteca Gson para convertir la cadena JSON en un objeto Account
            deserializado = new Gson().fromJson(json, Account.class);
        }catch(Exception ex){
            // Maneja cualquier excepción que pueda ocurrir durante la deserialización
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
        return deserializado;
    }

    /**
     * Obtiene el tipo de producto asociado a la cuenta.
     * @return Tipo de producto de la cuenta.
     */
    public String getProduct() {
        return product;
    }

    /**
     * Establece el tipo de producto asociado a la cuenta.
     * @param product Tipo de producto a establecer.
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Obtiene el número de cuenta.
     * @return Número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    /**
     * Establece el número de cuenta.
     * @param account Número de cuenta a establecer.
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Obtiene el número de CLABE de la cuenta.
     * @return Número de CLABE de la cuenta.
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * Establece el número de CLABE de la cuenta.
     * @param clabe Número de CLABE a establecer.
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * Obtiene la moneda de la cuenta.
     * @return Moneda de la cuenta.
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Establece la moneda de la cuenta.
     * @param currency Moneda a establecer.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Obtiene el cliente asociado a la cuenta.
     * @return Cliente asociado a la cuenta.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Establece el cliente asociado a la cuenta.
     * @param customer Cliente a establecer.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Obtiene la lista de transacciones de la cuenta.
     * @return Lista de transacciones de la cuenta.
     */
    public List<Transactions> getTransactions() {
        return transactions;
    }

    /**
     * Establece la lista de transacciones de la cuenta.
     * @param transactions Lista de transacciones a establecer.
     */
    public void setMovimientos(List<Transactions> transactions) {
        this.transactions = transactions;
    }
    
}
