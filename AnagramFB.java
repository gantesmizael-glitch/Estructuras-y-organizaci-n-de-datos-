/*
 * FJMP-EDU @ 2026
 * Problema: Valid Anagram
 * Metodo: Fuerza bruta
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnagramFB {

    String palabra1, palabra2;
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

        String nextLine() {
            try {
                s = null;
                return b.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void leerDatos() {
        palabra1 = reader.nextLine().replaceAll("\\s+", "")
                .toLowerCase();
        palabra2 = reader.nextLine().replaceAll("\\s+", "")
                .toLowerCase();
    }

    public void resuelve() {
        if (palabra1.length() != palabra2.length()) {
            System.out.println(false);
            return;
        }

        boolean[] usada = new boolean[palabra2.length()];

        for (int i = 0; i < palabra1.length(); i++) {
            boolean encontrada = false;

            for (int j = 0; j < palabra2.length(); j++) {
                if (palabra1.charAt(i) == palabra2.charAt(j)
                        && !usada[j]) {
                    usada[j] = true;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }

    public static void main(String[] args) {
        AnagramFB id = new AnagramFB();
        id.leerDatos();
        id.resuelve();
    }
}