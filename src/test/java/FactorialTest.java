import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() throws Exception {

        Factorial factorial = new Factorial();
        byte n1 = 5;
        byte n2 = 0;
        byte n3 = 10;

        float resultado1;
        float resultado2;
        float resultado3;

        resultado1 = factorial.factorial(n1);
        resultado2 = factorial.factorial(n2);
        resultado3 = factorial.factorial(n3);

        //assert
        float resultadoEsperado1 = 120;
        float resultadoEsperado2 = 1;
        float resultadoEsperado3 = 3628800;

        assertEquals(resultadoEsperado1, resultado1);
        assertEquals(resultadoEsperado2, resultado2);
        assertEquals(resultadoEsperado3, resultado3);



    }
}