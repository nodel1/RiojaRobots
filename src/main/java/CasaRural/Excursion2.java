package CasaRural;

public class Excursion2 implements Servicio {
    @Override
    public String getDescripcion() {
        return "excursión 2";
    }

    @Override
    public double getCosto() {
        return 50;
    }
}