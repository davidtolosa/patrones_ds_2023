package creacionales.composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class PedidoCompuesto implements Pedido{
    // Atributo que almacena los componentes del pedido
    private List<Pedido> componentes;

    // Constructor del pedido compuesto
    public PedidoCompuesto() {
        this.componentes = new ArrayList<>();
    }

    // Métodos de la interfaz Pedido
    @Override
    public void agregar(Pedido p) {
        // Agrega un componente al pedido
        this.componentes.add(p);
    }

    @Override
    public void eliminar(Pedido p) {
        // Elimina un componente del pedido
        this.componentes.remove(p);
    }

    @Override
    public List<Pedido> obtenerSubpedidos() {
        // Devuelve la lista de componentes del pedido
        return this.componentes;
    }

    @Override
    public double calcularPrecio() {
        // Calcula el precio total del pedido sumando el precio de cada componente
        double precioTotal = 0;
        for (Pedido p : this.componentes) {
            precioTotal += p.calcularPrecio();
        }
        return precioTotal;
    }
}
