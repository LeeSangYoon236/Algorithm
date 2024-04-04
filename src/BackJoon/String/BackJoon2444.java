package BackJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2444 {
    public static void main(String[] args) throws IOException {
        /* 문제 : 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.*/

        /* 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. */
        /* 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int star = 1;
        for (int i=1; i<=N*2-1; i++) {
            if(i<N) {
                for(int j=1; j<=N-i; j++) {
                    System.out.print(" ");
                }
                for(int k=0; k<star; k++) {
                    System.out.print("*");
                }
                System.out.println();
                star+=2;
            } else {
                for(int j=N; j<i; j++) {
                    System.out.print(" ");
                }
                for(int k=0; k<star; k++) {
                    System.out.print("*");
                }
                if(i<N*2-1) {
                    System.out.println();
                }
                star-=2;
            }
        }
    }
}