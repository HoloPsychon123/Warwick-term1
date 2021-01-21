public class Person extends HomoSapien implements Speaker{

    /**
     * Part One: Class Variables
     * 1) Instance Variables(Fields), which are non-static.
     * 2) Static(Global) Variables.
     *
     * Access to a non-static property must be based on a class instance when outside the class(i.e. declare a new instance).
     * Access to a static property can be directly by prefixing the class name(i.e. Person.totalCount)
     * */

    /**
     * Direct Access: access with a dot
     * private: can only be directly accessed in this class
     * protected
     * (non):
     * public: can be directly accessed in any environment as long as you have imported this class.
     *
     * */

    //These are instance variables, unique with respect to each class instance.
    private int age;

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Person.totalCount = totalCount;
    }

    String name;
    String address;
    int[] memory;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getMemory() {
        return memory;
    }

    public void setMemory(int[] memory) {
        this.memory = memory;
    }

    //These are static variables, shared by all class instance(i.e. Object).
    private static int totalCount;
    static String classIdentifier;



    /**
     * Part Two: Class Functions(Methods)
     *
     *
     * - scope: a scope is a code block surrounded by {}
     * Every instance is accessible only in its scope;
     *
     * 1) non-static function
     *    non-static function provides a non-static scope.
     *    static function provides a static scope.
     * 2) static function
     * */


    //Constructor: public ClassName(Parameters...)
    public Person(){

    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    //Encapsulate: provide a public function to access private field.
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        //age = age
        this.age = age;
    }

    public void setAge2(int givenAge){
        age = givenAge;
    }

    public String getName(){
        return name;
    }

    //Syntax Sugar

    //If a function has return statement, it calculate an output as value.

    public int calcualteSomething(){
        String str = "a" + "b" + name;
        totalCount = 0;
        return age + 10 * 5 - 3;
    }

    public void setItOlder(int years){
        age += years;
    }

    //A static function can only access to 1) Parameters   2) Static Field
    public static int staticSum(int a, int b){
        return a + b;
    }

    //Call of a non-static function must be based on a class instance.
    public int sum(int a, int b){
        return a + b;
    }

    //If a function does not have return statement, it just process some manipulation.
    public void doSomething(){
        //int double float byte boolean long short char
        int a = 0; // Integer a = new Integer(0);
        Integer s = 5; // Integer a = new Integer(5);
        Double d = 0.5;
        Float f = 0.4f;
        Byte b = 1;
        Boolean boo = false;
        Long l = 1l;
    }

    //2020.12.1
    @Override
    public void greeting(){
        System.out.println("Hello, this is Person class.");
    }


    /**
     * Three important function: toString, equals, hashCode
     * */

    @Override
    public String toString(){
        return "name = " + name + "\nage = " + age + "\naddress = " + address;
    }

    //main function of a class is just a test environment.
    public static void main(String[] args){
        // Object class is father class of every class.
        System.out.println("Hello World");
        Person p = new Person(18, "Harris");
        HomoSapien hp = new Person(24, "HomoThemselves");
        Speaker sp = new Person(25, "asd");
        p.speak();
        p.shout();

    }

    @Override
    public void shout() {
        System.out.println("AAAAAAAAHHHHHHHHHH");
    }

    @Override
    public void speak() {
        System.out.println("aaaaaaaaaaa");
    }

    @Override
    public int something() {
        return 0;
    }
}
