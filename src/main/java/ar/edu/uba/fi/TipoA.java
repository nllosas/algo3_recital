package ar.edu.uba.fi;

public class TipoA extends Entrada {
    public TipoA() {
        super("TipoA", 600);
    }

    @Override
    public boolean intentarComprar(PertenenciaH tarjeta) {
        return true;
    }

    @Override
    public boolean intentarComprar(Gold tarjeta) {
        try {
            tarjeta.consumir(this.precio);
            return true;
        } catch (LimiteSuperadoException e) {
            return false;
        }
    }
}
