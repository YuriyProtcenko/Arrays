import java.util.Scanner;

public class Arrays2 {
    public static int numWords(String[] words, String meat) {
        int num = words.length;
        int num1, num2, num3, num4, num5;
        char ch;
        String tmp;

        num3 = 0;
        for (num1 = 0; num1 < num; num1++) {
            tmp = meat;
            num5 = 0;
            for (num2 = 0; num2 < words[num1].length(); num2++) {
                ch = words[num1].charAt(num2);
                num4 = tmp.indexOf(ch);

                if (num4 == -1) {
                    num5 = 1;
                    break;
                }
                tmp = tmp.replace(ch + "", "");
            }
            if (num5 == 0) {
                num3++;
            }

        }
        return num3;
    }

    public static void main(String[] args) {
        String[] str = {"anger", "awe", "joy", "love", "grief"};
        Scanner scanner = new Scanner(System.in);
        String txt;

        while (true) {
            txt = scanner.next();
            if (txt.equals("q")) break;
            System.out.print(txt + " == ");
            System.out.print(numWords(str, txt) + " feelings");
            scanner.close();
        }

    }
}


