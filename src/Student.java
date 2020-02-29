/*
*
* 子类不能重写父类private的方法
* */
public class Student extends  Person implements Work{

    private String subject;
//    public Student(String name, String age,String subject) {
//        super(name, age);
//        this.subject=subject;
//    }
    public Student() {
        super();
    }

    public Student(String name, String age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void UpWork() throws RuntimeException  {
        System.out.println("Student up Work");
    }


    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("STUDENT EAT");
    }
    @Override
    public void work() {
        System.out.println("STUDENT Work");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
