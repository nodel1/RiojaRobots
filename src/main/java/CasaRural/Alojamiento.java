package CasaRural;

public class Alojamiento implements Servicio {
    @Override
    public String getDescripcion() {
        return "alojamiento";
    }

    @Override
    public double getCosto() {
        return 300; // Precio basico
    }
}
