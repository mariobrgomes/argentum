package br.com.caelum.argentum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by mario on 13/10/2015.
 */
public class NegocioTest {

    @Test
    public void dataDoNegocioEhImutavel() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_MONTH, 15);

        Negociacao n = new Negociacao(10, 5, c);

        n.getData().set(Calendar.DAY_OF_MONTH, 20);

        Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoCriaNegocioComDataNula() {
        new Negociacao(10, 5, null);
    }
}
