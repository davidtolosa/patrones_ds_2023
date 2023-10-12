package creacionales.composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Producto implements Pedido {
    // Atributos del producto
    private String nombre;
    private double precio;

    // Constructor del producto
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos de la interfaz Pedido
    @Override
    public void agregar(Pedido p) {
        // No hace nada
    }

    @Override
    public void eliminar(Pedido p) {
        // No hace nada
    }

    @Override
    public List<Pedido> obtenerSubpedidos() {
        // Devuelve una lista vacía
        return new ArrayList<>();
    }

    @Override
    public double calcularPrecio() {
        // Devuelve el precio del producto
        return this.precio;
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return this.nombre;
    }
}
