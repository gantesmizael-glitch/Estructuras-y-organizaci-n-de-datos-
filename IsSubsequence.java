/*
 * FJMP-EDU @ 2026
 * Problema: Is Subsequence
 * Metodo: Dos punteros
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsSubsequence {

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

    public void resuelve() {
        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (i < s.length()
                    && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        System.out.println(i == s.length());
    }

    public static void main(String[] args) {
        IsSubsequence id = new IsSubsequence();
        id.leerDatos();
        id.resuelve();
    }
}