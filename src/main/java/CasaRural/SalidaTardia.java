package CasaRural;

public class SalidaTardia implements Servicio {
    @Override
    public String getDescripcion() {
        return "salida tardía";
    }

    @Override
    public double getCosto() {
        return 75;
    }
}