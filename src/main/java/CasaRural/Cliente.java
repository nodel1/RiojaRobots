package CasaRural;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Servicio> serviciosUtilizados = new ArrayList<>();

    public void agregarServicio(Servicio servicio) {
        serviciosUtilizados.add(servicio);
    }

    public List<Servicio> getServiciosUtilizados() {         //revisar lo del list si uno o otro
        return serviciosUtilizados;
    }
}
