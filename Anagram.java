/*
 * FJMP-EDU @ 2026
 * Problema: Valid Anagram
 * Metodo: 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

    String palabra1, palabra2;
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
        palabra1 = reader.nextLine().replaceAll("\\s+", "")
                .toLowerCase();
        palabra2 = reader.nextLine().replaceAll("\\s+", "")
                .toLowerCase();
    }

    public void resuelve() {
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        System.out.println(Arrays.equals(letras1, letras2));
    }

    public static void main(String[] args) {
        Anagram id = new Anagram();
        id.leerDatos();
        id.resuelve();
    }
}