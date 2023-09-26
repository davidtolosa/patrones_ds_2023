package creacionales.abstractfactory;

public class CamionetaElectrica extends Camioneta{
    public CamionetaElectrica(String modelo, String color, int potencia, double maxCarga) {
        super(modelo, color, potencia, maxCarga);
    }

    public void mostrarCaracteristicas() {
        System.out.println(
                "Camioneca Electrica de modelo: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de Max Carga: " + maxCarga);
    }
    
}