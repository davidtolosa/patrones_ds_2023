package creacionales.abstractfactory;

public class Main {
    public static void main(String[] args) {
        FabricaVehiculo fabricaVehiculo = new FabricaVehiculoGasolina();
        
        Automovil auto1 = fabricaVehiculo.creaAutomovil("Model", "Blanco", 0, 0);
        auto1.mostrarCaracteristicas();

        Camioneta camioneta1 = fabricaVehiculo.creaCamioneta("Modelo Camioneta", "Negro", 0, 0);
        camioneta1.mostrarCaracteristicas();

        Scooter scooter1 = fabricaVehiculo.creaScooter("Model Scooter", "Azul", 0);
        scooter1.mostrarCaracteristicas();
    }
}
