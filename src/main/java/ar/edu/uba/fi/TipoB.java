package ar.edu.uba.fi;

public class TipoB extends Entrada {
    public TipoB() {
        super("TipoB", 5000);
    }

    @Override
    public boolean intentarComprar(PertenenciaH tarjeta) {
        return true;
    }

    @Override
    public boolean intentarComprar(Gold tarjeta) {
        return false;
    }
}
