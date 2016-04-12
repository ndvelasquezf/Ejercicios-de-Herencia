/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Rodrigo Velásquez y Nicolás Velásquez
 */
public class Cuenta {
    private int numeroCuenta;
    private String nombreCliente;
    protected double saldo;

    public Cuenta(int numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String consultarDatos(){
        String InformacionUsuario = "Datos de Usuario: \n - Numero de cuenta: "+numeroCuenta+"\n - Nombre Cliente:"+nombreCliente+"\n - Saldo:"+saldo;
        return InformacionUsuario;
    }

    
    public String depositarSaldo(double deposito){
        String respuesta;
        if(deposito>0){
            saldo += deposito;
            respuesta = "Se depositaron "+deposito+". \nNuevo saldo:"+saldo;
        }else{
            respuesta = "No se pudo depositar el valor indicado.";
        }
        return respuesta;
    }
    
    public String retirarSaldo(double retiro){        

        String respuesta;
        if(retiro>0){
            if(retiro<=saldo){
                saldo -= retiro;
                respuesta = "Se retiraron "+retiro+". \nNuevo saldo:"+saldo;
            }else{
                respuesta = "No dispone de saldo suficiente para ese retiro.";
            }
        }else{
            respuesta = "No se puede retirar un valor negativo.";
        }
        return respuesta;
    }  
}
