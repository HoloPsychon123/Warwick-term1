public class d {
    public static void main(String[] args) {
        int s =10;
        int f[][] = new int[1000][1000];
        for(int j=1;j<=9;j++)
            f[1][j]=1;
        for (int i = 2 ; i <=s ; i++)
            for (int j = 1 ; j <= s ;j++)
                 for (int k = 1 ; k <= 9 ; k++){
                     if (j - k > 0)
                        f[i][j] += f[i-1][j-k];
                 }
        for(int i=1;i<=s;i++) {
            System.out.println("");//f[i][1]);
            for (int j = 1; j <= s; j++)
                System.out.print(f[i][j]+" ");
        }
    }
}
