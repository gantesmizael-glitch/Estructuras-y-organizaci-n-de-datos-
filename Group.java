/*
 * FJMP-EDU @ 2026
 * Problema: Group Anagrams
 * Metodo: 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Group {

    int n;
    String[] palabras;
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
        palabras = new String[n];

        for (int i = 0; i < n; i++) {
            palabras[i] = reader.next();
        }
    }

    public void resuelve() {
        Map<String, List<String>> grupos = new HashMap<>();

        for (String palabra : palabras) {
            char[] letras = palabra.toCharArray();
            Arrays.sort(letras);

            String clave = new String(letras);

            grupos.putIfAbsent(clave, new ArrayList<>());
            grupos.get(clave).add(palabra);
        }

        System.out.println(grupos.values());
    }

    public static void main(String[] args) {
        Group id = new Group();
        id.leerDatos();
        id.resuelve();
    }
}