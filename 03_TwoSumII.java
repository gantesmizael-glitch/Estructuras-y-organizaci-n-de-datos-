import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoSumII {
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
    int[] numbers;
    int target;

    public void leerDatos() {
        int n = reader.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = reader.nextInt();
        target = reader.nextInt();
    }

    public void resuelve() {
        int izquierda = 0, derecha = numbers.length - 1;

        while (izquierda < derecha) {
            int suma = numbers[izquierda] + numbers[derecha];
            if (suma == target) {
                System.out.println("[" + (izquierda + 1) + ", " + (derecha + 1) + "]");
                return;
            } else if (suma < target) {
                izquierda++;
            } else {
                derecha--;
            }
        }
        System.out.println("No se encontró una pareja.");
    }
    public static void main(String[] args) {
        TwoSumII programa = new TwoSumII();
        programa.leerDatos();
        programa.resuelve();
    }
}
