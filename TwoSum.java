/*
*   FJMP-EDU @ 2026
*   Plantilla de configuración ICPC java
*   Problema: Two Sum (#1)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    int n;
    int target;
    int[] nums;
    FastReader reader = new FastReader();

    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(
                new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreTokens()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public void leerDatos() {
        n = reader.nextInt();
        nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = reader.nextInt();
        }

        target = reader.nextInt();
    }

    public void resuelve() {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                System.out.println(
                    mapa.get(complemento) + " " + i);
                return;
            }

            mapa.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        twoSum id = new twoSum();
        id.leerDatos();
        id.resuelve();
    }
}
