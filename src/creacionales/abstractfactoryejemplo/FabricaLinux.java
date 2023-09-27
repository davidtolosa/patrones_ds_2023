package creacionales.abstractfactoryejemplo;

public class FabricaLinux implements FabricaAbstracta {

    @Override
    public Boton crearBoton() {
        return new BotonLinux();
    }

    @Override
    public Textbox crearTextbox() {
        return new TextBoxLinux();
    }

    @Override
    public Menu crearMenu() {
        return new MenuLinux();
    }
    
}
