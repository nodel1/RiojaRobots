package CasaRural;

public class PaseoCaballo extends ServicioDecorator {
    public PaseoCaballo(Servicio servicioDecorado) {
        super(servicioDecorado);
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion() + ", paseo a caballo";
    }

    @Override
    public double getCosto() {
        return servicioDecorado.getCosto() + 100; // Precio paseo a caballo
    }
}
