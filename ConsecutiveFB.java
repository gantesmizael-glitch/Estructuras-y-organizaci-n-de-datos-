/*
 * FJMP-EDU @ 2026
 * Problema: Longest Consecutive Sequence
 * Metodo: Fuerza bruta
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutiveFB {

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
        int mayorLongitud = 0;

        for (int numero : numeros) {
            int actual = numero;
            int longitud = 1;

            while (actual != Integer.MAX_VALUE) {
                int siguiente = actual + 1;
                boolean encontrado = false;

                for (int otro : numeros) {
                    if (otro == siguiente) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    longitud++;
                    actual = siguiente;
                } else {
                    break;
                }
            }

            if (longitud > mayorLongitud) {
                mayorLongitud = longitud;
            }
        }

        System.out.println(mayorLongitud);
    }

    public static void main(String[] args) {
        ConsecutiveFB id = new ConsecutiveFB();
        id.leerDatos();
        id.resuelve();
    }
}