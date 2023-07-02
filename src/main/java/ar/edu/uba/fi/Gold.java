package ar.edu.uba.fi;

public class Gold implements Tarjeta {
    private int limite = 1000;

    @Override
    public boolean comprar(Comprable entrada) {
        return entrada.intentarComprar(this);
    }


    public void consumir(int precio) throws LimiteSuperadoException {
        if (precio > limite) throw new LimiteSuperadoException("Limite de tarjeta superado");
        limite-=precio;
    }
}
