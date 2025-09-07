package caso3;

import java.util.Scanner;

public class CuentaBancaria {
	
	private double saldo;

    // Constructor inicializando el saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }
    
    // Método para retirar dinero con validación
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso. Saldo actual: " + saldo);
            } else {
                System.out.println("Fondos insuficientes. Saldo disponible: " + saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }
    
}
