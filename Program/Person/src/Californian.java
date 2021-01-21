public class Californian extends American {

    public Californian(int age, String name){
        super(age, name);
    }

    public static void main(String[] args){
        Californian cal = new Californian(24, "Democrat");
        cal.greeting();
        cal.greetingUS();
    }
}
