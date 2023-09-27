package creacionales.abstractfactoryejemplo;

public class Main {
    public static void main(String[] args) {
        FabricaAbstracta fabricaComponentesPantalla = new FabricaLinux();

        Boton boton = fabricaComponentesPantalla.crearBoton();
        boton.dibujar();

        Menu menu = fabricaComponentesPantalla.crearMenu();
        menu.dibujar();

        Textbox textbox = fabricaComponentesPantalla.crearTextbox();
        textbox.dibujar();
    }
}
