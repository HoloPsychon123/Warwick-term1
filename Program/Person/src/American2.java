public class American extends Person {

    /**
     * No multi-inheritance
     * */

    /**
     * Father Class = Superior Class
     * Child Class = Inferior Class
     * */




    //Constructor
    public American(int age, String name){
        //super means, call the constructor of the one in its father class.
        super(age, name);
    }

    //Override a father class function
    /**
     * A rubric: when a child-class function has
     * same name and parameter and return type with
     * those of its father class,
     * write @Override in front of the re-written child-class function
     * */

    @Override
    public String getName(){
        return "Proud " + name;
    }

    public void greetingUS(){
        System.out.println("Hello, this is United States.");
    }

    /**
     * Overloading:
     * We can have several functions that share the same name
     * Java read two function as "same" by checking their PARAMETERS and FUNCTION_NAME
     * */
    public void run() {

    }
    public void run(int b, int a){

    }
    public int run(int a){
        return a;
    }

    /**
     * Overriding:
     * Rewrite a function that has been declared in father class.
     * */

    @Override
    public void greeting(){
        System.out.println("Hello, this is overridden American.");
    }

    public static void main(String[] args){

        American a = new American(74, "Trump");

        /**
         * Polymorphism:
         * Declare a father instance, but call the child's constructor.
         * This instance can only use functions been declared in father class.
         *
         * But, if a child class overrides a function in father class, the instance will
         * call the function declared in child class.
         * */
        Person b = new American(78, "Biden");
        b.greeting();



    }
}
