
package cuentaBancaria;

public class Cuenta {
    //Atributos
    protected float saldo;
    protected int numero_consignaciones;
    protected int numero_retiros;

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numero_consignaciones +=1;
    }
    
    public void retirar(float cantidad){
        float nuevo_saldo = saldo - cantidad;
        
        if (nuevo_saldo >= 0){
            saldo -= cantidad;
            numero_retiros +=1;
        } else {
            System.out.println("La cantidad excede el saldo actual.");
        }
    }
}
