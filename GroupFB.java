/*
 * FJMP-EDU @ 2026
 * Problema: Group Anagrams
 * Metodo: Fuerza bruta
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GroupFB {

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

    public boolean esAnagrama(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        boolean[] usada = new boolean[b.length()];

        for (int i = 0; i < a.length(); i++) {
            boolean encontrada = false;

            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j) && !usada[j]) {
                    usada[j] = true;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                return false;
            }
        }

        return true;
    }

    public void resuelve() {
        List<List<String>> grupos = new ArrayList<>();
        boolean[] agrupada = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (agrupada[i]) {
                continue;
            }

            List<String> grupo = new ArrayList<>();
            grupo.add(palabras[i]);
            agrupada[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!agrupada[j]
                        && esAnagrama(palabras[i], palabras[j])) {
                    grupo.add(palabras[j]);
                    agrupada[j] = true;
                }
            }

            grupos.add(grupo);
        }

        System.out.println(grupos);
    }

    public static void main(String[] args) {
        GroupFB id = new GroupFB();
        id.leerDatos();
        id.resuelve();
    }
}