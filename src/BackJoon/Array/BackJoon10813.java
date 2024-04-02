package BackJoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon10813 {
    public static void main(String[] args) throws IOException {
        /* 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. */

        /* 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
                둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다. */
        /* 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] array = new int[a];
        while(st.hasMoreTokens()) {
            array[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int max = -1000001;
        int min = 1000001;

        for (int j : array) {
            if(max < j) {
                max = j;
            }
            if(min > j) {
                min = j;
            }
        }

        System.out.println(min + " " + max);
    }
}