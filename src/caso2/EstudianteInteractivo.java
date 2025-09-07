package caso2;

import java.util.Scanner;

public class EstudianteInteractivo {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");
        System.out.println("Vamos a crear un nuevo estudiante:\n");
        
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa el apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        System.out.print("Ingresa la carrera: ");
        String carrera = scanner.nextLine();
        
        System.out.print("Ingresa el número de matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Ingresa el promedio (0.0 - 10.0): ");
        double promedio = scanner.nextDouble();
        
        Estudiante estudiante = new Estudiante(nombre, apellido, edad, carrera, matricula, promedio);
        
        System.out.println("\n=== INFORMACIÓN DEL ESTUDIANTE ===");
        estudiante.mostrarInformacion();
        
        System.out.println("\n=== DEMOSTRACIÓN DE MÉTODOS GET/SET ===");
        System.out.println("Nombre actual: " + estudiante.getNombre());
        System.out.println("Promedio actual: " + estudiante.getPromedio());
        
        System.out.print("\n¿Deseas actualizar el promedio? (s/n): ");
        char respuesta = scanner.next().charAt(0);
        
        if (respuesta == 's' || respuesta == 'S') {
            System.out.print("Ingresa el nuevo promedio: ");
            double nuevoPromedio = scanner.nextDouble();
            estudiante.setPromedio(nuevoPromedio);
            System.out.println("Promedio actualizado exitosamente!");
            estudiante.mostrarInformacion();
        }
        
        scanner.close();
        System.out.println("\n¡Gracias por usar el sistema!");
    }

}


class Estudiante {
	
	private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private String matricula;
    private double promedio;
    
    public Estudiante(String nombre, String apellido, int edad, String carrera, String matricula, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    // Métodos GET (accesores)
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    // Métodos SET (modificadores)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    /**
    * Método para mostrar toda la información del estudiante
    */
    public void mostrarInformacion() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
	
}
