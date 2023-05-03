import org.junit.Assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcronimosTest {



    @Test
    void obtenerAcronimo() {

        String cadena1 = "Sistema de Gestión de Base de Datos";
        String cadena2 = "Servicio de Mensajería Instantánea";
        Acronimos acronimo = new Acronimos();

        String resultado1 = "S.G.B.D.";
        String resultado2 = "S.M.I.";

        //ASSERT
        String resultadoEsperado1 = "S.G.B.D.";
        String resultadoEsperado2 = "S.M.I.";
        assertEquals(resultadoEsperado1, resultado1);
        assertEquals(resultadoEsperado2, resultado2);

    }
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
    @Test
    void busca() {

        OperacionArrays buscar = new OperacionArrays();
        char[] v = {'a', 'b', 'd', 'e', 'f', 'g'};
        char c1 = 'd';
        char c2 = 'c';

        boolean resultado1 = buscar.busca(c1, v);
        boolean resultado2 = buscar.busca(c2, v);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }
}