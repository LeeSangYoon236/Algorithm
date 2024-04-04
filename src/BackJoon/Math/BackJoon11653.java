package BackJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11653 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        br.close();

        if(N == 1){
            return;
        }

        for(int i = 2; i <= N; i++){
            while(N%i == 0){
                N /= i;
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}