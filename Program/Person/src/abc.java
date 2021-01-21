public class abc {
    /*private static int age = 11111;
   static String name = "s";

    public abc(int age1, String name1){
        age = age1;
        name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    public static void main(String[] args){//static在任意时刻修改的都是同一个实例，修改过跟前面的值没有关系
        int age = 0;
        String name = "s";
        //abc test = new abc(2,"5");
        age =2;
        name ="5";
        System.out.println(age + name);
        //System.out.println(test.age + test.name);
    }
}
