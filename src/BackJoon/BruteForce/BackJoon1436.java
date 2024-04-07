package BackJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 666;
        int count = 1;

        while(count != N) {
            result++;
            if(String.valueOf(result).contains("666")) {
                count++;
            }
        }
        System.out.println(result);
    }
}