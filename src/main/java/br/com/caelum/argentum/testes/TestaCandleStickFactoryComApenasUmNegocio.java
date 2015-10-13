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
public class TestaCandleStickFactoryComApenasUmNegocio {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();

        Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);

        List<Negociacao> negociacoes = Arrays.asList(negociacao1);

        CandlestickFactory factory = new CandlestickFactory();
        Candlestick candle = factory.constroiCandleParaData(hoje, negociacoes);

        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());
    }
}
