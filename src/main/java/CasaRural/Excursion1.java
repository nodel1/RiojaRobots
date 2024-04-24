package CasaRural;

public class Excursion1 implements Servicio {
    @Override
    public String getDescripcion() {
        return "excursión 1";
    }

    @Override
    public double getCosto() {
        return 25;
    }
}
