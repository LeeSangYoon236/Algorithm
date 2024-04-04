package BackJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon2501 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> divisor = new ArrayList<Integer>();

        for (int i=1; i<= N; i++) {
            if(N%i == 0) {
                divisor.add(i);
            }
        }
        int result = 0;
        if (divisor.size() >= K) {
            result = divisor.get(K-1);
        }

        br.close();
        System.out.println(result);
    }
}