import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void somaPositivos(){
        Calc c = new Calc();
        int soma = c.somar(3,4);
        Assertions.assertEquals(7, soma);
    }
}
