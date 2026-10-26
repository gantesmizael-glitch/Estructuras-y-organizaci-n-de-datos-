import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 08_LongestRepeatingCharacterReplacementFB {
    static class FastReader {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        String next() {
            while (s == null || !s.hasMoreTokens()) {
                try { String linea = b.readLine(); if (linea == null) return null; s = new StringTokenizer(linea); }
                catch (IOException e) { throw new RuntimeException(e); }
            }
            return s.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        String nextLine() { try { s = null; return b.readLine(); } catch (IOException e) { throw new RuntimeException(e); } }
    }
    FastReader reader = new FastReader();
    String s; int k;
    public void leerDatos() { s = reader.next(); k = reader.nextInt(); }
    public void resuelve() {
        int mayorLongitud = 0;
        for (int inicio = 0; inicio < s.length(); inicio++) {
            int[] frecuencia = new int[26]; int frecuenciaMayor = 0;
            for (int fin = inicio; fin < s.length(); fin++) {
                frecuencia[s.charAt(fin) - 'A']++;
                if (frecuencia[s.charAt(fin) - 'A'] > frecuenciaMayor) frecuenciaMayor = frecuencia[s.charAt(fin) - 'A'];
                int longitud = fin - inicio + 1;
                if (longitud - frecuenciaMayor <= k && longitud > mayorLongitud) mayorLongitud = longitud;
            }
        }
        System.out.println(mayorLongitud);
    }
    public static void main(String[] args) {
        08_LongestRepeatingCharacterReplacementFB programa = new 08_LongestRepeatingCharacterReplacementFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
