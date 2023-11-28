public class Sample7_2_3 {
    public static void main(String[] args) {
        /* 配列と変数の宣言 */
                                                        // 点数テーブル
        int[] arrayScore = { 10,20,30,-1,10,-1,18};
        int count = 0;                                  // 人数
        int total = 0;                                  // 合計点
        double average;                                 // 平均点

        for (int i = 0; i < arrayScore.length; i++) {   // ①
            if (arrayScore[i] < 0) {
                continue;                               // ②
            }
            total += arrayScore[i];                     // ③
            count++;                                    // ④
        }
        average = (double)total / count;
        System.out.println("平均=" + average);
    }
}
/* 
 * プログラムの説明
 * ① continue文によって制御が戻ったときも「ループ変数を更新して」、次のループ処理が実行される
 * ② 得点が-1であれば、集計プログラムの③④をスキップして①へ戻る
 */