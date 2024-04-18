package CasaRural;

public abstract class ServicioDecorator implements Servicio {
    protected Servicio servicioDecorado;

    public ServicioDecorator(Servicio servicioDecorado) {
        this.servicioDecorado = servicioDecorado;
    }

    @Override
    public String getDescripcion() {
        return servicioDecorado.getDescripcion();
    }

    @Override
    public double getCosto() {
        return servicioDecorado.getCosto();
    }
}
