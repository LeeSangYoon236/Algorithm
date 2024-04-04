package BackJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon9506 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String not = " is NOT perfect.";
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());

            if(n == -1) {
                break;
            }

            ArrayList<Integer> divisor = new ArrayList<Integer>();

            for(int i=1; i<n; i++) {
                if(n%i == 0) {
                    divisor.add(i);
                }
            }
            int temp = 0;
            for (int i : divisor) {
                temp+=i;
            }
            if(temp == n) {
                System.out.print(n + " = ");
                for(int i=0; i<divisor.size(); i++) {
                    if(divisor.size()-1 == i) {
                        System.out.println(divisor.get(i));
                    } else {
                        System.out.print(divisor.get(i) + " + ");
                    }
                }
            } else {
                System.out.println(n + not);
            }
        }

        br.close();
    }
}