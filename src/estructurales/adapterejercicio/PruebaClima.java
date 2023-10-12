package estructurales.adapterejercicio;

public class PruebaClima {
    public static void main(String[] args) {
        //ClimaApi servicioMeteorologicoNacional = new ApiServicioMeteorologicoNacional();
        ClimaApi apiClima = new ApiWindGuruAdapter();


        Clima climaSerMetNac = apiClima.obtenerClima("Trenque Lauquen");
        System.out.println(climaSerMetNac);
        System.out.println();
    }
}
