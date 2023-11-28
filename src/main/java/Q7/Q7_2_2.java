import java.io.*;

public class Q7_2_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 配列と変数の宣言 */
        int[] arrayCrit = { 80,65,50,0 };
        String[] arrayEvalu = { "優","良","可","不可","" };
        int i;

        /* 点数の入力 */
        System.out.print("点数(0-100)>");
        int score = Integer.parseInt(br.readLine());

        /* 評価の判定と表示 */
        for (i = 0; i < arrayCrit.length; i++) {
            if (arrayCrit[i] <= score) {
                break;
            }
        }
        System.out.println(arrayEvalu[i]);
    }
}
