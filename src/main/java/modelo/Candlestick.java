package modelo;

import lombok.Data;

import java.util.Calendar;

/**
 * Created by 964456 on 22/07/2015.
 */
@Data
public final class Candlestick {

    private final double abertura;
    private final double fechamento;
    private final double minimo;
    private final double maximo;
    private final double volume;
    private final Calendar data;



    public boolean isAlta() {
        return this.abertura < this.fechamento;
    }

    public boolean isBaixa() {
        return this.abertura > this.fechamento;
    }
}
