package org.example;

/**
 * clase con funciones matematicas
 */


public final class Mates {

    /**
     *
     * @param dividendo
     * @param divisor
     * @return el cociente
     * @throws Exception
     */

    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) throw (new Exception("Error. El divisor no puede ser 0."));
        float resultado = dividendo / divisor;
        return resultado;
    }

    /**
     *
     * @param cadena
     * @return elacronimo
     */


    public static String obtenerAcronimo(String cadena) {
        String resultado = "";
        char caracter;
        int n = cadena.length();
        for (int i = 0; i < n; i++) {
            caracter = cadena.charAt(i);
            if (caracter != ' ')
                if (i == 0) resultado = resultado + caracter + '.';
                else if (cadena.charAt(i - 1) == ' ') resultado = resultado + caracter + '.';
        }
        return resultado;
    }

    /**
     *
     * @param n
     * @return la multiplicacion del 1 hasta n
     * @throws Exception
     */

    public static float factorial(byte n) throws Exception {
        if (n < 0) throw new Exception("Error. El número tiene que ser >=0");
        float resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }

    /**
     *
     *
     * @param c
     * @param v
     * @return true si el char está en el array
     */

    public static boolean busca(char c, char[] v) {//METODO PARA BUSCAR
        int a, z, m;
        a = 0;
        z = v.length - 1;
        boolean resultado = false;
        while (a <= z && resultado == false) {
            m = (a + z) / 2;
            if (v[m] == c) resultado = true;
            else if (v[m] < c) a = m + 1;
            else z = m - 1;
        }
        return resultado;
    }


}
