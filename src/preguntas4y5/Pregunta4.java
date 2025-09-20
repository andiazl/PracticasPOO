package preguntas4y5;
import java.util.ArrayList;

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}

class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método sobrecargado para agregar un producto solo con el nombre
    public void agregarProducto(String nombre) {
        agregarProducto(nombre, 0.0, 0);
    }

    // Método sobrecargado para agregar un producto con nombre y precio
    public void agregarProducto(String nombre, double precio) {
        agregarProducto(nombre, precio, 0);
    }

    // Método sobrecargado para agregar un producto con nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("El precio y la cantidad no pueden ser valores negativos.");
        }
        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        productos.add(nuevoProducto);
        System.out.println("Producto '" + nombre + "' agregado con éxito.");
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario Actual ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
        System.out.println("-------------------------");
    }
}

public class Pregunta4 {
    public static void main(String[] args) {
        Inventario miInventario = new Inventario();

        // Demostración  métodos sobrecargados
        miInventario.agregarProducto("PC");
        miInventario.agregarProducto("Iphone", 899.99);
        miInventario.agregarProducto("Camara", 50.0, 150);

        miInventario.mostrarInventario();

        // Demostración del manejo de errores (esta en negativo mostraran un error)
        try {
            miInventario.agregarProducto("Mouse", -25.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            miInventario.agregarProducto("Monitor", 300.0, -10);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

