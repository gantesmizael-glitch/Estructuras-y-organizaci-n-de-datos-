/*
 * FJMP-EDU @ 2026
 * Problema: Contains Duplicate
 * Metodo: 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;



public class ContainsFacil {

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
        HashSet<Integer> vistos = new HashSet<>();

        for (int numero : numeros) {
            if (vistos.contains(numero)) {
                System.out.println(true);
                return;
            }

            vistos.add(numero);
        }

        System.out.println(false);
    }

    public static void main(String[] args) {
        ContainsFacil id = new ContainsFacil();
        id.leerDatos();
        id.resuelve();
    }
} {

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
        HashSet<Integer> vistos = new HashSet<>();

        for (int numero : numeros) {
            if (vistos.contains(numero)) {
                System.out.println(true);
                return;
            }

            vistos.add(numero);
        }

        System.out.println(false);
    }

    public static void main(String[] args) {
        ContaisDuplicate id = new ContaisDuplicate();
        id.leerDatos();
        id.resuelve();
    }
}