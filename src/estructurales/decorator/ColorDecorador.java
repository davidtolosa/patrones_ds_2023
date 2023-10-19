package estructurales.decorator;

public class ColorDecorador extends Decorador {
    public ColorDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaColor() {
        System.out.println("Muestra Color del Vehiculo");
    }

    public void visualiza() {
        super.visualiza();
        this.visualizaColor();
    }
    
}
