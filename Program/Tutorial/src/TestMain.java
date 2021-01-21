import java.util.Scanner;

public class TestMain {

    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        //double a = sinput.nextDouble();
        //int b = sinput.nextInt();
        //int a = 1*1+2*2+3*3+4*4+5*5+6*6+7*7+8*8+9*9+10*10;
        /*int a = 0;
        for(int i=1;i<=100;i++){
           a = a + i*i;
        }*/
        /*int a =3;
        int b =4;
        int c =5;
        int d =6;
        a = a+b+c;//12
        System.out.println(a);
        a = a+b+c+d;//27
        a = a+d;//33*/
        /*int a = 0;
        for(int i=1;i<=10;i++){
            if(i%2==0)
            a = a + i*i;
        }*/
        //a = 2*2+4*4+6*6+8*8+10*10;
        /*System.out.println(1*1 + " " + 1*2 +" " + 1*3 + " " + 1*4 + " " + 1*5);
        System.out.println(2*1 + " " + 2*2 +" " + 2*3 + " " + 2*4 + " " + 2*5);
        System.out.println(3*1 + " " + 3*2 +" " + 3*3 + " " + 3*4 + " " + 3*5);
        System.out.println(4*1 + " " + 4*2 +" " + 4*3 + " " + 4*4 + " " + 4*5);
        System.out.println(5*1 + " " + 5*2 +" " + 5*3 + " " + 5*4 + " " + 5*5);
        int a = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++) {
                a =j * i;
                System.out.print(a + " ");
            }
            System.out.println();
        }*/
        /*int a=12%4;
        int b=12%5;
        System.out.print(a + "  " + b);*/
        /*int a = 37;
        boolean isPrime = true;
        for(int i=2;i<a;i++){
           if(a%i == 0)
               isPrime = false;
        }
        if(isPrime == true){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        int a = 37;*/
       /* for(int a=2;a<=100;a++) {
            boolean isPrime = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0)//说明a不是质数
                    isPrime = false;
            }
            if(isPrime == true){
                System.out.println(a);
            }
            else {

            }
        }*/
        TestMain c = new TestMain();
        // y = ax^2+b
        int x = 5;
        int n = 10;
        int y = c.f(n);
        System.out.println(y);
        //System.out.println();
     //System.out.println("Hello world");
    }
    public int f(int m) {
        //int a =2,b=3;
        //return a*x*x + b;
        int s=0;
        for(int i=1;i<=m;i++) {
            s = s + i;
        }
        return s;
    }

}
