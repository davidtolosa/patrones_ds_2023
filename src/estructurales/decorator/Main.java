package estructurales.decorator;

public class Main {
    public static void main(String[] args) {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
        ColorDecorador colorDecorador = new ColorDecorador(marcaDecorador);

        colorDecorador.visualiza();
    }
}
