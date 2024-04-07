package BackJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = -1;
        if (N % 5 == 0) {
            result = N / 5;
        } else if (N % 5 == 3) {
            int temp = 0;
            result = N / 5;
            temp = N - (result * 5);
            result += temp / 3;
        } else if (N % 3 == 0) {
            result = N / 3;
        }
        for (int i = 1; i <= N / 5; i++) {
            if ((N - 5 * i) % 3 == 0) {
                int temp = 0;
                temp = N - 5 * i;
                result = temp / 3 + i;
            }
        }

        System.out.println(result);
    }
}