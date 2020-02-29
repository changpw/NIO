public class Main {
    /*
    * 多态针对方法来说编译看左边，运行看右边
    * 针对属性来说都是左边
    * */
    public static void main(String[] args) {
        System.out.println("***********");
        Person person = new Student();
        System.out.println(person.name);
        person.eat();
//        Person doctor = new Doctor("zs","15");
//        System.out.println(doctor.toString());

    }
}

