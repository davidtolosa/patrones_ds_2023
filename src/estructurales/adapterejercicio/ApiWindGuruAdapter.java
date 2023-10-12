package estructurales.adapterejercicio;

public class ApiWindGuruAdapter implements ClimaApi {

    ApiWindguru apiWindguru = new ApiWindguru();
   

    public Clima obtenerClima(String ciudad) {
       apiWindguru.seleccionarCiudad(ciudad);
       float temperatura = apiWindguru.obtenerTemperatura();
       float humedad = apiWindguru.obtenerHumedad();
       float presion = apiWindguru.obtenerPresion();
       
       return new Clima(ciudad, temperatura, humedad, presion);
    }
    
}
