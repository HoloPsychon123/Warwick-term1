import java.util.Scanner;

public class g {
    public static int calc(int sum,int n,int res){
        if(n==1)
            if(res<=0 || res>=10)
                return 0;
            else
                return sum*10+res;
        int total =0 ;
        for(int i=1;i<=9;i++){
            int t =res -i ;
            if(t<n-1||t>(n-1)*9)
                continue;
            total+= calc(sum*10+i,n-1,res-i);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int n=sa.nextInt();
        int total =0 ;
        for(int i=1;i<=n;i++){
           total=total+calc(0,i,n);
        }
        System.out.println(total);
    }
}
