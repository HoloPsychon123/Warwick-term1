import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);//这个可以永远放在最前面
        String s1 = new String();
        String s2 = new String();
        int maxlen = 1000;
        int a[] = new int[maxlen];
        int c[] = new int[maxlen];
        int d[] = new int[maxlen];
        System.out.println("请输入一个数字串:");
        s1 = sa.next();
        System.out.println("请输入一个数字串:");
        s2 = sa.next();
        for (int i = 0; i < s1.length(); i++) {
            a[s1.length() - i - 1] = s1.charAt(i) - '0';
        }
        for (int i = 0; i < s2.length(); i++) {
            c[s2.length() - i - 1] = s2.charAt(i) - '0';
        }
        int len = 0;
        if (s1.length() >= s2.length()) {
            len = s1.length() + 1;
        } else {
            len = s2.length() + 1;
        }
        for (int i = 0; i < len; i++)
            d[i] = a[i] + c[i];
        for (int i = 0; i < len; i++) {
            if (d[i] >= 10) {
                d[i] = d[i] - 10;
                d[i + 1] = d[i + 1] + 1;
            } else {
                continue;
            }
        }
        if (d[len-1] == 0) {
            for (int i = 1; i < len; i++) {
                System.out.print(d[len - i - 1]);
            }
        }
        else{
            for (int i = 0; i < len; i++) {
                System.out.print(d[len - i - 1]);
            }
        }
    }
}

