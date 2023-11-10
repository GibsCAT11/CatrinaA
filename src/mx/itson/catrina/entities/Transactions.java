package mx.itson.catrina.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mx.itson.catrina.enums.TipoMovimiento;

/**
 * La clase `Transactions` representa una transacción financiera y contiene información relacionada.
 * Se utiliza para inicializar variables y realizar operaciones relacionadas con transacciones.
 * Implementa la interfaz Comparable para permitir la comparación y ordenación de transacciones.
 * 
 * @author GibsCAT11
 */
public class Transactions implements Comparable<Transactions> {
    
    // Variables de entidad que representan lo que son los datos de la transacción
    private Date date; 
    private String description;
    private float amount;
    private TipoMovimiento type; 
    private String fechaOperacion;
    private String descripcionOperacion;
    private float deposito; 
    private float retiro; //
    private float subtotal; 

    /**
     * Obtiene la fecha de la operación en formato de cadena.
     * @return Fecha de la operación en formato de cadena.
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Establece la fecha de la operación en formato de cadena.
     * @param fechaOperacion Fecha de la operación a establecer.
     */
    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    /**
     * Obtiene la descripción detallada de la operación.
     * @return Descripción detallada de la operación.
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Establece la descripción detallada de la operación.
     * @param descripcionOperacion Descripción detallada de la operación a establecer.
     */
    public void setDescripcionOperacion(String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    /**
     * Obtiene el monto depositado.
     * @return Monto depositado.
     */
    public float getDeposito() {
        return deposito;
    }

    /**
     * Establece el monto depositado.
     * @param deposito Monto depositado a establecer.
     */
    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    /**
     * Obtiene el monto retirado.
     * @return Monto retirado.
     */
    public float getRetiro() {
        return retiro;
    }

    /**
     * Establece el monto retirado.
     * @param retiro Monto retirado a establecer.
     */
    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    /**
     * Obtiene el subtotal de la transacción.
     * @return Subtotal de la transacción.
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * Establece el subtotal de la transacción.
     * @param subtotal Subtotal de la transacción a establecer.
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Obtiene la fecha de la transacción.
     * @return Fecha de la transacción.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Establece la fecha de la transacción.
     * @param date Fecha de la transacción a establecer.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Obtiene la descripción de la transacción.
     * @return Descripción de la transacción.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la transacción.
     * @param description Descripción de la transacción a establecer.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el monto de la transacción.
     * @return Monto de la transacción.
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Establece el monto de la transacción.
     * @param amount Monto de la transacción a establecer.
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * Obtiene el tipo de movimiento de la transacción.
     * @return Tipo de movimiento de la transacción.
     */
    public TipoMovimiento getType() {
        return type;
    }

    /**
     * Establece el tipo de movimiento de la transacción.
     * @param type Tipo de movimiento de la transacción a establecer.
     */
    public void setType(TipoMovimiento type) {
        this.type = type;
    }

    /**
     * Método de comparación utilizado para ordenar las transacciones por fecha.
     * @param o Transacción a comparar.
     * @return Valor negativo si esta transacción es anterior, valor positivo si es posterior, 0 si son iguales.
     */
    @Override
    public int compareTo(Transactions o) {
        DateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy");
        String a = formato3.format(this.getDate());
        String b = formato3.format(o.getDate());
        return a.compareTo(b);
    }
    
}
