package CasaRural;

public class Excursion1 extends ServicioDecorator {
    public Excursion1(Servicio servicioDecorado) {
        super(servicioDecorado);
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion() + ", excursión 1";
    }

    @Override
    public double getCosto() {
        return servicioDecorado.getCosto() + 25; // lo que cuesta la excursión 1
    }
}
