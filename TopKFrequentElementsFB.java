/*
 * FJMP-EDU @ 2026
 * Problema: Top K Frequent Elements
 * Metodo: Fuerza bruta
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class  TopKFrequentElementsFB {

    int n, k;
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

        k = reader.nextInt();
    }

    public void resuelve() {
        ArrayList<Integer> unicos = new ArrayList<>();
        ArrayList<Integer> frecuencias = new ArrayList<>();

        for (int numero : numeros) {
            if (!unicos.contains(numero)) {
                unicos.add(numero);
            }
        }

        for (int numero : unicos) {
            int frecuencia = 0;

            for (int otro : numeros) {
                if (numero == otro) {
                    frecuencia++;
                }
            }

            frecuencias.add(frecuencia);
        }

        for (int i = 0; i < unicos.size(); i++) {
            for (int j = i + 1; j < unicos.size(); j++) {
                if (frecuencias.get(j) > frecuencias.get(i)) {
                    int tempF = frecuencias.get(i);
                    frecuencias.set(i, frecuencias.get(j));
                    frecuencias.set(j, tempF);

                    int tempN = unicos.get(i);
                    unicos.set(i, unicos.get(j));
                    unicos.set(j, tempN);
                }
            }
        }

        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < k && i < unicos.size(); i++) {
            resultado.add(unicos.get(i));
        }

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        TopKFrequentElementsFB id = new  TopKFrequentElementsFB ();
        id.leerDatos();
        id.resuelve();
    }
}