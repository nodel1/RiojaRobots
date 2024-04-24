package CasaRural;

public class PaseoCaballo implements Servicio {
    @Override
    public String getDescripcion() {
        return "paseo a caballo";
    }

    @Override
    public double getCosto() {
        return 100;
    }
}
