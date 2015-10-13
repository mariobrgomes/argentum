/**
 * Created by mario on 13/10/2015.
 */
package br.com.caelum.argentum.reader;

import br.com.caelum.argentum.Candlestick;
import br.com.caelum.argentum.CandlestickFactory;
import br.com.caelum.argentum.Negociacao;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class CandlestickFactoryTest {

    @Test
    public void sequenciaSimplesDeNegocios() {
        Calendar hoje = Calendar.getInstance();

        Negociacao negocio1 = new Negociacao(40.5, 100, hoje);
        Negociacao negocio2 = new Negociacao(45.0, 100, hoje);
        Negociacao negocio3 = new Negociacao(39.8, 100, hoje);
        Negociacao negocio4 = new Negociacao(42.3, 100, hoje);

        List<Negociacao> negocios = Arrays.asList(negocio1, negocio2, negocio3, negocio4);

        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);

        Assert.assertEquals(40.5, candle.getAbertura(), 0.00001);
        Assert.assertEquals(42.3, candle.getFechamento(), 0.00001);
        Assert.assertEquals(39.8, candle.getMinimo(), 0.00001);
        Assert.assertEquals(45.0, candle.getMaximo(), 0.00001);
        Assert.assertEquals(16760.0, candle.getVolume(), 0.00001);
    }

    @Test
    public void semNegociosGeraCandleComZeros() {
        Calendar hoje = Calendar.getInstance();

        List<Negociacao> negocios = Arrays.asList();

        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);

        Assert.assertEquals(0.0, candle.getAbertura(), 0.00001);
        Assert.assertEquals(0.0, candle.getFechamento(), 0.00001);
        Assert.assertEquals(0.0, candle.getMinimo(), 0.00001);
        Assert.assertEquals(0.0, candle.getMaximo(), 0.00001);
        Assert.assertEquals(0.0, candle.getVolume(), 0.00001);
    }

    @Test
    public void apenasUmNegocioGeraCandleComValoresIguais() {
        Calendar hoje = Calendar.getInstance();

        Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);

        List<Negociacao> negocios = Arrays.asList(negociacao1);

        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);

        Assert.assertEquals(40.5, candle.getAbertura(), 0.00001);
        Assert.assertEquals(40.5, candle.getFechamento(), 0.00001);
        Assert.assertEquals(40.5, candle.getMinimo(), 0.00001);
        Assert.assertEquals(40.5, candle.getMaximo(), 0.00001);
        Assert.assertEquals(4050.0, candle.getVolume(), 0.00001);
    }
}
