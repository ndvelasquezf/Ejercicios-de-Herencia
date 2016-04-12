/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rodrigo Velásquez y Nicolás Velásquez
 */
public class CuentaAhorros extends Cuenta{
    private Date fechaVencimiento;
    private final double INTERES_MENSUAL = 2;
    

    public CuentaAhorros(int numeroCuenta, String nombreCliente, double saldo, Date fecha) {
        super(numeroCuenta, nombreCliente, saldo);
        this.fechaVencimiento = fecha;
    }
    /**
     * * tomado de: http://danielmauricioporrasveloz.blogspot.com.co/2015/05/como-calcular-la-diferencia-en-meses.html
     * Método que formatea un afecha en base al formato pasado como
     * parámetro.
     * @param fecha: fecha a formatear
     * @param pattern: formato que se dará a la fecha.
     * @return Fecha formateada en base al formato de pattern.
     * null si se presenta alguna excepción
     */
    public static Date formatearDate(Date fecha, String pattern) {
        SimpleDateFormat formato = new SimpleDateFormat(pattern);
        Date fechaFormateada = null;
        try {
            fechaFormateada = formato.parse(formato.format(fecha));
            return fechaFormateada;
        } catch (Exception ex) {
            return fechaFormateada;
        }
    }   
    /**
     * tomado de: http://danielmauricioporrasveloz.blogspot.com.co/2015/05/como-calcular-la-diferencia-en-meses.html
     * Método que remplaza el año y el mes de fecha y pone
     * el año y mes de fechaActual
     * @param fecha: fecha a remplazar el mes y el año
     * @param fechaActual: fecha de la cual se tomara el mes y el año
     * y se colocara en fecha
     * @return Calendar con la nueva fecha calculada.
     */
    public static Calendar ponerAnioMesActual(Date fecha, Date fechaActual) {
        try {
            Calendar cActual = Calendar.getInstance();
            cActual.setTime(fechaActual);
            Calendar cfecha = Calendar.getInstance();
            cfecha.setTime(fecha);
            //la fecha nueva
            Calendar c1 = Calendar.getInstance();
            c1.set(cActual.get(Calendar.YEAR), cActual.get(Calendar.MONTH), cfecha.get(Calendar.DATE));
            return c1;
        } catch (Exception e) {
            return null;
        }
    }
      /**
      * tomado de: http://danielmauricioporrasveloz.blogspot.com.co/2015/05/como-calcular-la-diferencia-en-meses.html
     * Método que calcula los meses que han pasado dese fecha inicio hasta
     * fecha fin.
     * @param fechaInicio: fecha de inicio de comparación.
     * @param fechaFin: fecha de finalización de comparación.
     * @return 0 si no ha pasado un mes o si se presenta alguna exepción.
     * > 0 si han pasado almenos un mes.
     */
    public static int calcularMesesAFecha(Date fechaInicio, Date fechaFin) {
        try {
            //Fecha inicio en objeto Calendar
            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(fechaInicio);
            //Fecha finalización en objeto Calendar
            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(fechaFin);
            //Cálculo de meses para las fechas de inicio y finalización
            int startMes = (startCalendar.get(Calendar.YEAR) * 12) + startCalendar.get(Calendar.MONTH);
            int endMes = (endCalendar.get(Calendar.YEAR) * 12) + endCalendar.get(Calendar.MONTH);
            //Diferencia en meses entre las dos fechas
            int diffMonth = endMes - startMes;
            //Si la el día de la fecha de finalización es menor que el día de la fecha inicio
            //se resta un mes, puesto que no estaria cumpliendo otro periodo.
            //Para esto ocupo el metoddo ponerAnioMesActual
            Date aFecha = ponerAnioMesActual(fechaInicio,fechaFin).getTime();
            if(formatearDate(fechaFin, "dd/MM/yyyy").compareTo(
                    formatearDate(aFecha,"dd/MM/yyyy")) < 0){
                diffMonth = diffMonth - 1;
            }
            //Si la fecha de finalización es menor que la fecha de inicio, retorno que los meses
            // transcurridos entre las dos fechas es 0
            if(diffMonth < 0){
                diffMonth = 0;
            }
            return diffMonth;
        } catch (Exception e) {
            return 0;
        }
    }
    
    @Override
    public String depositarSaldo(double deposito){
        if ( deposito < 0 ) {
            return "No se puede depositar un valor negativo.";
        }
        Date hoy = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        if ( !formatoFecha.format(hoy).endsWith("01") ) {
            //return "No puede depositar, no es el primer dia del mes.";
        }
        int meses = calcularMesesAFecha ( hoy, fechaVencimiento );
        double saldoActual = getSaldo();
        double saldoAgregado = deposito*Math.pow(1+INTERES_MENSUAL/100.0, meses);
        saldo += saldoAgregado;
        return "Se ha agregado " + saldoAgregado +", Correspondiente al "+ INTERES_MENSUAL +"% de interes. \nSaldo Antiguo:"+saldoActual+"\nNuevo Saldo:"+this.getSaldo();
    }
    
    @Override
    public String retirarSaldo(double retiro){        
        String respuesta;
        Date hoy = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        if(retiro>0){
            if(retiro<=getSaldo()){
                //if(!formatoFecha.format(hoy).equals(formatoFecha.format(fechaVencimiento))){
                    saldo -= retiro;
                    respuesta = "Se retiraron "+retiro+". \nNuevo saldo:"+getSaldo();
                //}else{
                //    respuesta = "Solo se puede retirar en fecha de vencimiento";
                //}
            }else{
                respuesta = "No dispone de saldo suficiente para ese retiro.";
            }
        }else{
            respuesta = "No se puede retirar un valor negativo.";
        }
        return respuesta;
    }  
    
}
