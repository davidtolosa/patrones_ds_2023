package estructurales.adapter;

public class ServidorWeb {
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHtml();
        documento1.setContenido("Hello");
        documento1.dibuja();
        
        System.out.println();
        
        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();

        Documento documento3 = new DocumentoPdf();
        documento3.setContenido("Hola");
        documento3.dibuja();

    }
}
