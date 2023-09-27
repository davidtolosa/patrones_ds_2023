package creacionales.abstractfactoryejemplo;

public class FabricaWindows implements FabricaAbstracta {

    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Textbox crearTextbox() {
        return new TextBoxWindows();
    }

    @Override
    public Menu crearMenu() {
        return new MenuWindows();
    }
    
}
