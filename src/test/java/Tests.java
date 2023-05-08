import org.example.Mates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {


    Mates division = new Mates();

    @Test
    void obtenerAcronimo() {

        String cadena1 = "Sistema Gestión Base Datos";
        String cadena2 = "Servicio Mensajería Instantánea";

        String resultado1 = Mates.obtenerAcronimo(cadena1);
        String resultado2 = division.obtenerAcronimo(cadena2);

        //ASSERT
        String resultadoEsperado1 = "S.G.B.D.";
        String resultadoEsperado2 = "S.M.I.";
        assertEquals(resultadoEsperado1, resultado1);
        assertEquals(resultadoEsperado2, resultado2);

    }
    @Test
    void calcularDivision() throws Exception {


        double resultado1 = Mates.calcularDivision(10, 2);
        double resultado2 = division.calcularDivision(1500, 3);

        //ASSERT
        double resultadoEsperado1 = 5;
        assertEquals(resultadoEsperado1, resultado1);
        double resultadoEsperado2 = 500;
        assertEquals(resultadoEsperado2, resultado2);

    }
    @Test
    void factorial() throws Exception {

        Mates factorial = new Mates();
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

        Mates buscar = new Mates();
        char[] v = {'a', 'b', 'd', 'e', 'f', 'g'};
        char c1 = 'd';
        char c2 = 'c';

        boolean resultado1 = ArraysUtilites.buscaCaracterenArray(c1, v);
        boolean resultado2 = ArraysUtilites.buscaCaracterenArray(c2, v);

        assertTrue(resultado1);
        assertFalse(resultado2);
    }
}