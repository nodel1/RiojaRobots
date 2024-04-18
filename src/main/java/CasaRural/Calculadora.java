package CasaRural;

public class Calculadora {

    public static double calcularTotal(Cliente cliente) {

        double Total = 0;

        for (Servicio servicio : cliente.getServiciosUtilizados()) {
            Total += servicio.getCosto();
        }
        return Total;
    }

}
