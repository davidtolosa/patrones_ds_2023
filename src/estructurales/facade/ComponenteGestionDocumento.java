package estructurales.facade;

public class ComponenteGestionDocumento implements GestionDocumento {
    public String documento(int indice) {
        return "Documento número " + indice;
    }
}