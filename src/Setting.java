public class Setting {

    public static int sumStone() {
        int num;
        for (; ; ) {
            num = Input.input();
            if (num >= 10 && num <= 100) {
                break;
            } else {
                System.out.println("10～100の間でお願いします...");
            }
        }
        return num;
    }

    public static int getStoneMax() {
        int num;
        for (; ; ) {
            num = Input.input();
            if (num >= 1 && num <= 10) {
                break;
            } else {
                System.out.println("1～10の間でお願いします...");
            }
        }
        return num;
    }

    public static String stoneType() {
        int num = 0;
        String type = "";
        for (;num < 1 || num > 5 ; ) {
            num = Input.input();
            if (num == 1) {
                type = "◯";
            } else if (num == 2) {
                type = "×";
            } else if (num == 3) {
                type = "△";
            } else if (num == 4) {
                type = "□";
            } else if (num == 5) {
                type = "☆";
            } else {
                System.out.println("1～5の間でお願いします...");
            }
        }
        return type;
    }
}
