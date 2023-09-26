package creacionales.abstractfactory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color,
                potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color,
                potencia);
    }

    @Override
    public Camioneta creaCamioneta(String modelo, String color, int potencia, double maxCarga) {
        return new CamionetaElectrica(modelo, color, potencia, maxCarga);
    }
}
