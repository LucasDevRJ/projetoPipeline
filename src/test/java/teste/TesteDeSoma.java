package teste;

import com.github.lucasdevrj.aplicacao.Soma;
import org.junit.Assert;
import org.junit.Test;

public class TesteDeSoma {

    @Test
    public void testeSoma() {
        Soma soma = new Soma();
        double resultado = soma.soma(1.0, 1.0);
        Assert.assertEquals(resultado, 2.0, 0);
    }

}
