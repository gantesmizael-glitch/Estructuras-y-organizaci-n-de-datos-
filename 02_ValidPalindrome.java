import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidPalindrome {
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

    public void leerDatos() {
        s = reader.nextLine();
        if (s == null) s = "";
    }

    public void resuelve() {
        int izquierda = 0, derecha = s.length() - 1;

        while (izquierda < derecha) {
            while (izquierda < derecha && !Character.isLetterOrDigit(s.charAt(izquierda))) izquierda++;
            while (izquierda < derecha && !Character.isLetterOrDigit(s.charAt(derecha))) derecha--;

            if (Character.toLowerCase(s.charAt(izquierda)) !=
                Character.toLowerCase(s.charAt(derecha))) {
                System.out.println("false");
                return;
            }
            izquierda++;
            derecha--;
        }
        System.out.println("true");
    }
    public static void main(String[] args) {
        ValidPalindrome programa = new ValidPalindrome();
        programa.leerDatos();
        programa.resuelve();
    }
}
