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
    
    // Método para consultar saldo
    public double getSaldo() {
        return saldo;
    }
    
 // Método principal para probar con Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(saldoInicial);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    cuenta.retirar(montoRetiro);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
    
}
