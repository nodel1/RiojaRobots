package CasaRural;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.agregarServicio(new Alojamiento());
        cliente.agregarServicio(new Excursion1());
        cliente.agregarServicio(new SalidaTardia());

        System.out.println("Servicios utilizados:");
        for (Servicio servicio : cliente.getServiciosUtilizados()) {
            System.out.println("- " + servicio.getDescripcion());
        }


        System.out.println("Costo: " + Calculadora.calcularTotal(cliente) + "€");
    }
}