import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 06_MaximumAverageSubarrayIFB {
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
    int[] nums; int k;
    public void leerDatos() { int n = reader.nextInt(); nums = new int[n]; for (int i = 0; i < n; i++) nums[i] = reader.nextInt(); k = reader.nextInt(); }
    public void resuelve() {
        double mayorPromedio = -Double.MAX_VALUE;
        for (int inicio = 0; inicio <= nums.length - k; inicio++) {
            int suma = 0; for (int j = inicio; j < inicio + k; j++) suma += nums[j];
            double promedio = (double) suma / k; if (promedio > mayorPromedio) mayorPromedio = promedio;
        }
        System.out.println(mayorPromedio);
    }
    public static void main(String[] args) {
        06_MaximumAverageSubarrayIFB programa = new 06_MaximumAverageSubarrayIFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
