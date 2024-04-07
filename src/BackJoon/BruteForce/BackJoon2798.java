package BackJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BackJoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> array = new ArrayList<Integer>();

        while (st.hasMoreTokens()) {
            array.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> all = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = 0;
                    temp += array.get(i) + array.get(j) + array.get(k);
                    if (temp <= M) {
                        all.add(temp);
                    }
                }
            }
        }
            all.sort(Comparator.naturalOrder());


            System.out.println(all.get(all.size() - 1));

        }
    }