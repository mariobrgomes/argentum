package br.com.caelum.argentum.testes;

import br.com.caelum.argentum.Candlestick;
import br.com.caelum.argentum.CandlestickFactory;
import br.com.caelum.argentum.Negociacao;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mario on 13/10/2015.
 */
public class TestaCandlestickFactorySemNegocios {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();

        List<Negociacao> negociacoes = Arrays.asList();

        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);

        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());


    }
}
