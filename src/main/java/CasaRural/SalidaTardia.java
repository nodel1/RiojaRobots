package CasaRural;

public class SalidaTardia extends ServicioDecorator {
    public SalidaTardia(Servicio servicioDecorado) {
        super(servicioDecorado);
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion() + ", salida tardía";
    }

    @Override
    public double getCosto() {
        return servicioDecorado.getCosto() + 75;

    }
}