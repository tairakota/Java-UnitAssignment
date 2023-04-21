public class StoneGame {

    public static void main(String[] args) {
        var c = 0;
        int getStone;
        String player;

        System.out.println("""
                ----------------------------------------------
                石取りゲームを開始します。
                石の総数：25個
                1度に取れる石の数：3個
                """);

        for (int i = 25 ; i > 0; c++) {
            player = Player.player(c);
            System.out.println("ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー");
            System.out.println("残り：" + i + "個");
            System.out.println(DisplayMark.mark(i));
            System.out.println("----------------------------------------------");
            System.out.println("プレイヤー " + player + " の番");
            System.out.println("石の数を入力してください。（1～3まで入力可能です。）");
            getStone = InNumber.inNumber();
            System.out.println("""
                    
                    """);
            i = i - getStone;
        }

        player = Player.player(c);
        System.out.println("勝者：プレイヤー " + player);
    }

}

