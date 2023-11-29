public class Sample7_3_3 {
    public enum Move {UP,DOWN,LEFT,RIGHT}               //①列挙型の宣言
    public static void main(String[] args) {
        Move move = Move.LEFT;                          //②

        switch(move) {                                  //③
            case UP:                                    //④
                System.out.println(move + ":上へ移動");
                break;
            case DOWN:                                  //⑤
                System.out.println(move + ":下へ移動");
                break;
            case LEFT:                                  //⑥
                System.out.println(move + ":左へ移動");
                break;
            case RIGHT:                                 //⑦
                System.out.println(move + ":右へ移動");
                break;
        }
    }
}
/*
 * プログラムの説明
 * ①列挙型のMoveを宣言し、UP、DOWN、LEFT、RIGHTの4つの列挙定数を定義する
 * 　これにより、ここで宣言した４つの列挙定数以外は、利用できなくなる
 * ②例として、列挙型Moveの変数moveにMove.LEFTで参照した値を代入する
 * ③switch文でmoveを判定する
 * ⑥LEFTへ分岐し、変数moveの値（LEFT)に文字列の":左へ移動"を連結して表示する
 * 　break文でswitch文のコードブロックを抜ける
 */