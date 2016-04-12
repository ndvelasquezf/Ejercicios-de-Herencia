/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Velásquez y Nicolás Velásquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner in = new Scanner ( System.in );
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        while ( true ) {
            System.out.println();
            System.out.println("1. Crear cuenta.");
            System.out.println("2. Consultar datos.");
            System.out.println("3. Depositar.");
            System.out.println("4. Retirar.");
            System.out.println("5. Salir.");
            opcion = in.nextInt();
            if ( opcion == 0 ) break;
            
            Cuenta cuenta;
            int numeroDeCuenta;            
            switch ( opcion ) {

                case 1:
                    System.out.println("1. Cuenta de ahorros.");
                    System.out.println("2. Cuenta cheque.");
                    opcion = in.nextInt();
                    if ( opcion == 1 )
                    {
                        String nombreDeCliente;
                        double saldoInicial;
                        System.out.print ( "Nombre: " );
                        in.nextLine(); //para comer el enter
                        nombreDeCliente = in.nextLine();
                        System.out.print ( "Saldo inicial: " );
                        saldoInicial = in.nextDouble();
                        numeroDeCuenta = 10000000;
                        numeroDeCuenta += Math.floor(Math.random()*1000000);
                        System.out.print("Fecha de vencimiento (yyyy-MM-dd): ");
                        Date fecha = null;
                        // sacado de: http://stackoverflow.com/questions/17191025/how-to-use-type-date-and-read-the-value-from-keyboard-in-java
                        // para leer la fecha por teclado
                        while ( true ) {
                            try {
                                fecha = new SimpleDateFormat("yyyy-MM-dd").parse(in.next());
                            } catch (ParseException e) {
                                System.out.println("La fecha no esta en el formato indicado, ingresela de nuevo.");
                                continue;
                            }
                            break;
                        }
                        System.out.println("Cuenta creada: ");
                        Cuenta nueva = new CuentaAhorros(
                                numeroDeCuenta, nombreDeCliente, saldoInicial, fecha);
                        System.out.println(nueva.consultarDatos());
                        cuentas.add(nueva);
                    }
                    else
                    {
                        String nombreDeCliente;
                        double saldoInicial;
                        System.out.print ( "Nombre: " );
                        in.nextLine(); //para comer el enter
                        nombreDeCliente = in.nextLine();
                        System.out.print ( "Saldo inicial: " );
                        saldoInicial = in.nextDouble();
                        numeroDeCuenta = 10000000;
                        numeroDeCuenta += Math.floor(Math.random()*1000000);
                        System.out.print("Cuenta creada: ");
                        Cuenta nueva = new CuentaCheque(
                                numeroDeCuenta, nombreDeCliente, saldoInicial);
                        System.out.println(nueva.consultarDatos());
                        cuentas.add(nueva);
                    }
                    break;
                case 2:
                    cuenta = null;
                    System.out.print("Ingrese su numero de cuenta: ");
                    numeroDeCuenta = in.nextInt();
                    for ( int i = 0; i < cuentas.size(); ++i )
                        if ( cuentas.get(i).getNumeroCuenta() == numeroDeCuenta )
                            cuenta = cuentas.get(i);
                    if ( cuenta == null )
                        System.out.println("El numero de cuenta no existe.");
                    else
                        System.out.println(cuenta.consultarDatos());
                    break;
                case 3:
                    cuenta = null;
                    System.out.print("Ingrese su numero de cuenta: ");
                    numeroDeCuenta = in.nextInt();
                    for ( int i = 0; i < cuentas.size(); ++i )
                        if ( cuentas.get(i).getNumeroCuenta() == numeroDeCuenta )
                            cuenta = cuentas.get(i);
                    if ( cuenta == null )
                        System.out.println("El numero de cuenta no existe.");
                    else
                    {
                        System.out.print("Valor a depositar: ");
                        double valor = in.nextDouble();
                        System.out.println(cuenta.depositarSaldo(valor));
                    }
                    break;
                case 4:
                    cuenta = null;
                    System.out.print("Ingrese su numero de cuenta: ");
                    numeroDeCuenta = in.nextInt();
                    for ( int i = 0; i < cuentas.size(); ++i )
                        if ( cuentas.get(i).getNumeroCuenta() == numeroDeCuenta )
                            cuenta = cuentas.get(i);
                    if ( cuenta == null )
                        System.out.println("El numero de cuenta no existe.");
                    else
                    {
                        System.out.print("Valor a retirar: ");
                        double valor = in.nextDouble();
                        System.out.println(cuenta.retirarSaldo(valor));
                    }
                    break;
                case 5:
                    return;
            }
            in.nextLine();
            System.out.println("Presione enter para continuar...");
            in.nextLine(); 
        }
    }
    
}
