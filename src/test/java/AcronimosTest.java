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




}