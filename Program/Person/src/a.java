
public class a {
    public static int badScaleMarks(int  a, int b) {
        a = a + b;
        return a;
    }

    public static void main(String[] args){
        int mark = 40;
        int freeMarks = 30;
        System.out.println("Overall mark: " + badScaleMarks(mark, freeMarks));
    }
}