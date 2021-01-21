public class American extends Person {


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

    public static void main(String[] args){

        Person q = new Person(20, "Trump");
        Person.setTotalCount(10);
        Person.getTotalCount();
        System.out.println(q.name);
        q.name = "Biden";
        System.out.println(q.name);
        q.setName("Pence");
        System.out.println(q.name);

        
        Person p = new Person(69, "Putin");
        American a = new     American(74, "Trump");

        System.out.println(p.getName());
        System.out.println(a.getName());
        Object obj = new Object();
    }
}
