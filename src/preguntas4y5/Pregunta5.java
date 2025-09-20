package preguntas4y5;

import java.util.InputMismatchException;
import java.util.Scanner;

// Definición de la excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class Pregunta5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese un número entero: ");
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input);

            if (numero < 0) {
                throw new NumeroNegativoException("El número ingresado no puede ser negativo.");
            }

            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            // Captura la excepción si el valor no es un número entero
            System.err.println("Error: El valor ingresado no es un número entero válido.");
        } catch (NumeroNegativoException e) {
            // Captura la excepción personalizada si el número es negativo
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Cierra el scanner para liberar los recursos
            scanner.close();
        }
        
    }
}