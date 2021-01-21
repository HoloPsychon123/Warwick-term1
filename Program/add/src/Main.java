import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c[] = new int[3];
            int d = 0;
            int g = 0;
            for (int i = a; i <= b; i++) {
                int sum = 0;
                c[0] = i / 100;
                c[1] = i / 10 % 10;
                c[2] = i % 10;
                for (int z = 0; z < 3; z++) {
                    sum = sum + (int) Math.pow(c[z], 3);
                    if (i == sum && z==2 && g==0) {
                        System.out.print(i);
                        System.out.println("");
                        d = 1;
                        g = 1;
                    }
                    else if(i == sum && z==2 && g==1){
                        System.out.print(" " + i);
                        System.out.println("");
                        d = 1;
                    }
                }
            }
            if (d == 0) {
                System.out.println("no");
            }
        }
    }
}
