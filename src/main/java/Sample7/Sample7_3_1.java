import java.io.*;

public class Sample7_3_1 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */    
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 順位の入力と変数宣言 */
        System.out.print("順位(1-3)>");
        int rank = Integer.parseInt(br.readLine());
        String medal = "";
        /* 順位の判定 */
        switch (rank) {                                 //①
        case 1:                                         //②
            medal = "金メダル";                         //③
            break;                                      //④
        case 2:
            medal = "銀メダル";
            break;
        case 3:
            medal = "銅メダル";
            break;
        default:                                        //⑤
            medal = "メダルなし:" + rank;
            break;
        }
        System.out.println(medal);                      //⑥
    }
}
/* 
 * プログラムの説明
 * ①変数rankを判定し、その値と一致するcaseラベルに分岐する
 * ②変数rankの値が１の場合に、分岐してくる
 * ③変数medalに該当する副賞（メダル）の文字列を代入する
 * ④このbreak文でswitch文のコードブロックを抜け出し、⑥の処理へ進む
 * ⑤どのcaseラベルにも一致しなければ、このdefaultラベルに分岐する
 * ⑥変数medalの内容を表示する
 */