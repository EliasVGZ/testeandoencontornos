import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void calcularDivision() throws Exception {

        Division division = new Division();
        double resultado1 = division.calcularDivision(10, 2);
        double resultado2 = division.calcularDivision(1500, 3);

        //ASSERT
        double resultadoEsperado1 = 5;
        assertEquals(resultadoEsperado1, resultado1);
        double resultadoEsperado2 = 500;
        assertEquals(resultadoEsperado2, resultado2);

    }
}