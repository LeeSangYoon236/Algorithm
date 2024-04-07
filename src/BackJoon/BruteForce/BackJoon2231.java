package BackJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int M = 0;
        if(N%2 !=0) {
            M = N/2 + 1;
        } else {
            M = N/2;
        }
        int result = 0;
        for (int i = M; i < N; i++) {
            int number = i;
            int sum = 0;
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum + i == N) {
                result = i;
                break;
            }

        }
        System.out.println(result);
    }
}