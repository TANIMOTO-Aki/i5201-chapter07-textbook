import java.io.*;

public class Sample7_2_2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        /* 配列と変数の宣言 */
        int [][] arrayHit = {{ 50,78 },                 //1等
                              { 86,94,14 },             //2等
                              { 16,99,63,83,48 },       //3等
                              { 57,89,75,59,74 }};      //4等
        int hit = 0;                                    //当選等数
        /* くじ番号の入力 */
        System.out.print("くじ番号(0-99)>");
        int lot = Integer.parseInt(br.readLine());

        exitloop:                                       //①
        for (int i = 0; i < arrayHit.length; i++) {
            for (int j = 0; j < arrayHit[i].length; j++) {
                if (lot == arrayHit[i][j]) {
                    hit = i + 1;
                    break exitloop;                     //②
                }
            }
        }    // break exitloopを実行したあとは、ここに制御が移る
        if (0 < hit) {                                  //③
            System.out.println(hit + "等");
        } else {
            System.out.println("はずれ");
        }
    }
}
/* 
 * プログラムの説明
 * ①外側のループにラベルを設定する
 * ②ラベルを指定してbreakする
 * ③指定されたラベルの付いた外側のループを抜け出し、次の③から実行される
 */