package ar.edu.uba.fi;

public class PertenenciaH implements Tarjeta {
    @Override
    public boolean comprar(Comprable entrada) {
        return entrada.intentarComprar(this);
    }
}
