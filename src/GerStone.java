public class GerStone {
    public static int getStone(int max) {
        int num = 0;
        for (; ; ) {
            num = Input.input();
            if (num > 0 && num <= max) {
                break;
            } else {
                System.out.println("1～" + max +"の間で入力してください。");
            }
        }
        return num;
    }
}
