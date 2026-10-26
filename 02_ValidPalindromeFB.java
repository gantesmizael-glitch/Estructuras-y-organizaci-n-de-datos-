import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 02_ValidPalindromeFB {
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
    String texto;
    public void leerDatos() { texto = reader.nextLine(); if (texto == null) texto = ""; }
    public void resuelve() {
        String limpio = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) limpio += Character.toLowerCase(c);
        }
        boolean palindromo = true;
        for (int i = 0; i < limpio.length() / 2; i++) {
            if (limpio.charAt(i) != limpio.charAt(limpio.length() - 1 - i)) { palindromo = false; break; }
        }
        System.out.println(palindromo);
    }
    public static void main(String[] args) {
        02_ValidPalindromeFB programa = new 02_ValidPalindromeFB();
        programa.leerDatos();
        programa.resuelve();
    }
}
