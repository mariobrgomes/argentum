package modelo;

import lombok.Data;

import java.text.SimpleDateFormat;
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



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("["  +abertura);
        stringBuilder.append(", " +fechamento);
        stringBuilder.append(", " +minimo);
        stringBuilder.append(", " +maximo);
        stringBuilder.append(", " +volume);
        stringBuilder.append(", " +fechamento);
        stringBuilder.append(", Data:" );
        stringBuilder.append("]");


    }
}
