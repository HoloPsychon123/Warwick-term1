public class average {
    public static double[] pA(double[] x) {
        int n = x.length;
        double[] a = new double[n];
        for (int j = 0; j < n; j++) {
            double total = 0;
            for (int i = 0; i <= j; i++)
                total += x[i];
            a[j] = total / (j + 1);
        }
        return a;
    }

    public static void main(String[] args) {
        double[] b = {1, 2, 3, 5, 8, 4, 3};
        double[] result = pA(b);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
