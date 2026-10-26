import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 04_ThreeSumFB {
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
    public void leerDatos() { int n = reader.nextInt(); nums = new int[n]; for (int i = 0; i < n; i++) nums[i] = reader.nextInt(); }
    public void resuelve() {
        java.util.ArrayList<String> resultados = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) for (int j = i + 1; j < nums.length; j++) for (int k = j + 1; k < nums.length; k++) {
            if (nums[i] + nums[j] + nums[k] == 0) {
                int[] trio = {nums[i], nums[j], nums[k]}; java.util.Arrays.sort(trio);
                String combinacion = "[" + trio[0] + ", " + trio[1] + ", " + trio[2] + "]";
                if (!resultados.contains(combinacion)) resultados.add(combinacion);
            }
        }
        System.out.println(resultados);
    }
    public static void main(String[] args) {
        04_ThreeSumFB programa = new 04_ThreeSumFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
