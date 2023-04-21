import java.util.Scanner;

public class InNumber {
    public static int inNumber() {
        int num = 0;
        for (; ; ) {
            num = strsan();
            if (num > 0 && num < 4) {
                break;
            } else {
                System.out.println("1～3の間で入力してください。");
            }
        }
        return num;
    }

        public static int strsan() {
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            var s3 = Integer.parseInt(s1);

            return s3;
        }
    }
