package br.com.caelum.argentum;

import org.junit.Test;

import java.util.Calendar;

/**
 * Created by mario on 13/10/2015.
 */
public class CandlestickTest {

    @Test(expected = IllegalArgumentException.class)
    public void precoMaximoNaoPodeSerMenorQueMinimo() {
        new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void dataNaoPodeSerNula() {
        new Candlestick(10, 10, 9, 10, 100, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valorNaoPodeSerNegativo() {
        new Candlestick(-1, -2, -3, -2, -100, Calendar.getInstance());
    }
}