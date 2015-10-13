package br.com.caelum.argentum;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by 964456 on 22/07/2015.
 */
@Data
public final class Candlestick {

    private static final String MAXIMO_MENOR = "O preco maximo nao pode ser menor que o minimo";
    private static final String DATA_VAZIO = "A data nao pode ser vazia";
    private static final String VALOR_NEGATIVO = "O valor nao pode ser negativo";

    private final double abertura;
    private final double fechamento;
    private final double minimo;
    private final double maximo;
    private final double volume;
    private final Calendar data;

    public Candlestick (double abertura, double fechamento, double minimo,
                        double maximo, double volume, Calendar data) {

        if (maximo < minimo) {
            throw new IllegalArgumentException(MAXIMO_MENOR);
        }

        if (data == null) {
            throw new IllegalArgumentException(DATA_VAZIO);
        }

        if (abertura < 0 || fechamento < 0 || minimo < 0 || maximo < 0 || volume < 0) {
            throw new IllegalArgumentException(VALOR_NEGATIVO);
        }

        this.abertura = abertura;
        this.fechamento = fechamento;
        this.minimo = minimo;
        this.maximo = maximo;
        this.volume = volume;
        this.data = data;
    }

    public boolean isAlta() {
        return this.abertura < this.fechamento;
    }

    public boolean isBaixa() {
        return this.abertura > this.fechamento;
    }



   @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("["  + this.getAbertura());
        stringBuilder.append(", " + this.getFechamento());
        stringBuilder.append(", " + this.getMinimo());
        stringBuilder.append(", " + this.getMaximo());
        stringBuilder.append(", " + this.getVolume());
        stringBuilder.append(", " + this.getFechamento());
        stringBuilder.append(", Data: " + sdf.format(this.getData().getTime()));
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
