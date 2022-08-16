
package cuentaBancaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float saldo_inicial = 0.0f;
        float cantidad_depositar = 0.0f;
        float cantidad_retirar = 0.0f;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("----Cuenta de Ahorros----");
        System.out.println("Ingrese el saldo inicial:");
        saldo_inicial = sc.nextFloat();
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldo_inicial);
        System.out.println("Ingrese la cantidad a consignar: ");
        cantidad_depositar = sc.nextFloat();
        cuenta1.consignar(cantidad_depositar);
        
        
        System.out.println("Ingrese la cantidad a retirar: ");
        cantidad_retirar = sc.nextFloat();
        cuenta1.retirar(cantidad_retirar);
        
        cuenta1.imprimir();
    }
}
