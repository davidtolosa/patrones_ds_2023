package creacionales.singleton;

public class Vendedor {
   public String nombre;

   private static Vendedor _instance = null;

   private Vendedor(){}

   public static Vendedor Instance() {
    if (_instance == null)
        _instance = new Vendedor();
    return _instance;
}
   
   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }    
}
