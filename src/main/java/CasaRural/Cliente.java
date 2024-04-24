package CasaRural;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private Set<Servicio> serviciosUtilizados = new HashSet<>();

    public void agregarServicio(Servicio servicio) {
        serviciosUtilizados.add(servicio);
    }

    public Set<Servicio> getServiciosUtilizados() {
        return serviciosUtilizados;
    }
}