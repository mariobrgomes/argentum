package br.com.caelum.argentum;

import java.util.Calendar;

/**
 * Created by mario on 13/10/2015.
 */
public class CandleBuilder {

    private double abertura;
    private double fechamento;
    private double minimo;
    private double maximo;
    private double volume;
    private Calendar data;

    public CandleBuilder comAbertura(double abertura) {
        this.abertura = abertura;
        return this;
    }

    public CandleBuilder comFechamento(double fechamento) {
        this.fechamento = fechamento;
        return this;
    }

    public CandleBuilder comMinimo(double minimo) {
        this.minimo = minimo;
        return this;
    }

    public CandleBuilder comMaximo(double maximo) {
        this.maximo = maximo;
        return this;
    }

    public CandleBuilder comVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public CandleBuilder comData(Calendar data) {
        this.data = data;
        return this;
    }

    public Candlestick geraCandle() {
        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }
}
