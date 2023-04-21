public class StoneGame {

    public static void main(String[] args) {
        var c = 0;
        int getStone;
        String player;

        System.out.println("""
                ----------------------------------------------
                ※プレイヤー数：2名
                """);
        System.out.println("石取りゲームを開始します。");
        System.out.println("石の総数を指定してください。");
        int i = Setting.sumStone();
        System.out.println("1度に取れる石の数を指定してください。");
        int max = Setting.getStoneMax();
        System.out.println("プレイヤーを指定してください。");
        System.out.println("""
                石の記号を指定してください。
                1:◯　2:×　3:△　4:□　5:☆""");
        String stone = Setting.stoneType();


        for ( ; i > 0; c++) {
            player = Player.player(c);
            System.out.println("ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー");
            System.out.println("残り：" + i + "個");
            System.out.println(DisplayMark.mark(i,stone));
            System.out.println("----------------------------------------------");
            System.out.println("プレイヤー " + player + " の番");
            System.out.println("石の数を入力してください。（1～" + max + "まで入力可能です。）");
            getStone = GerStone.getStone(max);
            System.out.println("""
                    
                    """);
            i = i - getStone;
        }

        player = Player.player(c);
        System.out.println("勝者：プレイヤー " + player);
    }

}

