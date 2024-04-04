package BackJoon.Math;

import java.io.*;
import java.util.StringTokenizer;

public class BackJoon2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        count = (int) Math.ceil((double)(target - down) / (double)(up - down));

        br.close();
        System.out.println(count);
    }
}