import java.io.*;

public class Sample7_3_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* Yes/Noの入力 */
        System.out.print("(y/n)>");
        char ans = br.readLine().charAt(0);     //①

        switch (ans) {
        case 'y' :                                    //②
            /* breakなし */
        case 'Y' :
            System.out.println("YES");              //③
            break;
        case 'n' :                                    //④
            /* breakなし */
        case 'N' :
            System.out.println("NO");               //⑤
            break;
        default :                                     //⑥
            break;
        }
    }
}
/* 
 * プログラムの説明
 * ①charAtメソッドで、入力文字列の1文字目を取得する
 * ②取得した文字が'y'（小文字）のときは、breakせずに③の処理へ進む
 * 　break文を省略する場合には、それをコメントで明示する
 * ③'y'（小文字）、または'Y'（大文字）のときに'YES'を表示する
 * 　次のbreak文でswitch文のコードブロックを抜ける
 * ④取得した文字が'n'（小文字）のときは、breakせずに③の処理へ進む
 * 　break文を省略する場合には、それをコメントで明示する
 * ⑤'n'（小文字）、または'N'（大文字）のときに'NO'を表示する
 * 　次のbreak文でswitch文のコードブロックを抜ける
 * ⑥どの値にも一致しない場合の処理はないが、defaultラベルとbreak文を明記した
 */