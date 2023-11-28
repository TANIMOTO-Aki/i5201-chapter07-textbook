import java.io.*;

public class Sample7_2_1 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

                                                        //割引コード定数
        final char[] arrayDiscountCode = { 'S','A','C','E' };
                                                        //割引率の定数
        final double[] arrayDiscountRate = { 0.17,0.15,0.13,0.10 };
        int i;                                          //Index

        /* 割引コードの入力 */
        System.out.print("割引コード(S,A,C,E)>");
        char discountcode = br.readLine().charAt(0);    //①

        for (i = 0; i < arrayDiscountCode.length; i++) {      //②
            if (discountcode == arrayDiscountCode[i]) {       //③
                break;                                        //④
            }
        }
        if (i < arrayDiscountCode.length) {                   //⑤
            System.out.println(arrayDiscountRate[i]);         //⑥
        } else {                                              //⑦
            System.out.println("見つかりませんでした");
        }
    }
}
/*
 * プログラムの説明
 * ①コマンドライン引数の文字列から、文字列の先頭の文字（０番目）を取り出す
 * ②配列（割引コード）の要素を検索する
 * ③配列中のデータと一致するかを判定する
 * ④途中で見つかった場合、forループから抜け出す。for文の次の⑤へ制御が移る
 * ⑤最後まで探したかどうかを確認する
 * ⑥最後まで探していなければ、途中で見つかったことになり、「割引率」を表示する
 * ⑦最後まで探したのであれば、「見つかりませんでした」のメッセージを表示する
 */
