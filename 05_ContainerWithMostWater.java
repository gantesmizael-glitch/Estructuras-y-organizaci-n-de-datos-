import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContainerWithMostWater {
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
    int[] height;

    public void leerDatos() {
        int n = reader.nextInt();
        height = new int[n];
        for (int i = 0; i < n; i++) height[i] = reader.nextInt();
    }

    public void resuelve() {
        int izquierda = 0, derecha = height.length - 1;
        int maxAgua = 0;

        while (izquierda < derecha) {
            int ancho = derecha - izquierda;
            int altura = Math.min(height[izquierda], height[derecha]);
            maxAgua = Math.max(maxAgua, ancho * altura);

            if (height[izquierda] < height[derecha]) izquierda++;
            else derecha--;
        }
        System.out.println(maxAgua);
    }
    public static void main(String[] args) {
        ContainerWithMostWater programa = new ContainerWithMostWater();
        programa.leerDatos();
        programa.resuelve();
    }
}
