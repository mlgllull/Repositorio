/**
 *
 * Clase Main de CCuenta    
 * inicio del programa
 * 
 * 
 * @author luisa
 * @version 1.0
 */
package deposito;

import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        float cantidad = 0;
        operativa_cuenta(cantidad);

}

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;       
        //cuenta1 con los datos nombre, numcuenta y saldo actual de la cuenta
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        /**
        * @throws Exception  If an exception occurred 
        *                      
        */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }


}
