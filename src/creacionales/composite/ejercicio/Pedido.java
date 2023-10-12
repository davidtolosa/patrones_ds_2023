package creacionales.composite.ejercicio;

import java.util.List;

public interface Pedido {
    // Método para agregar un subcomponente al pedido
    void agregar(Pedido p);
    // Método para eliminar un subcomponente del pedido
    void eliminar(Pedido p);
    // Método para obtener los subcomponentes del pedido
    List<Pedido> obtenerSubpedidos();
    // Método para calcular el precio total del pedido
    double calcularPrecio();
}
