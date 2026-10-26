 /*
 * FJMP-EDU @ 2026
 * Problema: Longest Consecutive Sequence
 * Metodo: 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Consecutive {

    int n;
    int[] numeros;
    FastReader reader = new FastReader();

    static class FastReader {
        BufferedReader b = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer s;

        String next() {
            while (s == null || !s.hasMoreTokens()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public void leerDatos() {
        n = reader.nextInt();
        numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = reader.nextInt();
        }
    }

    public void resuelve() {
        HashSet<Integer> conjunto = new HashSet<>();

        for (int numero : numeros) {
            conjunto.add(numero);
        }

        int mayorLongitud = 0;

        for (int numero : conjunto) {
            if (numero != Integer.MIN_VALUE
                    && conjunto.contains(numero - 1)) {
                continue;
            }

            int actual = numero;
            int longitud = 1;

            while (actual != Integer.MAX_VALUE
                    && conjunto.contains(actual + 1)) {
                actual++;
                longitud++;
            }

            if (longitud > mayorLongitud) {
                mayorLongitud = longitud;
            }
        }

        System.out.println(mayorLongitud);
    }

    public static void main(String[] args) {
        Consecutive id = new Consecutive();
        id.leerDatos();
        id.resuelve();
    }
}