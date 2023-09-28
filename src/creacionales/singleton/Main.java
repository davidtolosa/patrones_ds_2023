package creacionales.singleton;

public class Main {
    public static void main(String[] args) {
        Vendedor v1 = Vendedor.Instance();
        v1.setNombre("David");
        System.out.println(v1.getNombre());

        Vendedor v2 = Vendedor.Instance();
        System.out.println(v2.getNombre());
    }

   
}
