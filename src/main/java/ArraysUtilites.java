public class ArraysUtilites {
    /**
     * @param c letra a buscar
     * @param v array que contiene letras
     * @return true si el char está en el array
     */

    public static boolean buscaCaracterenArray(char c, char[] v) {//METODO PARA BUSCAR
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
