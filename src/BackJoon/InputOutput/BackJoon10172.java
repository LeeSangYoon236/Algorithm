package BackJoon.InputOutput;

import java.io.IOException;

public class BackJoon10172 {
    public static void main(String[] args) throws IOException {
        //아래 예제와 같이 개를 출력하시오.
        /*
        |\_/|
        |q p|   /}
        ( 0 )"""\
        |"^"`    |
        ||_/=\\__|

        */
        String str = "|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|\n";
        System.out.println(str);
    }
}