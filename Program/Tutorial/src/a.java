import java.util.Scanner;

public class a {
    /* public static void main(String[] args){dd
         System.out.println("     *");
         System.out.println("    * *");
         System.out.println("   * * *");
         System.out.println("  * * * *");
         System.out.println(" * * * * *");
         System.out.println("* * * * * *");
     }*/
    public static void main(String[] args) {
        System.out.print("请输入想打印的行数：");
        Scanner sinput = new Scanner(System.in);
        int n = sinput.nextInt();
        //时间复杂度：n*n（程序预期语句执行次数，一般与数据输入规模n的大小有关）
        //一般而言，采用O(N^2)的形式来表达它的时间复杂度。
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //如下时间复杂度为O(N),时间复杂度的计算中一般不包含常数项。
        //但是如果常数影响很大就需要记录，比如O(100*N).
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 10; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}