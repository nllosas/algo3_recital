package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCompras {

    private List<Entrada> entradasCompradas = new ArrayList<>();
    public void comprarEntradas(int cantidad, Entrada entrada, Tarjeta tarjeta) {
        for (int i = 0; i < cantidad; i++) {
            if(tarjeta.comprar(entrada)) {
                entradasCompradas.add(entrada);
            }
        }
    }

    public List<Entrada> retirarEntradas() {
        return entradasCompradas;
    }
}
