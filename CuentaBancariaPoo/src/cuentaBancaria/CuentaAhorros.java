
package cuentaBancaria;

public class CuentaAhorros extends Cuenta {
    
    private boolean activa;
    
    public CuentaAhorros(float saldo){
        super(saldo);
        activa = saldo > 10000;
    }
    
    //Sobreescribir métodos clase padre
    @Override
    public void consignar(float cantidad){
        if (activa) {
            super.consignar(cantidad);
        }
    }
    @Override
    public void retirar(float cantidad){
        if (activa) {
            super.retirar(cantidad);
        }
    }
    
    public void imprimir(){
        System.out.println("Saldo: $"+saldo);
        System.out.println("Número de transacciones: "+(numero_consignaciones+numero_retiros));
    } 
}
