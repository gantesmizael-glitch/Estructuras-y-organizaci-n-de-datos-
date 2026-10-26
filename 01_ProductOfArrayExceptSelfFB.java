import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 01_ProductOfArrayExceptSelfFB {
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
    int[] nums;
    public void leerDatos() {
        int n = reader.nextInt(); nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = reader.nextInt();
    }
    public void resuelve() {
        int[] respuesta = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int producto = 1;
            for (int j = 0; j < nums.length; j++) if (i != j) producto *= nums[j];
            respuesta[i] = producto;
        }
        System.out.print("[");
        for (int i = 0; i < respuesta.length; i++) { if (i > 0) System.out.print(", "); System.out.print(respuesta[i]); }
        System.out.println("]");
    }
    public static void main(String[] args) {
        01_ProductOfArrayExceptSelfFB programa = new 01_ProductOfArrayExceptSelfFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
