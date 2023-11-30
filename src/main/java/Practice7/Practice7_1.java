import java.io.*;

public class Practice7_1 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        /* 変数の宣言 */
        int hitNumber;                                      //当てる数
        int number;                                         //入力する数
        int count = 0;                                        //入力回数カウンタ

        hitNumber = (int)(Math.random()*100);   //乱数で当たりの数を設定
        System.out.println("数当てゲーム(0~99までの数字です)");
        System.out.println("何回で当てられるか挑戦してください");

        /* 当たるまでループを繰り返す */
        while (true) {
            /* 数の入力 */
            System.out.print("数:>");
            number = Integer.parseInt(br.readLine());
            count++;

            /* 当たりの判定 */
            if (number > hitNumber) {           //大き過ぎたとき
                System.out.println(number + "より小さい値です");
            } else if (number < hitNumber) {    //小さ過ぎたとき
                System.out.println(number + "より大きい値です");
            } else {                            //一致したとき
                System.out.println(number + "で当たりです");
                break;
            }
        }
        System.out.println("数を当てるまでに入力した回数は " + count + "回 でした");
        System.out.println("---プログラム終了---");
    }
}
