import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestTimeToBuyAndSellStock {
    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine() {
            try {
                st = null;
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    FastReader reader = new FastReader();
    int[] prices;

    public void leerDatos() {
        int n = reader.nextInt();
        prices = new int[n];
        for (int i = 0; i < n; i++) prices[i] = reader.nextInt();
    }

    public void resuelve() {
        int precioMinimo = Integer.MAX_VALUE;
        int gananciaMaxima = 0;

        for (int precio : prices) {
            precioMinimo = Math.min(precioMinimo, precio);
            gananciaMaxima = Math.max(gananciaMaxima, precio - precioMinimo);
        }
        System.out.println(gananciaMaxima);
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock programa = new BestTimeToBuyAndSellStock();
        programa.leerDatos();
        programa.resuelve();
    }
}
