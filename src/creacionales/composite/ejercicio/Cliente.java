package creacionales.composite.ejercicio;

public class Cliente {
    public static void main(String[] args) {
        // Crea algunos productos individuales
        Producto libro = new Producto("Libro", 10);
        Producto lapiz = new Producto("Lápiz", 0.5);
        Producto goma = new Producto("Goma", 0.2);

        // Crea un pedido compuesto por dos productos individuales
        PedidoCompuesto pedido1 = new PedidoCompuesto();
        pedido1.agregar(libro);
        pedido1.agregar(lapiz);

        // Crea otro pedido compuesto por un producto individual y otro pedido
        PedidoCompuesto pedido2 = new PedidoCompuesto();
        pedido2.agregar(goma);
        pedido2.agregar(pedido1);

        // Calcula el precio total de cada pedido
        System.out.println("El precio del pedido 1 es: " + pedido1.calcularPrecio());
        System.out.println("El precio del pedido 2 es: " + pedido2.calcularPrecio());

        // Muestra los componentes de cada pedido
        System.out.println("El pedido 1 contiene: ");
        for (Pedido p : pedido1.obtenerSubpedidos()) {
            if (p instanceof Producto) {
                System.out.println(((Producto) p).getNombre());
            }
        }
        System.out.println("El pedido 2 contiene: ");
        for (Pedido p : pedido2.obtenerSubpedidos()) {
            if (p instanceof Producto) {
                System.out.println(((Producto) p).getNombre());
            } else if (p instanceof PedidoCompuesto) {
                System.out.println("Otro pedido con: ");
                for (Pedido q : p.obtenerSubpedidos()) {
                    if (q instanceof Producto) {
                        System.out.println(((Producto) q).getNombre());
                    }
                }
            }
        }
    }
}
