package BackJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BackJoon2581 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> pn = new ArrayList<Integer>();


        for(int i=M; i<=N; i++) {
            int temp = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    temp += 1;
                }
            }
            if(temp == 2) {
                pn.add(i);
            }
        }
        int sum = 0;
        for(int i : pn) {
            sum += i;
        }

        if(pn.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(pn.get(0));
        }

        br.close();
    }
}