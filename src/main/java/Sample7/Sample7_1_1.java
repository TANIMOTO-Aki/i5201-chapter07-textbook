import java.io.*;

public class Sample7_1_1 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        /* nの入力（nは０以上１２以下の値 */
        System.out.print("n(0-12)>");
        int n = Integer.parseInt(br.readLine());

        /* 変数の宣言 */
        int i = 0;                                      //カウンタ
        int factrial = 1;                               //階乗

        do {
            i++;
            factrial *= i;                              //①
        } while (i < n) ;                               //②

        System.out.println(n + "!=" + factrial);
    }
}
/* プログラムの説明
 * 
 * <nが0より大きい場合(n=5とする)>
 * ①　factorial(値:1)にiの値(値:1)を乗じる
 * ②　iが１のとき、i<5でtrueが返ってdo文へ戻って繰り返す
 *    iが4までは繰り返すが、iが5になると、i<5でfalseになり、ループを終了する
 * 
 * <nが0の場合>
 * ①　factorial(値:1)にiの値(値:1)を乗じる
 * ②　iが1のとき、1<0でfalseが返って、ループを終了する
 * 　 処理を1回実行してから終了することになる
 */