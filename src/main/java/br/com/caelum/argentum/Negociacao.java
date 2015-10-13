package br.com.caelum.argentum;

import lombok.Data;

import java.util.Calendar;

/**
 * Created by 964456 on 22/07/2015.
 */
@Data
public final class Negociacao {

    private static final String DATA_NULA = ("data nao pode ser nula");

    private final double preco;
    private final int quantidade;
    private final Calendar data;

    public Negociacao(double preco, int quantidade, Calendar data) {

        if (data == null) {
            throw new IllegalArgumentException(DATA_NULA);
        }

        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double getVolume() {
        return preco * quantidade;
    }

    public Calendar getData() {
        return (Calendar) this.data.clone();
    }
}
