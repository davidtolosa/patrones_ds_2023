package creacionales.abstractfactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo {
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color,
                potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }

    @Override
    public Camioneta creaCamioneta(String modelo, String color, int potencia, double maxCarga) {
        return new CamionetaGasolina(modelo, color, potencia, maxCarga);
    }
}
