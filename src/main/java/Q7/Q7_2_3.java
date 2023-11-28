public class Q7_2_3 {
    public static void main(String[] args) {
        /* 配列と変数の宣言 */
        int[] arraySco1 = {80,90,-1,76,77,-1,86,75,61,73,66};
        int[] arraySco2 = new int[arraySco1.length];

        /* arraySco1の要素回数ループ */
        int idx2 = 0;                           //コピー先の指標
        for (int idx1 = 0; idx1 < arraySco1.length; idx1++) {
            if (arraySco1[idx1] == -1) {        //欠席者の場合
                continue;                       //次のデータへ
            }
            arraySco2[idx2] = arraySco1[idx1];  //配列要素のコピー
            idx2++;                             //添字のカウントアップ
        }
        /* コピーした要素数回ループ */
        for (int idx1 = 0; idx1 < idx2; idx1++) {
            System.out.print(arraySco2[idx1] + "　");   //コピーデータの表示
        }
        System.out.println();
    }
}
