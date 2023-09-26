package creacionales.abstractfactory;

public class CamionetaGasolina extends Camioneta{
    public CamionetaGasolina(String modelo, String color, int potencia, double maxCarga) {
        super(modelo, color, potencia, maxCarga);
    }

    public void mostrarCaracteristicas() {
        System.out.println(
                "Camioneta de gasolina de modelo: " + modelo +
                        " de color: " + color + " de potencia: " +
                        potencia + " de Max Carga: " + maxCarga);
    }
    
}
