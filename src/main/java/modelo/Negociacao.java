package modelo;

import lombok.Data;

import java.util.Calendar;

/**
 * Created by 964456 on 22/07/2015.
 */
@Data
public final class Negociacao {

    private final double preco;
    private final int quantidade;
    private final Calendar data;

    public double getVolume() {
        return preco * quantidade;
    }

}
