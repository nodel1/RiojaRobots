package CasaRural;

public class Excursion2 extends ServicioDecorator {
    public Excursion2(Servicio servicioDecorado) {
        super(servicioDecorado);
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion() + ", excursión 2";
    }

    @Override
    public double getCosto() {
        return servicioDecorado.getCosto() + 50; //  excursión 2
    }
}
