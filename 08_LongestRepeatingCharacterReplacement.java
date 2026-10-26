import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestRepeatingCharacterReplacement {
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
    String s;
    int k;

    public void leerDatos() {
        s = reader.next();
        k = reader.nextInt();
    }

    public void resuelve() {
        int[] frecuencia = new int[26];
        int izquierda = 0, maxFrecuencia = 0, mejor = 0;

        for (int derecha = 0; derecha < s.length(); derecha++) {
            int indice = s.charAt(derecha) - 'A';
            frecuencia[indice]++;
            maxFrecuencia = Math.max(maxFrecuencia, frecuencia[indice]);

            while ((derecha - izquierda + 1) - maxFrecuencia > k) {
                frecuencia[s.charAt(izquierda) - 'A']--;
                izquierda++;
            }
            mejor = Math.max(mejor, derecha - izquierda + 1);
        }
        System.out.println(mejor);
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement programa = new LongestRepeatingCharacterReplacement();
        programa.leerDatos();
        programa.resuelve();
    }
}
