package BackJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon5086 {
    public static void main(String[] args) throws IOException {

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==b) {
                break;
            }

            if(b%a == 0) {
                sb.append(f);
            } else if (a%b == 0) {
                sb.append(m);
            } else {
                sb.append(n);
            }
        }

        br.close();
        System.out.println(sb);
    }
}