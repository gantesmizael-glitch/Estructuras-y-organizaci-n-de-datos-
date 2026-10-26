import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 07_BestTimeToBuyAndSellStockFB {
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
    int[] prices;
    public void leerDatos() { int n = reader.nextInt(); prices = new int[n]; for (int i = 0; i < n; i++) prices[i] = reader.nextInt(); }
    public void resuelve() {
        int mayorGanancia = 0;
        for (int i = 0; i < prices.length; i++) for (int j = i + 1; j < prices.length; j++) {
            int ganancia = prices[j] - prices[i]; if (ganancia > mayorGanancia) mayorGanancia = ganancia;
        }
        System.out.println(mayorGanancia);
    }
    public static void main(String[] args) {
        07_BestTimeToBuyAndSellStockFB programa = new 07_BestTimeToBuyAndSellStockFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
