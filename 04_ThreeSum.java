import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeSum {
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
    int[] nums;

    public void leerDatos() {
        int n = reader.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = reader.nextInt();
    }

    public void resuelve() {
        java.util.Arrays.sort(nums);
        java.util.List<String> resultados = new java.util.ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int izquierda = i + 1, derecha = nums.length - 1;

            while (izquierda < derecha) {
                long suma = (long) nums[i] + nums[izquierda] + nums[derecha];
                if (suma == 0) {
                    resultados.add("[" + nums[i] + ", " + nums[izquierda] + ", " + nums[derecha] + "]");
                    int valorIzq = nums[izquierda], valorDer = nums[derecha];
                    while (izquierda < derecha && nums[izquierda] == valorIzq) izquierda++;
                    while (izquierda < derecha && nums[derecha] == valorDer) derecha--;
                } else if (suma < 0) {
                    izquierda++;
                } else {
                    derecha--;
                }
            }
        }
        System.out.println(resultados);
    }
    public static void main(String[] args) {
        ThreeSum programa = new ThreeSum();
        programa.leerDatos();
        programa.resuelve();
    }
}
