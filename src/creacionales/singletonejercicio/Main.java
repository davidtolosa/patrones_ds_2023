package creacionales.singletonejercicio;

public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.GetInstancia();
        l1.log("Logger1");
        
        System.out.println();
        
        Logger l2 = Logger.GetInstancia();
        l2.log("Logger2");
    }
}
