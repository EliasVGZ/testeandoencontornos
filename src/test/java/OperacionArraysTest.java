import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionArraysTest {

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