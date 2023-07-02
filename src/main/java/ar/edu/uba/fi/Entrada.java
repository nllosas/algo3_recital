package ar.edu.uba.fi;

public abstract class Entrada implements Comprable {
    private String tipo;
    protected int precio;

    public Entrada(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return tipo.toUpperCase().equals( entrada.tipo.toUpperCase() );
    }
}
