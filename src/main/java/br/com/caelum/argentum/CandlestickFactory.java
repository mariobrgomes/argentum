package br.com.caelum.argentum;

import java.util.Calendar;
import java.util.List;

/**
 * Created by 964456 on 22/07/2015.
 */
public class CandlestickFactory {

    public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes) {
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        double volume = 0;

        if (negociacoes.isEmpty()) {
            minimo = 0.0;
            maximo = 0.0;
        } else if (negociacoes.size() == 1) {
            minimo = negociacoes.get(0).getPreco();
            maximo = negociacoes.get(0).getPreco();
        }

        for (Negociacao negociacao : negociacoes) {
            volume += negociacao.getVolume();

            if (negociacao.getPreco() > maximo) {
                maximo = negociacao.getPreco();
            } else if (negociacao.getPreco() < minimo) {
                minimo = negociacao.getPreco();
            }
        }

        double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
        double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size() - 1).getPreco();

        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }
}
