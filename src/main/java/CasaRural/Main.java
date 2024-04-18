package CasaRural;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.agregarServicio(new Alojamiento());
        cliente.agregarServicio(new Excursion1(new SalidaTardia(cliente.getServiciosUtilizados().get(0))));


        System.out.println("Servicios utilizados: " + cliente.getServiciosUtilizados().stream().map(Servicio::getDescripcion).collect(Collectors.joining(", ")));


        System.out.println("Costo: " + Calculadora.calcularTotal(cliente) + "€");
    }
}
