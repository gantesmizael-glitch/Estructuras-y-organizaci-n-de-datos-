import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 05_ContainerWithMostWaterFB {
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
    int[] height;
    public void leerDatos() { int n = reader.nextInt(); height = new int[n]; for (int i = 0; i < n; i++) height[i] = reader.nextInt(); }
    public void resuelve() {
        int mayorAgua = 0;
        for (int i = 0; i < height.length; i++) for (int j = i + 1; j < height.length; j++) {
            int agua = (j - i) * Math.min(height[i], height[j]);
            if (agua > mayorAgua) mayorAgua = agua;
        }
        System.out.println(mayorAgua);
    }
    public static void main(String[] args) {
        05_ContainerWithMostWaterFB programa = new 05_ContainerWithMostWaterFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
