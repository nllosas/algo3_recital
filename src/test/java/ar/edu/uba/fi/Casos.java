package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

public class Casos {

    @Test
    public void test01usuarioCompra2EntradasTipoBConTarjetaPertenenciaHYReciveLasDos() {
        SistemaDeCompras sistemaDeCompras = new SistemaDeCompras();
        Tarjeta tarjeta = new PertenenciaH();
        sistemaDeCompras.comprarEntradas(2, new TipoB(), tarjeta);
        List<Entrada> entradasObtenidas = sistemaDeCompras.retirarEntradas();

        List<Entrada> entradasEsperadas = new ArrayList<Entrada>();
        for (int i = 0; i < 2; i++) {
            entradasEsperadas.add(new TipoB());
        }
        assertEquals(entradasEsperadas, entradasObtenidas);
    }

    @Test
    public void test02usuarioCompra2EntradasTipoAConTarjetaGoldYReciveSoloUna() {
        SistemaDeCompras sistemaDeCompras = new SistemaDeCompras();
        Tarjeta tarjeta = new Gold();
        sistemaDeCompras.comprarEntradas(2, new TipoA(), tarjeta);
        List<Entrada> entradasObtenidas = sistemaDeCompras.retirarEntradas();

        List<Entrada> entradasEsperadas = new ArrayList<Entrada>();
        entradasEsperadas.add(new TipoA());

        assertEquals(entradasEsperadas, entradasObtenidas);
    }

    @Test
    public void test03usuarioCompra2EntradasTipoByDosEntradasTipoAConTarjetaPertenenciaHYReciveLas4() {
        SistemaDeCompras sistemaDeCompras = new SistemaDeCompras();
        Tarjeta tarjeta = new PertenenciaH();
        sistemaDeCompras.comprarEntradas(2, new TipoB(), tarjeta);
        sistemaDeCompras.comprarEntradas(2, new TipoA(), tarjeta);
        List<Entrada> entradasObtenidas = sistemaDeCompras.retirarEntradas();

        List<Entrada> entradasEsperadas = new ArrayList<Entrada>();
        for (int i = 0; i < 2; i++) {
            entradasEsperadas.add(new TipoB());
        }
        for (int i = 0; i < 2; i++) {
            entradasEsperadas.add(new TipoA());
        }

        assertEquals(entradasEsperadas, entradasObtenidas);
    }

    @Test
    public void test04usuarioCompra4EntradasTipoBY10EntradasTipoAConTarjetaGoldYRecive1DelTipoA() {
        SistemaDeCompras sistemaDeCompras = new SistemaDeCompras();
        Tarjeta tarjeta = new Gold();
        sistemaDeCompras.comprarEntradas(4, new TipoB(), tarjeta);
        sistemaDeCompras.comprarEntradas(10, new TipoA(), tarjeta);
        List<Entrada> entradasObtenidas = sistemaDeCompras.retirarEntradas();

        List<Entrada> entradasEsperadas = new ArrayList<Entrada>();
        entradasEsperadas.add(new TipoA());

        assertEquals(entradasEsperadas, entradasObtenidas);
    }
}


