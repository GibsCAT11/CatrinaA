package mx.itson.catrina.business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.itson.catrina.entities.Transactions;

/**
 *
 * @author GibsCAT11
 */
public class Operacion {

    float totalEnero = 0;
    float totalFebrero = 0;
    float totalMarzo = 0;
    float totalAbril = 0;
    float totalMayo = 0;
    float totalJunio = 0;
    float totalJulio = 0;
    float totalAgosto = 0;
    float totalSeptiembre = 0;
    float totalOctubre = 0;
    float totalNoviembre = 0;

    /**
     * Aqui se hace todos los calculos y acomodos para su posterior impresion,
     * no devuelve nada, ya que todo se guarda en un ArrayList en la entidad
     * Cuenta
     *
     * @param mes Se recibe el mes con el que se van a hacer calculos
     * @param transactions se recibe el ArrayList para los calculos
     * @return Retorna el ArrayList de los movimientos para despues mostrarlos
     */
    public List<Transactions> obtenerMovimientos(String mes, List<Transactions> transactions/*, List<Transactions> auxiliar03*/) {

        DateFormat formato = new SimpleDateFormat("MM");
        DateFormat formato2 = new SimpleDateFormat("dd/MM/yy");

        List<Transactions> movimientosMes = new ArrayList<>();
        
        //método para ordenar de forma natural
        Collections.sort(transactions);

        totalEnero = 0;
        totalFebrero = 0;
        totalMarzo = 0;
        totalAbril = 0;
        totalMayo = 0;
        totalJunio = 0;
        totalJulio = 0;
        totalAgosto = 0;
        totalSeptiembre = 0;
        totalOctubre = 0;
        totalNoviembre = 0;

        for (Transactions m : transactions) {

            switch (formato.format(m.getDate())) {

                case "01" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalEnero += m.getAmount();

                        case RETIRO ->
                            totalEnero -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "02" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalFebrero += m.getAmount();

                        case RETIRO ->
                            totalFebrero -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "03" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalMarzo += m.getAmount();

                        case RETIRO ->
                            totalMarzo -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "04" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalAbril += m.getAmount();

                        case RETIRO ->
                            totalAbril -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "05" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalMayo += m.getAmount();

                        case RETIRO ->
                            totalMayo -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "06" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalJunio += m.getAmount();

                        case RETIRO ->
                            totalJunio -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "07" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalJulio += m.getAmount();

                        case RETIRO ->
                            totalJulio -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "08" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalAgosto += m.getAmount();

                        case RETIRO ->
                            totalAgosto -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "09" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalSeptiembre += m.getAmount();

                        case RETIRO ->
                            totalSeptiembre -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "10" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalOctubre += m.getAmount();

                        case RETIRO ->
                            totalOctubre -= m.getAmount();

                        default -> {
                        }

                    }

                }

                case "11" -> {

                    switch (m.getType()) {

                        case DEPÓSITO ->
                            totalNoviembre += m.getAmount();

                        case RETIRO ->
                            totalNoviembre -= m.getAmount();

                        default -> {
                        }

                    }

                }

                default -> {
                }

            }

        }

        int posicion = 0;
        float totalParcial = 0;

        switch (mes) {

            case "Enero" -> {

                
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("01")) {
                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(movimientosOperacion.getDeposito());
                                    totalParcial = movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(movimientosOperacion.getRetiro());
                                    totalParcial = movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

                
            }

            case "Febrero" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("02")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Marzo" -> {
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("03")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Abril" -> {
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("04")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Mayo" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("05")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Junio" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("06")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Julio" -> {
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("07")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Agosto" -> {
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("08")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Septiembre" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("09")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Octubre" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("10")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Noviembre" -> {
                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("11")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            case "Diciembre" -> {

                for (Transactions m : transactions) {

                    if (formato.format(m.getDate()).equals("12")) {

                        Transactions movimientosOperacion = new Transactions();

                        movimientosOperacion.setDescripcionOperacion(m.getDescription());
                        movimientosOperacion.setFechaOperacion(formato2.format(m.getDate()));

                        switch (m.getType()) {

                            case DEPÓSITO -> {

                                movimientosOperacion.setDeposito(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre + movimientosOperacion.getDeposito();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial + movimientosOperacion.getDeposito());
                                    totalParcial += movimientosOperacion.getDeposito();

                                }

                            }

                            case RETIRO -> {

                                movimientosOperacion.setRetiro(m.getAmount());

                                if (posicion == 0) {

                                    movimientosOperacion.setSubtotal(totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro());
                                    totalParcial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre - movimientosOperacion.getRetiro();

                                } else {

                                    movimientosOperacion.setSubtotal(totalParcial - movimientosOperacion.getRetiro());
                                    totalParcial -= movimientosOperacion.getRetiro();

                                }

                            }

                            default -> {
                            }

                        }

                        posicion++;

                        movimientosMes.add(movimientosOperacion);

                    }

                }

            }

            default -> {
            }

        }

        return movimientosMes;

    }

    /**
     * Aqui se calcula el saldo anterior al mes solicitado
     *
     * @param mes Se recibe el mes con el que se van a hacer calculos
     * @param movimientos se recibe el ArrayList para los calculos
     * @return El saldo anterior al mes solicitado
     */
    public float obtenerSaldoInicial(String mes, List<Transactions> movimientos) {

        float saldoInicial = 0;

        switch (mes) {

            case "Enero" -> {

                saldoInicial = 0;

            }

            case "Febrero" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero;

            }

            case "Marzo" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero;

            }

            case "Abril" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo;

            }

            case "Mayo" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril;

            }

            case "Junio" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo;

            }

            case "Julio" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio;

            }

            case "Agosto" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio;

            }

            case "Septiembre" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto;

            }

            case "Octubre" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre;

            }

            case "Noviembre" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre;

            }

            case "Diciembre" -> {

                saldoInicial = 0;
                saldoInicial = totalEnero + totalFebrero + totalMarzo + totalAbril + totalMayo + totalJunio + totalJulio + totalAgosto + totalSeptiembre + totalOctubre + totalNoviembre;

            }

            default -> {
            }

        }

        return saldoInicial;

    }

}
