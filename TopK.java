/*
 * FJMP-EDU @ 2026
 * Problema: Top K Frequent Elements
 * Metodo:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class TopK {

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
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int numero : numeros) {
            frecuencia.put(numero,
                    frecuencia.getOrDefault(numero, 0) + 1);
        }

        List<Integer> lista =
                new ArrayList<>(frecuencia.keySet());

        lista.sort(Comparator.comparingInt(
                (Integer x) -> frecuencia.get(x)).reversed());

        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < k && i < lista.size(); i++) {
            resultado.add(lista.get(i));
        }

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        TopK id = new TopK();
        id.leerDatos();
        id.resuelve();
    }
}