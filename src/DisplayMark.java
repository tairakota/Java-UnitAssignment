public class DisplayMark {

    public static String mark(int num) {
        String stone = "";
        for (var i = 0; i < num; i++) {
            stone += "● ";
        }
        return stone;
    }
}
