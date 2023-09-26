package creacionales.abstractfactory;

public abstract class Camioneta {
    protected String modelo;
    protected String color;
    protected int potencia;
    protected double maxCarga;

    public Camioneta(String modelo, String color, int potencia, double maxCarga) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.maxCarga = maxCarga;
    }

    public abstract void mostrarCaracteristicas();
}
