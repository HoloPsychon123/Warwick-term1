import java.util.Scanner;
public class c{

    public static void main(String[] args){

        Scanner sa=new Scanner(System.in);
        int b = sa.nextInt();
        int a[] = new int[10];
        System.out.println("请输入第一组的10个数:");

        for(int i=0;i<10;i++){
            a[i]=b;
        }
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        int d[]=new int[10];
        System.out.println("请输入第一组的10个数:");

        for(int i=0;i<10;i++){
            d[i]=c;
        }
    }
}