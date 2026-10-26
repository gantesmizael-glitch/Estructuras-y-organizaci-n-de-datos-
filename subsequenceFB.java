/*
 * FJMP-EDU @ 2026
 * Problema: Is Subsequence
 * Metodo: Fuerza bruta recursiva
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subsequenceFB {

    String s, t;
    FastReader reader = new FastReader();

    static class FastReader {
        BufferedReader b = new BufferedReader(
                new InputStreamReader(System.in));

        String nextLine() {
            try {
                return b.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void leerDatos() {
        s = reader.nextLine();
        t = reader.nextLine();
    }

    public boolean buscar(int i, int j) {
        if (i == s.length()) {
            return true;
        }

        if (j == t.length()) {
            return false;
        }

        if (s.charAt(i) == t.charAt(j)) {
            if (buscar(i + 1, j + 1)) {
                return true;
            }
        }

        return buscar(i, j + 1);
    }

    public void resuelve() {
        System.out.println(buscar(0, 0));
    }

    public static void main(String[] args) {
        subsequenceFB id = new subsequenceFB();
        id.leerDatos();
        id.resuelve();
    }
}