/*
 * FJMP-EDU @ 2026
 * Problema: Contains Duplicate
 * Metodo: Fuerza bruta
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContainsDuplicateBruta {

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
        boolean repetido = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                break;
            }
        }

        System.out.println(repetido);
    }

    public static void main(String[] args) {
        ContainsDuplicateBruta id = new ContainsDuplicateBruta();
        id.leerDatos();
        id.resuelve();
    }
}