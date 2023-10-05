package creacionales.singletonejercicio;

public class Logger {

    private static Logger instancia = null;

    public static Logger GetInstancia()
    {
        if(instancia == null) 
            instancia = new Logger();

        return instancia;
    }

    private Logger() {
        System.out.println("Se creo un objeto Logger");
    }

    private boolean abrirArchivoLog() {
        System.out.println("Archivo Log Abierto");
        return true;
    }

    private boolean cerrarArchivoLog() {
        System.out.println("Archivo Log Cerrado");
        return true;
    }

    public void log(String log) {
        if (this.abrirArchivoLog()) {
            System.out.println("Guardado en log: " + log);
        }
        this.cerrarArchivoLog();
    }
}
