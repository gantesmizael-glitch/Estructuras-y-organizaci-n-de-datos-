import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumAverageSubarrayI {
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
    int k;

    public void leerDatos() {
        int n = reader.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = reader.nextInt();
        k = reader.nextInt();
    }

    public void resuelve() {
        long suma = 0;
        for (int i = 0; i < k; i++) suma += nums[i];

        long maxSuma = suma;
        for (int i = k; i < nums.length; i++) {
            suma += nums[i] - nums[i - k];
            maxSuma = Math.max(maxSuma, suma);
        }
        System.out.println((double) maxSuma / k);
    }
    public static void main(String[] args) {
        MaximumAverageSubarrayI programa = new MaximumAverageSubarrayI();
        programa.leerDatos();
        programa.resuelve();
    }
}
