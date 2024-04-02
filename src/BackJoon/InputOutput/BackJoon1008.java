package BackJoon.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1008 {
    public static void main(String[] args) throws IOException {
        // 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        // 첫째 줄에 A-B를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println((double)a/(double)b);

    }
}