package estructurales.decorator;

public class MarcaDecorador extends Decorador {
    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaLogo() {
        System.out.println("Muestra Marca del Vehiculo");
    }

    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }
}