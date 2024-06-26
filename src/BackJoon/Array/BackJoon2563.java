package BackJoon.Array;

import java.io.*;
import java.util.StringTokenizer;

public class BackJoon2563 {
    public static void main(String[] args) throws IOException {

        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer = 0;
        //도화지 영역 배열
        boolean[][] check = new boolean[101][101];
        //색종이 붙이기 진행
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //색종이 영역 boolean[][] = true 설정
            for(int j=y;j<y+10;j++){
                for(int s = x;s<x+10;s++)
                    check[j][s] = true;
            }
        }
        //도화지 배열 true의 개수 구하기
        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++)
                if(check[i][j])	//true일 때
                    answer++;
        }
        bw.write(answer + "");	//영역의 넓이 BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}